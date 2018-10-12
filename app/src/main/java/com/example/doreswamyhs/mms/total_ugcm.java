package com.example.doreswamyhs.mms;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.spyhunter99.supertooltips.ToolTip;
import com.spyhunter99.supertooltips.ToolTipManager;

import org.json.JSONException;
import org.json.JSONObject;

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

public class total_ugcm extends AppCompatActivity {
    int val1,val2,val3,val4,val5,val6,val7,val8,val9,val10,val11,val12,val13,val14;
    String aval1,aval2,aval3,aval4,aval5,aval6,aval7,aval8,aval9,aval10,aval11,aval12,aval13,aval14;
    String tval1,tval2,tval3,tval4,tval5,tval6,tval7,tval8,tval9,tval10,tval11,tval12,tval13,tval14;
    String val_count[]={"1"};
    ListView listView;
    ToolTipManager tooltips;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total_ugcm);
        tooltips =new ToolTipManager(this);
        listView=findViewById(R.id.ls1);


        dispTask md=new dispTask();
        md.execute();
    }
    class CustomAdapter extends BaseAdapter {


        @Override
        public int getCount() {
            return val_count.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            view=getLayoutInflater().inflate(R.layout.customlayoutug,null);
            TextView txt0,txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9,txt10,txt11,txt12,txt13,txt14,txt15;

            txt0=view.findViewById(R.id.textView122);//id
            txt1=view.findViewById(R.id.textView6);//time

            txt2=view.findViewById(R.id.textView151);
            txt3=view.findViewById(R.id.textView152);
            txt4=view.findViewById(R.id.textView153);
            txt5=view.findViewById(R.id.textView154);
            txt6=view.findViewById(R.id.textView155);
            txt7=view.findViewById(R.id.textView156);
            txt8=view.findViewById(R.id.textView157);
            txt9=view.findViewById(R.id.textView158);
            txt10=view.findViewById(R.id.textView200);
            txt11=view.findViewById(R.id.textView159);
            txt12=view.findViewById(R.id.textView160);
            txt13=view.findViewById(R.id.textView161);
            txt14=view.findViewById(R.id.textView162);
            txt15=view.findViewById(R.id.textView163);




            txt0.setVisibility(view.INVISIBLE);
            txt1.setVisibility(view.INVISIBLE);


            txt2.setText(""+val1);
            txt3.setText(""+val2);
            txt4.setText(""+val3);
            txt5.setText(""+val4);
            txt6.setText(""+val5);
            txt7.setText(""+val6);
            txt8.setText(""+val7);
            txt9.setText(""+val8);
            txt10.setText(""+val9);
            txt11.setText(""+val10);
            txt12.setText(""+val11);
            txt13.setText(""+val12);
            txt14.setText(""+val13);
            txt15.setText(""+val14);

            //tooltips
            txt2.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    ToolTip toolTip = new ToolTip()
                            .withText("Total:"+tval1 +"\nAssigned:"+aval1)
                            .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                            .withShadow();

                    tooltips.showToolTip(toolTip, v);

                    return true;
                }
            });
            txt3.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    ToolTip toolTip = new ToolTip()
                            .withText("Total:"+tval2 +"\nAssigned:"+aval2)
                            .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                            .withShadow();
                    tooltips.showToolTip(toolTip, v);

                    return true;
                }
            });
            txt4.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    ToolTip toolTip = new ToolTip()
                            .withText("Total:"+tval3 +"\nAssigned:"+aval3)
                            .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                            .withShadow();
                    tooltips.showToolTip(toolTip, v);

                    return true;
                }
            });
            txt5.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    ToolTip toolTip = new ToolTip()
                            .withText("Total:"+tval4 +"\nAssigned:"+aval4)
                            .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                            .withShadow();
                    tooltips.showToolTip(toolTip, v);

                    return true;
                }
            });
            txt6.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    ToolTip toolTip = new ToolTip()
                            .withText("Total:"+tval5 +"\nAssigned:"+aval5)
                            .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                            .withShadow();
                    tooltips.showToolTip(toolTip, v);

                    return true;
                }
            });
            txt7.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    ToolTip toolTip = new ToolTip()
                            .withText("Total:"+tval6 +"\nAssigned:"+aval6)
                            .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                            .withShadow();
                    tooltips.showToolTip(toolTip, v);

                    return true;
                }
            });
            txt8.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    ToolTip toolTip = new ToolTip()
                            .withText("Total:"+tval7 +"\nAssigned:"+aval7)
                            .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                            .withShadow();
                    tooltips.showToolTip(toolTip, v);

                    return true;
                }
            });
            txt9.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    ToolTip toolTip = new ToolTip()
                            .withText("Total:"+tval8 +"\nAssigned:"+aval8)
                            .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                            .withShadow();
                    tooltips.showToolTip(toolTip, v);

                    return true;
                }
            });
            txt10.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    ToolTip toolTip = new ToolTip()
                            .withText("Total:"+tval9 +"\nAssigned:"+aval9)
                            .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                            .withShadow();
                    tooltips.showToolTip(toolTip, v);

                    return true;
                }
            });

            txt11.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    ToolTip toolTip = new ToolTip()
                            .withText("Total:"+tval10 +"\nAssigned:"+aval10)
                            .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                            .withShadow();
                    tooltips.showToolTip(toolTip, v);

                    return true;
                }
            });
            txt12.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    ToolTip toolTip = new ToolTip()
                            .withText("Total:"+tval11 +"\nAssigned:"+aval11)
                            .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                            .withShadow();
                    tooltips.showToolTip(toolTip, v);

                    return true;
                }
            });

            txt13.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    ToolTip toolTip = new ToolTip()
                            .withText("Total:"+tval12 +"\nAssigned:"+aval12)
                            .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                            .withShadow();
                    tooltips.showToolTip(toolTip, v);

                    return true;
                }
            });
            txt14.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    ToolTip toolTip = new ToolTip()
                            .withText("Total:"+tval13 +"\nAssigned:"+aval13)
                            .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                            .withShadow();
                    tooltips.showToolTip(toolTip, v);

                    return true;
                }
            });
            txt15.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    ToolTip toolTip = new ToolTip()
                            .withText("Total:"+tval14 +"\nAssigned:"+aval14)
                            .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                            .withShadow();
                    tooltips.showToolTip(toolTip, v);

                    return true;
                }
            });
            return view;
        }
    }
    class dispTask extends AsyncTask<String,Void,String>
    {String add_info_url;
        ProgressDialog progDailog;
        @Override
        protected void onPreExecute()
        {
            add_info_url="http://suphds.hostingerapp.com/total_displayug.php";
            progDailog = new ProgressDialog(total_ugcm.this);
            progDailog.setMessage("Loading...");
            progDailog.setIndeterminate(false);
            progDailog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progDailog.setCancelable(true);
            progDailog.show();
        }
        @Override
        protected String doInBackground(String... args)
        {
            try{
                URL url=new URL(add_info_url);

                HttpURLConnection httpURLConnection=(HttpURLConnection)url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                OutputStream outputStream=httpURLConnection.getOutputStream();

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

                    aval1=jsonObject.getString("a5_pair");
                    aval2=jsonObject.getString("a10_pair");
                    aval3=jsonObject.getString("a20_pair");
                    aval4=jsonObject.getString("a50_pair");
                    aval5=jsonObject.getString("a100_pair");
                    aval6=jsonObject.getString("a200_pair");
                    aval7=jsonObject.getString("a400_pair");
                    aval8=jsonObject.getString("a800_pair");
                    aval9=jsonObject.getString("adp_100_pr");
                    aval10=jsonObject.getString("adp_50_pr");
                    aval11=jsonObject.getString("agas_cylinder");
                    aval12=jsonObject.getString("arigide_module");
                    aval13=jsonObject.getString("atape");
                    aval14=jsonObject.getString("auy_connector");

                   tval1=jsonObject.getString("t5_pair");
                   tval2=jsonObject.getString("t10_pair");
                   tval3=jsonObject.getString("t20_pair");
                   tval4=jsonObject.getString("t50_pair");
                   tval5=jsonObject.getString("t100_pair");
                   tval6=jsonObject.getString("t200_pair");
                   tval7=jsonObject.getString("t400_pair");
                   tval8=jsonObject.getString("t800_pair");
                   tval9=jsonObject.getString("tdp_100_pr");
                   tval10=jsonObject.getString("tdp_50_pr");
                   tval11=jsonObject.getString("tgas_cylinder");
                   tval12=jsonObject.getString("trigide_module");
                   tval13=jsonObject.getString("ttape");
                   tval14=jsonObject.getString("tuy_connector");

                    Toast.makeText(getApplicationContext(),"Done",Toast.LENGTH_SHORT).show();
                    CustomAdapter customAdapter=new CustomAdapter();
                    listView.setAdapter(customAdapter);

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
    public void onDestroy() {
        super.onDestroy();
        tooltips.onDestroy();
        tooltips = null;
    }
}
