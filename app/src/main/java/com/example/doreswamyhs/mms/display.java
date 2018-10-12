package com.example.doreswamyhs.mms;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
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
import java.util.ArrayList;
import java.util.List;

public class display extends AppCompatActivity {
    int val1,val2,val3,val4,val5,val6,val7,val8,val9,val10,val11,val12,val13;
   String val_count[]={"1"};
    List<Subject> FibreListView;

    String id,what,val14;

    ListView listView;
    SwipeRefreshLayout swipeRefreshLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        TextView tv=findViewById(R.id.textView44);
        Bundle b=getIntent().getExtras();
        id=b.getString("str");
        tv.setText(id);



        listView=findViewById(R.id.ls1);


            maindispTask md=new maindispTask();
            md.execute(id);
         swipeRefreshLayout=findViewById(R.id.swiperefresh);
            swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
                @Override
                public void onRefresh() {
                    new Handler().postDelayed(new Runnable(){
                        @Override
                        public void run()
                        {
                            swipeRefreshLayout.setRefreshing(false);
                        }

                    },5000);
                    maindispTask md = new maindispTask();
                    md.execute(id);

                }
            });


            }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.others_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
switch (item.getItemId())
{
    case R.id.item1:
            what="1";
            dispTask dp1=new dispTask();
            dp1.execute(id,what);
            return true;
    case R.id.item2:
            what="0";
            dispTask dp2=new dispTask();
            dp2.execute(id,what);
            return true;
    case R.id.item3:
        what="2";
        dispTask dp3=new dispTask();
        dp3.execute(id,what);
        return true;
        default:
            return super.onOptionsItemSelected(item);
}

    }

    class CustomAdapter extends BaseAdapter{


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
                if(what.equals("1")) {
                    txt1.setText(val14);


                }
                else
                {
                    txt1.setVisibility(view.INVISIBLE);
                }


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
                return view;
        }
    }
    class MainAdapter extends BaseAdapter{


        @Override
        public int getCount() {
            return FibreListView.size();
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
            TextView txt0,txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9,txt10,txt11,txt12,txt13,txt14,txt15,txt16,txt17,txt18,txt19,txt20,txt21,txt22,txt23,txt24,txt25,txt26,txt27,txt28,txt29,txt30,txt31;

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


            txt0.setText(FibreListView.get(i).cof);
                txt1.setText(FibreListView.get(i).time);

                txt2.setText(FibreListView.get(i).fibre_in);
                txt3.setText(FibreListView.get(i).fibre_out);
                txt4.setText(FibreListView.get(i).ont_hu);
                txt5.setText(FibreListView.get(i).ont_hu300);
                txt6.setText(FibreListView.get(i).ont_nokia);
                txt7.setText(FibreListView.get(i).router_300);
                txt8.setText(FibreListView.get(i).router_dlink);
                txt9.setText(FibreListView.get(i).toto_link);
                txt10.setText(FibreListView.get(i).c_blue);
                txt11.setText(FibreListView.get(i).c_green);
                txt12.setText(FibreListView.get(i).instruments);
                txt13.setText(FibreListView.get(i).patch_cards);
                txt14.setText(FibreListView.get(i).zero_dp);
                return view;
        }
    }
    class dispTask extends AsyncTask<String,Void,String>
    {String add_info_url;
        ProgressDialog progDailog;
        @Override
        protected void onPreExecute()
        {
            add_info_url="http://suphds.hostingerapp.com/dispf.php";
            progDailog = new ProgressDialog(display.this);
            progDailog.setMessage("Loading...");
            progDailog.setIndeterminate(false);
            progDailog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progDailog.setCancelable(true);
            progDailog.show();
        }
        @Override
        protected String doInBackground(String... args)
        {String userid,what;
            userid=args[0];
            what=args[1];
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
                    if(!what.equals("2")) {
                        val14 = jsonObject.getString("time");
                    }


                    //Toast.makeText(getApplicationContext(),"Done",Toast.LENGTH_SHORT).show();
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
    class maindispTask extends AsyncTask<String,Void,String>
    {String add_info_url;
        ProgressDialog progDailog;
        @Override
        protected void onPreExecute()
        {
            add_info_url="http://suphds.hostingerapp.com/main_displayf.php";
            progDailog = new ProgressDialog(display.this);
            progDailog.setMessage("Loading...");
            progDailog.setIndeterminate(false);
            progDailog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progDailog.setCancelable(true);
            progDailog.show();
        }
        @Override
        protected String doInBackground(String... args)
        {String userid;
            userid=args[0];

            try{
                URL url=new URL(add_info_url);

                HttpURLConnection httpURLConnection=(HttpURLConnection)url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                OutputStream outputStream=httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(outputStream,"UTF-8"));
                String data_string= URLEncoder.encode("userid","UTF-8")+"="+URLEncoder.encode(userid,"UTF-8");

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
                FibreListView = new ArrayList<Subject>();
                if(success==1)
                { Subject subject;
                    JSONArray fin_data=jsonObject.getJSONArray("fin_data");
                    for(int i=0;i<fin_data.length();i++) {
                        JSONObject jsonObject1 = fin_data.getJSONObject(i);
                        subject=new Subject();
                        subject.cof=jsonObject1.getString("cof");
                        subject.fibre_in = jsonObject1.getString("fibre_in");
                        subject.fibre_out= jsonObject1.getString("fibre_out");
                        subject.ont_hu = jsonObject1.getString("ont_huwai");
                        subject.ont_hu300 = jsonObject1.getString("ont_huwai_300");
                        subject.ont_nokia = jsonObject1.getString("ont_nokia");
                        subject.router_300 = jsonObject1.getString("router_300");
                        subject.router_dlink = jsonObject1.getString("router_dlink");
                        subject.toto_link = jsonObject1.getString("toto_link");
                        subject.c_blue = jsonObject1.getString("connector_blue");
                        subject.c_green = jsonObject1.getString("connector_green");
                        subject.instruments = jsonObject1.getString("instruments");
                        subject.patch_cards = jsonObject1.getString("patch_cards");
                        subject.zero_dp = jsonObject1.getString("zero_dp");
                        subject.time = jsonObject1.getString("time");
                        FibreListView.add(subject);
                    }



                    //Toast.makeText(getApplicationContext(),"Done",Toast.LENGTH_SHORT).show();
                    MainAdapter mainAdapter=new MainAdapter();
                    listView.setAdapter(mainAdapter);


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
    public class Subject {
        public String cof;
        public String fibre_in;
        public String fibre_out;
        public String ont_hu;
        public String ont_hu300;
        public String ont_nokia;
        public String router_300;
        public String router_dlink;
        public String toto_link;
        public String c_blue;
        public String c_green;
        public String instruments;
        public String patch_cards;
        public String zero_dp;
        public String time;
    }
}
