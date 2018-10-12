package com.example.doreswamyhs.mms;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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

public class reset_pass extends AppCompatActivity {
TextView txt0;
EditText ed0,ed1,ed2;
String id,str1,str2,str3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_pass);
        txt0=findViewById(R.id.textView180);
        Bundle b=getIntent().getExtras();
        id=b.getString("userid");
        txt0.setText(id);
        ed0=findViewById(R.id.editText68);
        ed1=findViewById(R.id.editText69);
        ed2=findViewById(R.id.editText71);
        //submitting
        findViewById(R.id.button15).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str1=ed0.getText().toString();
                str2=ed1.getText().toString();
                str3=ed2.getText().toString();
                if(str1.isEmpty())
                {
                    Toast.makeText(getBaseContext(),"Please enter your old password", Toast.LENGTH_SHORT).show();
                    ed0.setText("");
                }
                else if(str2.isEmpty())
                {
                    Toast.makeText(getBaseContext(),"Please enter your new password", Toast.LENGTH_SHORT).show();
                    ed1.setText("");
                }
                else if(str3.isEmpty())
                {
                    Toast.makeText(getBaseContext(),"Please enter your new password", Toast.LENGTH_SHORT).show();
                    ed2.setText("");
                }
                else if(str2.equals(str3))
                {
                    BackgroundTask backgroundTask=new BackgroundTask();
                    backgroundTask.execute(id,str1,str2);
                }
                else
                {
                    Toast.makeText(getBaseContext(),"Passwords do not match", Toast.LENGTH_SHORT).show();
                    ed2.setText("");
                }
            }
        });

    }
    class BackgroundTask extends AsyncTask<String,Void,String>
    {String add_info_url;
        ProgressDialog progDailog;
        @Override
        protected void onPreExecute()
        {
            add_info_url="http://suphds.hostingerapp.com/reset.php";
            progDailog = new ProgressDialog(reset_pass.this);
            progDailog.setMessage("Loading...");
            progDailog.setIndeterminate(false);
            progDailog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progDailog.setCancelable(true);
            progDailog.show();
        }
        @Override
        protected String doInBackground(String... args)
        {String userid,pass,npass;
            userid=args[0];
            pass=args[1];
            npass=args[2];
            try{
                URL url=new URL(add_info_url);
                HttpURLConnection httpURLConnection=(HttpURLConnection)url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                OutputStream outputStream=httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(outputStream,"UTF-8"));
                String data_string= URLEncoder.encode("userid","UTF-8")+"="+URLEncoder.encode(userid,"UTF-8")+"&"+
                        URLEncoder.encode("password","UTF-8")+"="+URLEncoder.encode(pass,"UTF-8")+"&"+
                        URLEncoder.encode("npassword","UTF-8")+"="+URLEncoder.encode(npass,"UTF-8");
                bufferedWriter.write(data_string);
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStream.close();
                InputStream inputStream=httpURLConnection.getInputStream();
                BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(inputStream,"iso-8859-1"));
                String response="";
                String line="";
                line=bufferedReader.readLine();
                String line1=bufferedReader.readLine();
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
        protected void onProgressUpdate(Void... values)
        {
            super.onProgressUpdate(values);
        }
        @Override
        protected void onPostExecute(String result)
        { progDailog.dismiss();
            if(result.matches(".*\\btrue\\b.*"))
            {
                Toast.makeText(getBaseContext(), "Reset Password Successful", Toast.LENGTH_SHORT).show();
                finish();
            }
            else
            {
                Toast.makeText(getBaseContext(), "Your Old Password is not correct", Toast.LENGTH_SHORT).show();
               ed0.setText("");

            }
        }
    }
}
