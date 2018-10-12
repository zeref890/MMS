package com.example.doreswamyhs.mms;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.spyhunter99.supertooltips.ToolTip;
import com.spyhunter99.supertooltips.ToolTipManager;

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

import uk.co.deanwild.materialshowcaseview.MaterialShowcaseSequence;
import uk.co.deanwild.materialshowcaseview.ShowcaseConfig;

public class AssignCI extends AppCompatActivity {
    ToolTipManager tooltips;
    CheckBox cb4,cb2,cb3;
    EditText ed1,ed2,ed3,ed4,ed5,ed6;//5 and 6 are not in proper Order
   CheckBox rb1,rb2;
    int num2,num3,num4,num_tenda,num_vsdl;
    String id,len,status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assign_ci);
        tooltips =new ToolTipManager(this);
        TextView tv=findViewById(R.id.txt115);
        Bundle b=getIntent().getExtras();
        id=b.getString("str");
        status=b.getString("status");
        tv.setText(id);
        //showcase


        findViewById(R.id.ed159).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("Cable Length(mts)")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });

        findViewById(R.id.txt118).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("Tenda")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);

                return true;
            }
        });

        findViewById(R.id.txt123).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("VSDL CPE")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);

                return true;
            }
        });

        findViewById(R.id.ed160).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("Instrument(units)")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });


        findViewById(R.id.ed161).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("ROSETT BOX(1 WAY)")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });


        findViewById(R.id.ed162).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("ROSETT BOX(2 WAY)")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });

        CountDownTimer newtimer=new CountDownTimer(10000000,1000) {
            @Override
            public void onTick(long l) {
                TextView et=(TextView)findViewById(R.id.txt120);
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

        ed1=findViewById(R.id.ed159);
        cb2=findViewById(R.id.cb156);
        ed2=findViewById(R.id.ed160);
        cb3=findViewById(R.id.cb157);
        ed3=findViewById(R.id.ed161);
        cb4=findViewById(R.id.cb158);
        ed4=findViewById(R.id.ed162);
        rb1=findViewById(R.id.rb100);
        ed5=findViewById(R.id.txt118);
        rb2=findViewById(R.id.rb101);
        ed6=findViewById(R.id.txt123);
        findViewById(R.id.b104).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
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
                    String str=ed5.getText().toString();
                    try {
                        num_tenda = Integer.parseInt(str);

                    } catch (NumberFormatException e) {
                        //Put an alert Dialog
                        //Log.i("",str+" is not a number");
                    }
                }
                else
                {
                    num_tenda=0;
                }
                if(rb2.isChecked())
                {
                    String str=ed6.getText().toString();
                    try {
                        num_vsdl = Integer.parseInt(str);

                    } catch (NumberFormatException e) {
                        //Put an alert Dialog
                        //Log.i("",str+" is not a number");
                    }
                }
                else
                {
                    num_vsdl=0;
                }

                Calendar cal =Calendar.getInstance();
                DateFormat df=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                String date_str=df.format(cal.getTime());
                MyTaskParams myTaskParams=new MyTaskParams(id,len,num_tenda,num_vsdl,num2,num3,num4,date_str);

                BackgroundTask backgroundTask=new BackgroundTask();
                backgroundTask.execute(myTaskParams);

            }
        });
    }
    public void onDestroy() {
        super.onDestroy();
        tooltips.onDestroy();
        tooltips = null;
    }
    private static class MyTaskParams{
        String id,date_str,len;
        String num_tenda,num_vsdl,num2,num3,num4;
        MyTaskParams(String id,String len,int num_tenda,int num_vsdl,int num2,int num3,int num4,String date_str)
        {
            this.id=id;
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
            add_info_url="http://suphds.hostingerapp.com/assign_ci.php";
            progDailog = new ProgressDialog(AssignCI.this);
            progDailog.setMessage("Loading...");
            progDailog.setIndeterminate(false);
            progDailog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progDailog.setCancelable(true);
            progDailog.show();
        }
        @Override
        protected String doInBackground(MyTaskParams... args)
        {String userid,time,len;
            String num_tenda,num_vsdl,num2,num3,num4;
            userid=args[0].id;
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
                Toast.makeText(getBaseContext(), "Successfully Assigned ", Toast.LENGTH_SHORT).show();
                finish();
            }
            else if(result.matches(".*\\bNot enough stocks\\b.*"))
            {
                Toast.makeText(getBaseContext(), "Not enough stocks ", Toast.LENGTH_SHORT).show();
            }
            else if(result.matches(".*\\bNo Stocks Assigned\\b.*"))
            {
                Toast.makeText(getBaseContext(), "No Stocks Assigned", Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(getBaseContext(), "Error in assigning...", Toast.LENGTH_SHORT).show();

            }
        }
    }
}
