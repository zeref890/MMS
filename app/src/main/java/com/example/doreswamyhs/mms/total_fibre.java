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
import java.util.List;

public class total_fibre extends AppCompatActivity {
    int val1,val2,val3,val4,val5,val6,val7,val8,val9,val10,val11,val12,val13;
    String aval1,aval2,aval3,aval4,aval5,aval6,aval7,aval8,aval9,aval10,aval11,aval12,aval13;
    String tval1,tval2,tval3,tval4,tval5,tval6,tval7,tval8,tval9,tval10,tval11,tval12,tval13;
    String val_count[]={"1"};
    ListView listView;
    ToolTipManager tooltips;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total_fibre);
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

            view=getLayoutInflater().inflate(R.layout.customlayoutd,null);
            TextView txt0,txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9,txt10,txt11,txt12,txt13,txt14;

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

            return view;
        }
    }
    class dispTask extends AsyncTask<String,Void,String>
    {String add_info_url;
        ProgressDialog progDailog;
        @Override
        protected void onPreExecute()
        {
            add_info_url="http://suphds.hostingerapp.com/total_displayf.php";
            progDailog = new ProgressDialog(total_fibre.this);
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

                    aval1=jsonObject.getString("afibre_in");
                    aval2=jsonObject.getString("afibre_out");
                    aval3=jsonObject.getString("aont_hu");
                    aval4=jsonObject.getString("aont_hu300");
                    aval5=jsonObject.getString("aont_nokia");
                    aval6=jsonObject.getString("arouter_300");
                    aval7=jsonObject.getString("arouter_dlink");
                    aval8=jsonObject.getString("atoto_link");
                    aval9=jsonObject.getString("ac_blue");
                    aval10=jsonObject.getString("ac_green");
                    aval11=jsonObject.getString("ainstruments");
                    aval12=jsonObject.getString("apatch_cards");
                    aval13=jsonObject.getString("azero_dp");

                    tval1=jsonObject.getString("tfibre_in");
                    tval2=jsonObject.getString("tfibre_out");
                    tval3=jsonObject.getString("tont_hu");
                    tval4=jsonObject.getString("tont_hu300");
                    tval5=jsonObject.getString("tont_nokia");
                    tval6=jsonObject.getString("trouter_300");
                    tval7=jsonObject.getString("trouter_dlink");
                    tval8=jsonObject.getString("ttoto_link");
                    tval9=jsonObject.getString("tc_blue");
                    tval10=jsonObject.getString("tc_green");
                    tval11=jsonObject.getString("tinstruments");
                    tval12=jsonObject.getString("tpatch_cards");
                    tval13=jsonObject.getString("tzero_dp");




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
