package com.example.doreswamyhs.mms;

import android.app.ProgressDialog;
import android.content.Intent;
import android.hardware.Camera;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.CountDownTimer;
import android.os.Environment;
import android.os.Handler;
import android.provider.MediaStore;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.spyhunter99.supertooltips.ToolTip;
import com.spyhunter99.supertooltips.ToolTipManager;


import net.gotev.uploadservice.MultipartUploadRequest;
import net.gotev.uploadservice.UploadNotificationConfig;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
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
import java.util.Date;
import java.util.UUID;

import uk.co.deanwild.materialshowcaseview.MaterialShowcaseSequence;
import uk.co.deanwild.materialshowcaseview.ShowcaseConfig;

public class CopperInstallation extends AppCompatActivity {
    private static final String TAG="CopperInstallation";
    ToolTipManager tooltips;//needed
    static final int REQUEST_IMAGE_CAPTURE = 1;
    File photoFile = null;
    private String mCurrentPhotoPath,imgfn;
    String id,string,len;
    Boolean done=false;
    Boolean completed=false,cc=false;
    CheckBox cb4,cb2,cb3;
    EditText ed0,ed1,ed2,ed3,ed4;
    RadioButton rb1,rb2;
    int num2,num3,num4,num_tenda,num_vsdl;
    int val1,val2,val3,val4,val5,val6;//val2,3 not used yet search for appropriate way to display
    String SHOWCASE_ID="7705";
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_copper_installation);
        tooltips =new ToolTipManager(this);//needed
        TextView tv=findViewById(R.id.user);
        Bundle b=getIntent().getExtras();
        id=b.getString("Name");
        tv.setText(id);
        //showcase
        ShowcaseConfig config=new ShowcaseConfig();
        config.setDelay(500);
        MaterialShowcaseSequence sequence=new MaterialShowcaseSequence(this,SHOWCASE_ID);
        sequence.setConfig(config);
        sequence.addSequenceItem(tv,"This is your User ID","GOT IT");
        sequence.addSequenceItem(findViewById(R.id.textView41),"This is the current Date and Time","GOT IT");
        sequence.addSequenceItem(findViewById(R.id.editText67),"Long Press to get hint","GOT IT");
        sequence.addSequenceItem(findViewById(R.id.checkBox63),"Select the respective Check Box before Submit","GOT IT");
        sequence.start();
        //tooltips
        findViewById(R.id.instno).setOnLongClickListener(new View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {

                ToolTip toolTip = new ToolTip()
                        .withText("Installation number")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();

                tooltips.showToolTip(toolTip, v);

                

                return true;
            }
        });


        findViewById(R.id.cablelen).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("Length used(mts):"+val1)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });

        findViewById(R.id.editText67).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("Instrument(units):"+val4)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);

                return true;
            }
        });

        findViewById(R.id.textView28).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("Tenda:"+val2)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);

                return true;
            }
        });

        findViewById(R.id.textView29).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("VSDL CPE:"+val3)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);

                return true;
            }
        });


        findViewById(R.id.editText68).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("ROSETT BOX(1 WAY):"+val5)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });


        findViewById(R.id.editText69).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("ROSETT BOX(2 WAY):"+val6)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });
        radioGroup=findViewById(R.id.rg1);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton radioButton=findViewById(i);
                if(radioButton.isChecked())
                {
                    radioButton.setChecked(false);
                }
                else
                {
                    radioButton.setChecked(true);
                }
            }
        });

        dispTask dp=new dispTask();
        dp.execute(id);


        CountDownTimer newtimer=new CountDownTimer(10000000,1000) {
            @Override
            public void onTick(long l) {
                TextView et=(TextView)findViewById(R.id.textView41);
                Calendar cal =Calendar.getInstance();
                DateFormat df=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                String date_str=df.format(cal.getTime());
                et.setText(date_str);

            }

            @Override
            public void onFinish() {
                finish();

            }
        };
        newtimer.start();
        //upload database
        ed0=findViewById(R.id.instno);
        ed1=findViewById(R.id.cablelen);
        cb2=findViewById(R.id.checkBox63);
        ed2=findViewById(R.id.editText67);
        cb3=findViewById(R.id.checkBox64);
        ed3=findViewById(R.id.editText68);
        cb4=findViewById(R.id.checkBox65);
        ed4=findViewById(R.id.editText69);
        rb1=findViewById(R.id.radioButton);
        rb2=findViewById(R.id.radioButton2);
        findViewById(R.id.button15).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string=ed0.getText().toString();
                len=ed1.getText().toString();
                if(cb2.isChecked())
                {
                    String str=ed2.getText().toString();
                    try {
                        num2 = Integer.parseInt(str);

                    } catch (NumberFormatException e) {
                        //Put an alert Dialog
                        //Log.i("",str+" is not a number");
                    }

                }
                else
                {
                    num2=0;
                }
                if(cb3.isChecked())
                {
                    String str=ed3.getText().toString();
                    try {
                        num3 = Integer.parseInt(str);

                    } catch (NumberFormatException e) {
                        //Put an alert Dialog
                        //Log.i("",str+" is not a number");
                    }

                }
                else
                {
                    num3=0;
                }
                if(cb4.isChecked())
                {
                    String str=ed4.getText().toString();
                    try {
                        num4 = Integer.parseInt(str);

                    } catch (NumberFormatException e) {
                        //Put an alert Dialog
                        //Log.i("",str+" is not a number");
                    }

                }
                else
                {
                    num4=0;
                }
                if(rb1.isChecked())
                {
                    num_tenda=1;

                }
                else
                {
                    num_tenda=0;
                }
                if(rb2.isChecked())
                {
                    num_vsdl=1;

                }
                else
                {
                   num_vsdl=0;
                }

                Calendar cal =Calendar.getInstance();
                DateFormat df=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                String date_str=df.format(cal.getTime());
                MyTaskParams myTaskParams=new MyTaskParams(id,string,len,num_tenda,num_vsdl,num2,num3,num4,date_str);
                if(string.isEmpty())
                {
                    Toast.makeText(getBaseContext(),"Please enter Installation_No ", Toast.LENGTH_SHORT).show();
                    ed0.setText("");
                }
               /* else if(len.isEmpty())
                {
                    Toast.makeText(getBaseContext(),"Please enter Drop Wire Length Used ", Toast.LENGTH_SHORT).show();
                    ed1.setText("");
                }*/
                else {

                    BackgroundTask backgroundTask = new BackgroundTask();
                    backgroundTask.execute(myTaskParams);
                }
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.cin,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.item2:
                Intent intent=new Intent(getBaseContext(),reset_pass.class);
                intent.putExtra("userid",id);
                startActivity(intent);
                return true;
            case R.id.item3:

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    public void onDestroy() {
        super.onDestroy();
        tooltips.onDestroy();
        tooltips = null;
    }
    private File createImageFile() throws IOException {

        String timeStamp = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss").format(new Date());
        String imageFileName = id+"_"+ timeStamp + "_";
        File storageDir = Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES);
        File image = File.createTempFile(
                imageFileName,  // prefix
                ".jpg",         // suffix
                storageDir      // directory
        );


        mCurrentPhotoPath = image.getAbsolutePath();
        imgfn=image.getName();
        done=true;
        return image;

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK && photoFile!=null && mCurrentPhotoPath!=null && imgfn!=null && done && completed && isCameraUsebyApp())
        {Intent intent=new Intent(getBaseContext(),Submission.class);
            intent.putExtra("Name",id);
            intent.putExtra("no",string);
            intent.putExtra("path",mCurrentPhotoPath);
            intent.putExtra("on_no",imgfn);
            startActivity(intent);}
        else {
            Toast.makeText(getBaseContext(), "Please Take a Picture", Toast.LENGTH_SHORT).show();
            Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            if (cameraIntent.resolveActivity(getPackageManager()) != null) {

                try {
                    photoFile = createImageFile();


                } catch (IOException ex) {

                    Toast.makeText(getBaseContext(),"Error", Toast.LENGTH_SHORT).show();
                }

                if (photoFile != null ) {

                    if(Build.VERSION.SDK_INT >=24)
                    {
                        cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, FileProvider.getUriForFile(CopperInstallation.this,
                                BuildConfig.APPLICATION_ID + ".provider",
                                photoFile));
                    }
                    else
                    {
                        cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(photoFile));
                    }
                    startActivityForResult(cameraIntent, REQUEST_IMAGE_CAPTURE);
                    completed=true;


                }


            }
        }

    }



    private static class MyTaskParams{
        String id,date_str,string,len;
        String num_tenda,num_vsdl,num2,num3,num4;
        MyTaskParams(String id,String string,String len,int num_tenda,int num_vsdl,int num2,int num3,int num4,String date_str)
        {
            this.id=id;
            this.string=string;
            this.len=len;//remember to convert to int
            this.num_tenda=String.valueOf(num_tenda);
            this.num_vsdl=String.valueOf(num_vsdl);
            this.num2=String.valueOf(num2);
            this.num3=String.valueOf(num3);
            this.num4=String.valueOf(num4);
            this.date_str=date_str;

        }

    }
    class BackgroundTask extends AsyncTask<MyTaskParams,Void,String>
    {String add_info_url;
        ProgressDialog progDailog;
        @Override
        protected void onPreExecute()
        {
            add_info_url="http://suphds.hostingerapp.com/uci.php";
            progDailog = new ProgressDialog(CopperInstallation.this);
            progDailog.setMessage("Loading...");
            progDailog.setIndeterminate(false);
            progDailog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progDailog.setCancelable(true);
            progDailog.show();
        }
        @Override
        protected String doInBackground(MyTaskParams... args)
        {String userid,time,string,len;
            String num_tenda,num_vsdl,num2,num3,num4;
            userid=args[0].id;
            string=args[0].string;
            len=args[0].len;
            num_tenda=args[0].num_tenda;
            num_vsdl=args[0].num_vsdl;
            num2=args[0].num2;
            num3=args[0].num3;
            num4=args[0].num4;
            time=args[0].date_str;

            try{
                URL url=new URL(add_info_url);
                HttpURLConnection httpURLConnection=(HttpURLConnection)url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                OutputStream outputStream=httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(outputStream,"UTF-8"));
                String data_string= URLEncoder.encode("userid","UTF-8")+"="+URLEncoder.encode(userid,"UTF-8")+"&"+
                        URLEncoder.encode("installation_no","UTF-8")+"="+URLEncoder.encode(string,"UTF-8")+"&"+
                        URLEncoder.encode("dropWire","UTF-8")+"="+URLEncoder.encode(len,"UTF-8")+"&"+
                        URLEncoder.encode("tenda","UTF-8")+"="+URLEncoder.encode(num_tenda,"UTF-8")+"&"+
                        URLEncoder.encode("vsdl_cpe","UTF-8")+"="+URLEncoder.encode(num_vsdl,"UTF-8")+"&"+
                        URLEncoder.encode("instruments","UTF-8")+"="+URLEncoder.encode(num2,"UTF-8")+"&"+
                        URLEncoder.encode("rosett_box_1_way","UTF-8")+"="+URLEncoder.encode(num3,"UTF-8")+"&"+
                        URLEncoder.encode("rosett_box_2_way","UTF-8")+"="+URLEncoder.encode(num4,"UTF-8")+"&"+
                        URLEncoder.encode("time","UTF-8")+"="+URLEncoder.encode(time,"UTF-8");
                bufferedWriter.write(data_string);
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStream.close();
                InputStream inputStream=httpURLConnection.getInputStream();
                BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(inputStream,"iso-8859-1"));
                String response="";
                String line="";

                while((line=bufferedReader.readLine())!=null)
                { line=line.trim();

                    response+=line;
                }
                bufferedReader.close();
                inputStream.close();
                httpURLConnection.disconnect();
                return response;
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
        {   progDailog.dismiss();
            if(result.matches(".*\\btrue\\b.*"))
            {
                Toast.makeText(getBaseContext(), "Submission successful ", Toast.LENGTH_SHORT).show();
                ed0.setText("");
                ed1.setText("");
                ed2.setText("");
                ed3.setText("");
                ed4.setText("");
                if(cb2.isChecked())
                {
                    cb2.toggle();
                }
                if(cb3.isChecked())
                {
                    cb3.toggle();
                }
                if(cb4.isChecked())
                {
                    cb4.toggle();
                }
               if(rb1.isChecked()) {
                   rb2.toggle();
               }
                if(rb2.isChecked()) {
                    rb1.toggle();
                }
                Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                if (cameraIntent.resolveActivity(getPackageManager()) != null) {

                    try {
                        photoFile = createImageFile();


                    } catch (IOException ex) {

                        Toast.makeText(getBaseContext(),"Error", Toast.LENGTH_SHORT).show();
                    }

                    if (photoFile != null ) {

                        if(Build.VERSION.SDK_INT >=24)
                        {
                            cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, FileProvider.getUriForFile(CopperInstallation.this,
                                    BuildConfig.APPLICATION_ID + ".provider",
                                    photoFile));
                        }
                        else
                        {
                            cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(photoFile));
                        }
                        startActivityForResult(cameraIntent, REQUEST_IMAGE_CAPTURE);
                        completed=true;


                    }


                }

            }
            else if(result.matches(".*\\bExceeded limit\\b.*") || result.matches(".*\\bNothing Assigned\\b.*") )
            {
                Toast.makeText(getBaseContext(), "Not enough resources", Toast.LENGTH_SHORT).show();

            }
            else
            {
                Toast.makeText(getBaseContext(), "The INSTALLATION_NO is already in use", Toast.LENGTH_SHORT).show();
            }
        }
    }

    class dispTask extends AsyncTask<String,Void,String>
    {String add_info_url;
        ProgressDialog progDailog;
        @Override
        protected void onPreExecute()
        {
            add_info_url="http://suphds.hostingerapp.com/dispc.php";
            progDailog = new ProgressDialog(CopperInstallation.this);
            progDailog.setMessage("Loading...");
            progDailog.setIndeterminate(false);
            progDailog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progDailog.setCancelable(true);
            progDailog.show();
        }
        @Override
        protected String doInBackground(String... args)
        {String userid,what="0";
            userid=args[0];
            try{
                URL url=new URL(add_info_url);

                HttpURLConnection httpURLConnection=(HttpURLConnection)url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                OutputStream outputStream=httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(outputStream,"UTF-8"));
                String data_string= URLEncoder.encode("userid","UTF-8")+"="+URLEncoder.encode(userid,"UTF-8")+"&"+
                        URLEncoder.encode("what","UTF-8")+"="+URLEncoder.encode(what,"UTF-8");
                bufferedWriter.write(data_string);
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStream.close();
                InputStream inputStream=httpURLConnection.getInputStream();
                BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(inputStream,"iso-8859-1"));
                StringBuffer response=new StringBuffer();
                String line="";
                while((line=bufferedReader.readLine())!=null)
                {

                    response.append(line);
                }
                bufferedReader.close();
                inputStream.close();
                httpURLConnection.disconnect();
                String result=response.toString();
                return result;
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
        {progDailog.dismiss();
            try
            {
                JSONObject jsonObject=new JSONObject(result);
                int success=jsonObject.getInt("success");
                if(success==1)
                {
                    val1=jsonObject.getInt("ndropWire");
                    val2=jsonObject.getInt("ntenda");
                    val3=jsonObject.getInt("nvsdl_cpe");
                    val4=jsonObject.getInt("ninstruments");
                    val5=jsonObject.getInt("nrosett_box_1_way");
                    val6=jsonObject.getInt("nrosett_box_2_way");
                    //Toast.makeText(getApplicationContext(),"Done",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    Toast.makeText(getApplicationContext(),"No resouces assigned yet",Toast.LENGTH_SHORT).show();
                }

            }
            catch (JSONException e)
            {
                Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_SHORT).show();
            }
        }
    }
    public boolean isCameraUsebyApp() {
        Camera camera = null;
        try {
            camera = Camera.open();
        } catch (RuntimeException e) {
            return false;
        } finally {
            if (camera != null) camera.release();
        }
        return true;
    }
}
