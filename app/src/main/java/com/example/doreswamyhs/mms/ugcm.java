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

public class ugcm extends AppCompatActivity {
    ToolTipManager tooltips;
    static final int REQUEST_IMAGE_CAPTURE = 1;
    File photoFile = null;
    private String mCurrentPhotoPath,imgfn;
    String id,string;
    Boolean done=false;
    Boolean completed=false;
    CheckBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14;
    EditText ed0,ed1,ed2,ed3,ed4,ed5,ed6,ed7,ed8,ed9,ed10,ed11,ed12,ed13,ed14;
    int num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,num11,num12,num13,num14;
    int val1,val2,val3,val4,val5,val6,val7,val8,val9,val10,val11,val12,val13,val14;
    String SHOWCASE_ID="7707";
    boolean cc=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ugcm);
        tooltips =new ToolTipManager(this);
        TextView tv=findViewById(R.id.txt1);
        Bundle b=getIntent().getExtras();
        id=b.getString("Name");
        tv.setText(id);
        //showcase
        ShowcaseConfig config=new ShowcaseConfig();
        config.setDelay(500);
        MaterialShowcaseSequence sequence=new MaterialShowcaseSequence(this,SHOWCASE_ID);
        sequence.setConfig(config);
        sequence.addSequenceItem(tv,"This is your User ID","GOT IT");
        sequence.addSequenceItem(findViewById(R.id.textView5),"This is the current Date and Time","GOT IT");
        sequence.addSequenceItem(findViewById(R.id.editText12),"Long Press to get hint","GOT IT");
        sequence.addSequenceItem(findViewById(R.id.checkBox3),"Select the respective Check Box before Submit","GOT IT");
        sequence.start();

        //tooltips
        findViewById(R.id.serialno).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("Enter Serial Number")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });

        findViewById(R.id.editText12).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("5 Pair(in mts):"+val1)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });


        findViewById(R.id.editText13).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("10 Pair(in mts):"+val2)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });


        findViewById(R.id.editText14).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("20 Pair(in mts):"+val3)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });


        findViewById(R.id.editText15).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("50 Pair(in mts):"+val4)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });


        findViewById(R.id.editText16).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("100 Pair(in mts)"+val5)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });


        findViewById(R.id.editText17).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("200 Pair(in mts):"+val6)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });


        findViewById(R.id.editText18).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("400 Pair(in mts):"+val7)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });

        findViewById(R.id.editText18).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("800 Pair(in mts):"+val8)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);

                return true;
            }
        });


        findViewById(R.id.editText20).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("DP 100 pr(unit):"+val9)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });




        findViewById(R.id.editText21).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("DP 50 pr(unit):"+val10)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });




        findViewById(R.id.editText22).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("GAS CYLINDER(unit):"+val11)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });


        findViewById(R.id.editText23).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("Rigide Module(unit):"+val12)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });


        findViewById(R.id.editText24).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("Tape(unit):"+val13)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });


        findViewById(R.id.editText25).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("UY Connector(unit):"+val14)
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
                TextView et=(TextView)findViewById(R.id.textView5);
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
        ed0=findViewById(R.id.serialno);
        cb1=findViewById(R.id.checkBox3);
        ed1=findViewById(R.id.editText12);
        cb2=findViewById(R.id.checkBox4);
        ed2=findViewById(R.id.editText13);
        cb3=findViewById(R.id.checkBox5);
        ed3=findViewById(R.id.editText14);
        cb4=findViewById(R.id.checkBox6);
        ed4=findViewById(R.id.editText15);
        cb5=findViewById(R.id.checkBox7);
        ed5=findViewById(R.id.editText16);
        cb6=findViewById(R.id.checkBox8);
        ed6=findViewById(R.id.editText17);
        cb7=findViewById(R.id.checkBox25);
        ed7=findViewById(R.id.editText18);
        cb8=findViewById(R.id.checkBox26);
        ed8=findViewById(R.id.editText19);
        cb9=findViewById(R.id.checkBox27);
        ed9=findViewById(R.id.editText20);
        cb10=findViewById(R.id.checkBox28);
        ed10=findViewById(R.id.editText21);
        cb11=findViewById(R.id.checkBox29);
        ed11=findViewById(R.id.editText22);
        cb12=findViewById(R.id.checkBox30);
        ed12=findViewById(R.id.editText23);
        cb13=findViewById(R.id.checkBox31);
        ed13=findViewById(R.id.editText24);
        cb14=findViewById(R.id.checkBox32);
        ed14=findViewById(R.id.editText25);
        Button button=findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
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
                if(cb14.isChecked())
                {
                    String str=ed14.getText().toString();
                    try {
                        num14 = Integer.parseInt(str);

                    } catch (NumberFormatException e) {
                        //Put an alert Dialog
                        //Log.i("",str+" is not a number");
                    }

                }
                else
                {
                    num14=0;
                }
                Calendar cal =Calendar.getInstance();
                DateFormat df=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                String date_str=df.format(cal.getTime());
                MyTaskParams myTaskParams=new MyTaskParams(id,string,num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,num11,num12,num13,num14,date_str);
                if(string.isEmpty())
                {
                    Toast.makeText(getBaseContext(),"Please enter SERIAL_NO ", Toast.LENGTH_SHORT).show();
                    ed0.setText("");
                }
                else
                {
                BackgroundTask backgroundTask=new BackgroundTask();
                backgroundTask.execute(myTaskParams);
            }}
        });
    }
    public void onDestroy() {
        super.onDestroy();
        tooltips.onDestroy();
        tooltips = null;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.ug,menu);
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
        { Intent intent=new Intent(getBaseContext(),Submission.class);
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
                        cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, FileProvider.getUriForFile(ugcm.this,
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
        String id,date_str,string;
        String num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,num11,num12,num13,num14;
        MyTaskParams(String id,String string,int num1,int num2,int num3,int num4,int num5,int num6,int num7,int num8,int num9,int num10,int num11,int num12,int num13,int num14,String date_str)
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
            this.num14=String.valueOf(num14);
            this.date_str=date_str;

        }

    }
    class BackgroundTask extends AsyncTask<MyTaskParams,Void,String>
    {String add_info_url;
        ProgressDialog progDailog;
        @Override
        protected void onPreExecute()
        {
            add_info_url="http://suphds.hostingerapp.com/uug.php";
            progDailog = new ProgressDialog(ugcm.this);
            progDailog.setMessage("Loading...");
            progDailog.setIndeterminate(false);
            progDailog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progDailog.setCancelable(true);
            progDailog.show();
        }
        @Override
        protected String doInBackground(MyTaskParams... args)
        {String userid,time,string;
            String num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,num11,num12,num13,num14;
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
            num14=args[0].num14;
            time=args[0].date_str;

            try{
                URL url=new URL(add_info_url);
                HttpURLConnection httpURLConnection=(HttpURLConnection)url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                OutputStream outputStream=httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(outputStream,"UTF-8"));
                String data_string= URLEncoder.encode("userid","UTF-8")+"="+URLEncoder.encode(userid,"UTF-8")+"&"+
                        URLEncoder.encode("srno","UTF-8")+"="+URLEncoder.encode(string,"UTF-8")+"&"+
                        URLEncoder.encode("5_pair","UTF-8")+"="+URLEncoder.encode(num1,"UTF-8")+"&"+
                        URLEncoder.encode("10_pair","UTF-8")+"="+URLEncoder.encode(num2,"UTF-8")+"&"+
                        URLEncoder.encode("20_pair","UTF-8")+"="+URLEncoder.encode(num3,"UTF-8")+"&"+
                        URLEncoder.encode("50_pair","UTF-8")+"="+URLEncoder.encode(num4,"UTF-8")+"&"+
                        URLEncoder.encode("100_pair","UTF-8")+"="+URLEncoder.encode(num5,"UTF-8")+"&"+
                        URLEncoder.encode("200_pair","UTF-8")+"="+URLEncoder.encode(num6,"UTF-8")+"&"+
                        URLEncoder.encode("400_pair","UTF-8")+"="+URLEncoder.encode(num7,"UTF-8")+"&"+
                        URLEncoder.encode("800_pair","UTF-8")+"="+URLEncoder.encode(num8,"UTF-8")+"&"+
                        URLEncoder.encode("dp_100_pr","UTF-8")+"="+URLEncoder.encode(num9,"UTF-8")+"&"+
                        URLEncoder.encode("dp_50_pr","UTF-8")+"="+URLEncoder.encode(num10,"UTF-8")+"&"+
                        URLEncoder.encode("gas_cylinder","UTF-8")+"="+URLEncoder.encode(num11,"UTF-8")+"&"+
                        URLEncoder.encode("rigide_module","UTF-8")+"="+URLEncoder.encode(num12,"UTF-8")+"&"+
                        URLEncoder.encode("tape","UTF-8")+"="+URLEncoder.encode(num13,"UTF-8")+"&"+
                        URLEncoder.encode("uy_connector","UTF-8")+"="+URLEncoder.encode(num14,"UTF-8")+"&"+
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
        { progDailog.dismiss();
            if(result.matches(".*\\btrue\\b.*"))
            {
                Toast.makeText(getBaseContext(), "Submission Successful ", Toast.LENGTH_SHORT).show();
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
                ed14.setText("");
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
                if(cb14.isChecked())
                {
                    cb14.toggle();
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
                            cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, FileProvider.getUriForFile(ugcm.this,
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
            {    Toast.makeText(getBaseContext(), result, Toast.LENGTH_SHORT).show();
                Toast.makeText(getBaseContext(), "The SR_NO is already in use", Toast.LENGTH_SHORT).show();
            }
        }
    }
    class dispTask extends AsyncTask<String,Void,String>
    {String add_info_url;
        ProgressDialog progDailog;
        @Override
        protected void onPreExecute()
        {
            add_info_url="http://suphds.hostingerapp.com/dispug.php";
            progDailog = new ProgressDialog(ugcm.this);
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
                    val1=jsonObject.getInt("n5_pair");
                    val2=jsonObject.getInt("n10_pair");
                    val3=jsonObject.getInt("n20_pair");
                    val4=jsonObject.getInt("n50_pair");
                    val5=jsonObject.getInt("n100_pair");
                    val6=jsonObject.getInt("n200_pair");
                    val7=jsonObject.getInt("n400_pair");
                    val8=jsonObject.getInt("n800_pair");
                    val9=jsonObject.getInt("ndp_100_pr");
                    val10=jsonObject.getInt("ndp_50_pr");
                    val11=jsonObject.getInt("ngas_cylinder");
                    val12=jsonObject.getInt("nrigide_module");
                    val13=jsonObject.getInt("ntape");
                    val14=jsonObject.getInt("nuy_connector");
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
