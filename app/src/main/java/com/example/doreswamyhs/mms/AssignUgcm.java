package com.example.doreswamyhs.mms;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
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

public class AssignUgcm extends AppCompatActivity {
    ToolTipManager tooltips;
    String id,status;
    CheckBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14;
    EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7,ed8,ed9,ed10,ed11,ed12,ed13,ed14;
    int num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,num11,num12,num13,num14;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assign_ugcm);
        tooltips =new ToolTipManager(this);
        TextView tv=(TextView)findViewById(R.id.txt106);
        Bundle b=getIntent().getExtras();
        id=b.getString("str");
        status=b.getString("status");
        tv.setText(id);


        //tooltips
        findViewById(R.id.ed114).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("5 Pair(in mts)")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });


        findViewById(R.id.ed115).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("10 Pair(in mts)")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });


        findViewById(R.id.ed116).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("20 Pair(in mts)")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });


        findViewById(R.id.ed117).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("50 Pair(in mts)")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });


        findViewById(R.id.ed118).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("100 Pair(in mts)")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });


        findViewById(R.id.ed119).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("200 Pair(in mts)")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });


        findViewById(R.id.ed120).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("400 Pair(in mts)")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });


        findViewById(R.id.ed122).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("DP 100 pr(unit)")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });




        findViewById(R.id.ed123).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("DP 50 pr(unit)")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });




        findViewById(R.id.ed124).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("GAS CYLINDER(unit)")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });


        findViewById(R.id.ed125).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("Rigide Module(unit)")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });


        findViewById(R.id.ed126).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("Tape(unit)")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });


        findViewById(R.id.ed127).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("UY Connector(unit)")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });

        CountDownTimer newtimer=new CountDownTimer(10000000,1000) {
            @Override
            public void onTick(long l) {
                TextView et=(TextView)findViewById(R.id.txt109);
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
        cb1=findViewById(R.id.cb113);
        ed1=findViewById(R.id.ed114);
        cb2=findViewById(R.id.cb114);
        ed2=findViewById(R.id.ed115);
        cb3=findViewById(R.id.cb115);
        ed3=findViewById(R.id.ed116);
        cb4=findViewById(R.id.cb116);
        ed4=findViewById(R.id.ed117);
        cb5=findViewById(R.id.cb117);
        ed5=findViewById(R.id.ed118);
        cb6=findViewById(R.id.cb118);
        ed6=findViewById(R.id.ed119);
        cb7=findViewById(R.id.cb119);
        ed7=findViewById(R.id.ed120);
        cb8=findViewById(R.id.cb120);
        ed8=findViewById(R.id.ed121);
        cb9=findViewById(R.id.cb121);
        ed9=findViewById(R.id.ed122);
        cb10=findViewById(R.id.cb122);
        ed10=findViewById(R.id.ed123);
        cb11=findViewById(R.id.cb123);
        ed11=findViewById(R.id.ed124);
        cb12=findViewById(R.id.cb124);
        ed12=findViewById(R.id.ed125);
        cb13=findViewById(R.id.cb125);
        ed13=findViewById(R.id.ed126);
        cb14=findViewById(R.id.cb126);
        ed14=findViewById(R.id.ed127);
        Button button=findViewById(R.id.b102);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
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
                MyTaskParams myTaskParams=new MyTaskParams(id,num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,num11,num12,num13,num14,date_str);
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
        String id,date_str;
        String num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,num11,num12,num13,num14;
        MyTaskParams(String id,int num1,int num2,int num3,int num4,int num5,int num6,int num7,int num8,int num9,int num10,int num11,int num12,int num13,int num14,String date_str)
        {
            this.id=id;
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
            add_info_url="http://suphds.hostingerapp.com/assign_ug.php";
            progDailog = new ProgressDialog(AssignUgcm.this);
            progDailog.setMessage("Loading...");
            progDailog.setIndeterminate(false);
            progDailog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progDailog.setCancelable(true);
            progDailog.show();
        }
        @Override
        protected String doInBackground(MyTaskParams... args)
        {String userid,time;
            String num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,num11,num12,num13,num14;
            userid=args[0].id;
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
