package com.example.doreswamyhs.mms;

import android.app.ProgressDialog;
import android.content.Intent;


import android.hardware.Camera;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.CountDownTimer;
import android.os.Environment;

import android.provider.MediaStore;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
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

public class FibreInstallation extends AppCompatActivity {
    CheckBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13;
    EditText ed0,ed1,ed2,ed3,ed4,ed5,ed6,ed7,ed8,ed9,ed10,ed11,ed12,ed13;
    int num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,num11,num12,num13;
    int val1,val2,val3,val4,val5,val6,val7,val8,val9,val10,val11,val12,val13;
    String string;
boolean cc=false;

    static final int REQUEST_IMAGE_CAPTURE = 1;
    File photoFile = null;
    private String mCurrentPhotoPath,imgfn;
    String id;
    ToolTipManager tooltips;
    String SHOWCASE_ID="7700";
    Boolean done=false;
    Boolean completed=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fibre_installation);

        tooltips =new ToolTipManager(this);
        TextView tv=findViewById(R.id.userid);
        Bundle b=getIntent().getExtras();
        id=b.getString("Name");
        tv.setText(id);
        //showcase

        ShowcaseConfig config=new ShowcaseConfig();
        config.setDelay(500);
        MaterialShowcaseSequence sequence=new MaterialShowcaseSequence(this,SHOWCASE_ID);
        sequence.setConfig(config);
        sequence.addSequenceItem(tv,"This is your User ID","GOT IT");
        sequence.addSequenceItem(findViewById(R.id.textView40),"This is the current Date and Time","GOT IT");
        sequence.addSequenceItem(findViewById(R.id.editText70),"Long Press to get hint","GOT IT");
        sequence.addSequenceItem(findViewById(R.id.checkBox66),"Select the respective Check Box before Submit","GOT IT");
        sequence.start();



        //tooltips
        findViewById(R.id.editText70).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("Fibre Cable(INDOOR) mts:"+val1)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();

                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });
        findViewById(R.id.editText71).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("Fibre Cable(OUTDOOR) mts:"+val2)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });
        findViewById(R.id.textView33).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("ONT-Huwai:"+val3)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });
        findViewById(R.id.textView34).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("ONT-Huwai 300 Mbps:"+val4)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });
        findViewById(R.id.textView35).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("ONT-Nokia:"+val5)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });
        findViewById(R.id.textView36).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("ROUTER-300 Mbps:"+val6)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });
        findViewById(R.id.textView37).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("ROUTER-Dlink:"+val7)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });
        findViewById(R.id.textView38).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("Toto Link-100 Mbps:"+val8)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });
        findViewById(R.id.editText72).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("Connector-Blue(units):"+val9)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });

        findViewById(R.id.editText73).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("Connector-Green(units):"+val10)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });
        findViewById(R.id.editText74).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("Instrument(units):"+val11)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });

        findViewById(R.id.editText75).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("Patch Card(units):"+val12)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });
        findViewById(R.id.editText76).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("Zero DP(units):"+val13)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });
        dispTask dp=new dispTask();
        dp.execute(id);






        CountDownTimer newtimer=new CountDownTimer(10000000,1000) {
            @Override
            public void onTick(long l) {
                TextView et=findViewById(R.id.textView40);
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
        ed0=findViewById(R.id.textView42);
        cb1=findViewById(R.id.checkBox66);
        ed1=findViewById(R.id.editText70);
        cb2=findViewById(R.id.checkBox67);
        ed2=findViewById(R.id.editText71);
        cb3=findViewById(R.id.checkBox68);
        ed3=findViewById(R.id.textView33);
        cb4=findViewById(R.id.checkBox69);
        ed4=findViewById(R.id.textView34);
        cb5=findViewById(R.id.checkBox70);
        ed5=findViewById(R.id.textView35);
        cb6=findViewById(R.id.checkBox71);
        ed6=findViewById(R.id.textView36);
        cb7=findViewById(R.id.checkBox73);
        ed7=findViewById(R.id.textView37);
        cb8=findViewById(R.id.checkBox72);
        ed8=findViewById(R.id.textView38);
        cb9=findViewById(R.id.checkBox74);
        ed9=findViewById(R.id.editText72);
        cb10=findViewById(R.id.checkBox75);
        ed10=findViewById(R.id.editText73);
        cb11=findViewById(R.id.checkBox76);
        ed11=findViewById(R.id.editText74);
        cb12=findViewById(R.id.checkBox77);
        ed12=findViewById(R.id.editText75);
        cb13=findViewById(R.id.checkBox78);
        ed13=findViewById(R.id.editText76);
        findViewById(R.id.button16).setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               string=ed0.getText().toString();
               if(cb1.isChecked())
               {
                   String str=ed1.getText().toString();
                   try {
                       num1 = Integer.parseInt(str);

                   } catch (NumberFormatException e) {
                       //Put an alert Dialog
                       //Log.i("",str+" is not a number");
                   }

               }
               else
               {
                   num1=0;
               }
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
               if(cb5.isChecked())
               {
                   String str=ed5.getText().toString();
                   try {
                       num5 = Integer.parseInt(str);

                   } catch (NumberFormatException e) {
                       //Put an alert Dialog
                       //Log.i("",str+" is not a number");
                   }

               }
               else
               {
                   num5=0;
               }
               if(cb6.isChecked())
               {
                   String str=ed6.getText().toString();
                   try {
                       num6 = Integer.parseInt(str);

                   } catch (NumberFormatException e) {
                       //Put an alert Dialog
                       //Log.i("",str+" is not a number");
                   }

               }
               else
               {
                   num6=0;
               }
               if(cb7.isChecked())
               {
                   String str=ed7.getText().toString();
                   try {
                       num7 = Integer.parseInt(str);

                   } catch (NumberFormatException e) {
                       //Put an alert Dialog
                       //Log.i("",str+" is not a number");
                   }

               }
               else
               {
                   num7=0;
               }
               if(cb8.isChecked())
               {
                   String str=ed8.getText().toString();
                   try {
                       num8 = Integer.parseInt(str);

                   } catch (NumberFormatException e) {
                       //Put an alert Dialog
                       //Log.i("",str+" is not a number");
                   }

               }
               else
               {
                   num8=0;
               }
               if(cb9.isChecked())
               {
                   String str=ed9.getText().toString();
                   try {
                       num9 = Integer.parseInt(str);

                   } catch (NumberFormatException e) {
                       //Put an alert Dialog
                       //Log.i("",str+" is not a number");
                   }

               }
               else
               {
                   num9=0;
               }
               if(cb10.isChecked())
               {
                   String str=ed10.getText().toString();
                   try {
                       num10 = Integer.parseInt(str);

                   } catch (NumberFormatException e) {
                       //Put an alert Dialog
                       //Log.i("",str+" is not a number");
                   }

               }
               else
               {
                   num10=0;
               }
               if(cb11.isChecked())
               {
                   String str=ed11.getText().toString();
                   try {
                       num11 = Integer.parseInt(str);

                   } catch (NumberFormatException e) {
                       //Put an alert Dialog
                       //Log.i("",str+" is not a number");
                   }

               }
               else
               {
                   num11=0;
               }
               if(cb12.isChecked())
               {
                   String str=ed12.getText().toString();
                   try {
                       num12 = Integer.parseInt(str);

                   } catch (NumberFormatException e) {
                       //Put an alert Dialog
                       //Log.i("",str+" is not a number");
                   }

               }
               else
               {
                   num12=0;
               }
               if(cb13.isChecked())
               {
                   String str=ed13.getText().toString();
                   try {
                       num13 = Integer.parseInt(str);

                   } catch (NumberFormatException e) {
                       //Put an alert Dialog
                       //Log.i("",str+" is not a number");
                   }

               }
               else
               {
                   num13=0;
               }
               Calendar cal =Calendar.getInstance();
               DateFormat df=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
               String date_str=df.format(cal.getTime());
               MyTaskParams myTaskParams=new MyTaskParams(id,string,num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,num11,num12,num13,date_str);
               if(string.isEmpty())
               {
                   Toast.makeText(getBaseContext(),"Please enter COF_NO ", Toast.LENGTH_SHORT).show();
                   ed0.setText("");
               }
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
        menuInflater.inflate(R.menu.fin,menu);
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
                        cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, FileProvider.getUriForFile(FibreInstallation.this,
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



    public void onDestroy() {
        super.onDestroy();
        tooltips.onDestroy();
        tooltips = null;
    }

    private static class MyTaskParams{
        String id,date_str,string;
        String num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,num11,num12,num13;
        MyTaskParams(String id,String string,int num1,int num2,int num3,int num4,int num5,int num6,int num7,int num8,int num9,int num10,int num11,int num12,int num13,String date_str)
        {
            this.id=id;
            this.string=string;
            this.num1=String.valueOf(num1);
            this.num2=String.valueOf(num2);
            this.num3=String.valueOf(num3);
            this.num4=String.valueOf(num4);
            this.num5=String.valueOf(num5);
            this.num6=String.valueOf(num6);
            this.num7=String.valueOf(num7);
            this.num8=String.valueOf(num8);
            this.num9=String.valueOf(num9);
            this.num10=String.valueOf(num10);
            this.num11=String.valueOf(num11);
            this.num12=String.valueOf(num12);
            this.num13=String.valueOf(num13);
            this.date_str=date_str;

        }

    }
    class BackgroundTask extends AsyncTask<MyTaskParams,Void,String>
    {String add_info_url;
        ProgressDialog progDailog;
        @Override
        protected void onPreExecute()
        {
            add_info_url="http://suphds.hostingerapp.com/ufi.php";
            progDailog = new ProgressDialog(FibreInstallation.this);
            progDailog.setMessage("Loading...");
            progDailog.setIndeterminate(false);
            progDailog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progDailog.setCancelable(true);
            progDailog.show();
        }
        @Override
        protected String doInBackground(MyTaskParams... args)
        {String userid,time,string;
            String num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,num11,num12,num13;
            userid=args[0].id;
            string=args[0].string;
            num1=args[0].num1;
            num2=args[0].num2;
            num3=args[0].num3;
            num4=args[0].num4;
            num5=args[0].num5;
            num6=args[0].num6;
            num7=args[0].num7;
            num8=args[0].num8;
            num9=args[0].num9;
            num10=args[0].num10;
            num11=args[0].num11;
            num12=args[0].num12;
            num13=args[0].num13;
            time=args[0].date_str;

            try{
                URL url=new URL(add_info_url);
                HttpURLConnection httpURLConnection=(HttpURLConnection)url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                OutputStream outputStream=httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(outputStream,"UTF-8"));
                String data_string= URLEncoder.encode("userid","UTF-8")+"="+URLEncoder.encode(userid,"UTF-8")+"&"+
                        URLEncoder.encode("cof","UTF-8")+"="+URLEncoder.encode(string,"UTF-8")+"&"+
                        URLEncoder.encode("fibre_in","UTF-8")+"="+URLEncoder.encode(num1,"UTF-8")+"&"+
                        URLEncoder.encode("fibre_out","UTF-8")+"="+URLEncoder.encode(num2,"UTF-8")+"&"+
                        URLEncoder.encode("ont_hu","UTF-8")+"="+URLEncoder.encode(num3,"UTF-8")+"&"+
                        URLEncoder.encode("ont_hu300","UTF-8")+"="+URLEncoder.encode(num4,"UTF-8")+"&"+
                        URLEncoder.encode("ont_nokia","UTF-8")+"="+URLEncoder.encode(num5,"UTF-8")+"&"+
                        URLEncoder.encode("router_300","UTF-8")+"="+URLEncoder.encode(num6,"UTF-8")+"&"+
                        URLEncoder.encode("router_dlink","UTF-8")+"="+URLEncoder.encode(num7,"UTF-8")+"&"+
                        URLEncoder.encode("toto_link","UTF-8")+"="+URLEncoder.encode(num8,"UTF-8")+"&"+
                        URLEncoder.encode("c_blue","UTF-8")+"="+URLEncoder.encode(num9,"UTF-8")+"&"+
                        URLEncoder.encode("c_green","UTF-8")+"="+URLEncoder.encode(num10,"UTF-8")+"&"+
                        URLEncoder.encode("instruments","UTF-8")+"="+URLEncoder.encode(num11,"UTF-8")+"&"+
                        URLEncoder.encode("patch_cards","UTF-8")+"="+URLEncoder.encode(num12,"UTF-8")+"&"+
                        URLEncoder.encode("zero_dp","UTF-8")+"="+URLEncoder.encode(num13,"UTF-8")+"&"+
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
            ed5.setText("");
            ed6.setText("");
            ed7.setText("");
            ed8.setText("");
            ed9.setText("");
            ed10.setText("");
            ed11.setText("");
            ed12.setText("");
            ed13.setText("");
            if(cb1.isChecked())
            {
                cb1.toggle();
            }
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
            if(cb5.isChecked())
            {
                cb5.toggle();
            }
            if(cb6.isChecked())
            {
                cb6.toggle();
            }
            if(cb7.isChecked())
            {
                cb7.toggle();
            }
            if(cb8.isChecked())
            {
                cb8.toggle();
            }
            if(cb9.isChecked())
            {
                cb9.toggle();
            }
            if(cb10.isChecked())
            {
                cb10.toggle();
            }
            if(cb11.isChecked())
            {
                cb11.toggle();
            }
            if(cb12.isChecked())
            {
                cb12.toggle();
            }
            if(cb13.isChecked())
            {
                cb13.toggle();
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
                        cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, FileProvider.getUriForFile(FibreInstallation.this,
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
                Toast.makeText(getBaseContext(), "The COF_NO is already in use", Toast.LENGTH_SHORT).show();
            }
        }
    }

    class dispTask extends AsyncTask<String,Void,String>
    {String add_info_url;
        ProgressDialog progDailog;
        @Override
        protected void onPreExecute()
        {
            add_info_url="http://suphds.hostingerapp.com/dispf.php";
            progDailog = new ProgressDialog(FibreInstallation.this);
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
                 val1=jsonObject.getInt("nfibre_in");
                 val2=jsonObject.getInt("nfibre_out");
                 val3=jsonObject.getInt("nont_hu");
                 val4=jsonObject.getInt("nont_hu300");
                 val5=jsonObject.getInt("nont_nokia");
                 val6=jsonObject.getInt("nrouter_300");
                 val7=jsonObject.getInt("nrouter_dlink");
                 val8=jsonObject.getInt("ntoto_link");
                 val9=jsonObject.getInt("nc_blue");
                 val10=jsonObject.getInt("nc_green");
                 val11=jsonObject.getInt("ninstruments");
                 val12=jsonObject.getInt("npatch_cards");
                 val13=jsonObject.getInt("nzero_dp");
                 Toast.makeText(getApplicationContext(),"Done",Toast.LENGTH_SHORT).show();

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

