package com.example.doreswamyhs.mms;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.spyhunter99.supertooltips.ToolTip;
import com.spyhunter99.supertooltips.ToolTipManager;

import net.gotev.uploadservice.MultipartUploadRequest;
import net.gotev.uploadservice.ServerResponse;
import net.gotev.uploadservice.UploadInfo;
import net.gotev.uploadservice.UploadNotificationConfig;
import net.gotev.uploadservice.UploadStatusDelegate;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.UUID;

public class Submission extends AppCompatActivity {
    String id,no,comment,name;
    EditText ed;
    String mCurrentPhotoPath,imgfn;
    boolean success=false;
    boolean one=true,two=false;
    ToolTipManager tooltips;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submission);
        TextView tv=findViewById(R.id.editText6);
        tooltips =new ToolTipManager(this);
        Bundle b=getIntent().getExtras();
        id=b.getString("Name");
        no=b.getString("no");
        mCurrentPhotoPath=b.getString("path");
        imgfn=b.getString("on_no");
        tv.setText(id);
        ed=findViewById(R.id.editText7);
        ed.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("Do not enter ' or double quotes ")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);

                return true;
            }
        });
        if(id.charAt(0)=='U' && id.charAt(1)=='G'){

         name="UG";
        }
        else if(id.charAt(0)=='P'){
            name="P";

        }
        else if(id.charAt(0)=='C' && id.charAt(1)=='I' && id.charAt(2)=='N'){
            name="CIN";

        }
        else {
            name="FIN";

        }

        findViewById(R.id.button5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                comment=ed.getText().toString();

                if(one)
                {
                    uploadMultipart();

                    two=true;
                }
                else if(two && success)
                {
                    BackgroundTask bt=new BackgroundTask();
                    bt.execute(id,no,comment,name);

                }

            }
        });

    }
    public void uploadMultipart() {

        try {
            Calendar cal =Calendar.getInstance();
            DateFormat df=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            String timeStamp=df.format(cal.getTime());
            String uploadId = UUID.randomUUID().toString();



            new MultipartUploadRequest(this, uploadId,"http://suphds.hostingerapp.com/imgupload.php")
                    .addFileToUpload(mCurrentPhotoPath, "image")
                    .setNotificationConfig(new UploadNotificationConfig())
                    .addParameter("on_no",no)
                    .addParameter("name",name)
                    .addParameter("userid",id)
                    .addParameter("time",timeStamp)
                    .addParameter("caption",imgfn)
                    .setMaxRetries(2)
                    .setDelegate(new UploadStatusDelegate() {
                        @Override
                        public void onProgress(Context context, UploadInfo uploadInfo) {

                        }

                        @Override
                        public void onError(Context context, UploadInfo uploadInfo, ServerResponse serverResponse, Exception exception) {
                         Toast.makeText(getBaseContext(),"Image Upload Failed,Please try again",Toast.LENGTH_SHORT).show();
                        }

                        @Override
                        public void onCompleted(Context context, UploadInfo uploadInfo, ServerResponse serverResponse) {
                            success=true;
                            BackgroundTask backgroundTask=new BackgroundTask();
                            backgroundTask.execute(id,no,comment,name);
                            one=false;
                        }

                        @Override
                        public void onCancelled(Context context, UploadInfo uploadInfo) {

                        }
                    })
                    .startUpload();
        } catch (Exception exc) {
            Toast.makeText(this, exc.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    class BackgroundTask extends AsyncTask<String,Void,String> {
        String add_info_url;

        @Override
        protected void onPreExecute() {
            add_info_url = "http://suphds.hostingerapp.com/feedback.php";
        }

        @Override
        protected String doInBackground(String... args) {
            String userid, no, comment, name;
            userid = args[0];
            no = args[1];
            comment = args[2];
            name = args[3];
            try {
                URL url = new URL(add_info_url);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                OutputStream outputStream = httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
                String data_string = URLEncoder.encode("userid", "UTF-8") + "=" + URLEncoder.encode(userid, "UTF-8") + "&" +
                        URLEncoder.encode("on_no", "UTF-8") + "=" + URLEncoder.encode(no, "UTF-8") + "&" +
                        URLEncoder.encode("name", "UTF-8") + "=" + URLEncoder.encode(name, "UTF-8") + "&" +
                        URLEncoder.encode("comments", "UTF-8") + "=" + URLEncoder.encode(comment, "UTF-8");

                bufferedWriter.write(data_string);
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStream.close();
                InputStream inputStream = httpURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "iso-8859-1"));
                String response = "";
                String line = "";
                line = bufferedReader.readLine();
                String line1 = bufferedReader.readLine();
                /*while((line=bufferedReader.readLine())!=null)
                { line=line.trim();

                 response+=line;
                }*/
                bufferedReader.close();
                inputStream.close();
                httpURLConnection.disconnect();
                return line;
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onProgressUpdate(Void... values) {
            super.onProgressUpdate(values);
        }

        @Override
        protected void onPostExecute(String result) {
            if (result.matches(".*\\btrue\\b.*")) {
                Toast.makeText(getBaseContext(), "Successfully Submitted", Toast.LENGTH_SHORT).show();
                ed.setText("");
                Intent intent=new Intent(getBaseContext(),Login.class);
                startActivity(intent);
                }
                else
            {
                Toast.makeText(getBaseContext(), "Error", Toast.LENGTH_SHORT).show();
                ed.setText("");
            }
        }
    }
    public void onDestroy() {
        super.onDestroy();
        tooltips.onDestroy();
        tooltips = null;
    }
}
