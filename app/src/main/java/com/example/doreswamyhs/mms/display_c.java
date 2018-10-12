package com.example.doreswamyhs.mms;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

public class display_c extends AppCompatActivity {
    int val1,val2,val3,val4,val5,val6;
    String val_count[]={"1"};
    List<Subject> CopperListView;

    String id,what,val7;

    ListView listView;
    SwipeRefreshLayout swipeRefreshLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_c);
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
        switch (item.getItemId()) {
            case R.id.item1:
                what = "1";
                dispTask dp1 = new dispTask();
                dp1.execute(id, what);
                return true;
            case R.id.item2:
                what = "0";
                dispTask dp2 = new dispTask();
                dp2.execute(id, what);
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

            view=getLayoutInflater().inflate(R.layout.customlayoutc,null);
            TextView txt0,txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8;

            txt0=view.findViewById(R.id.textView122);//id
            txt1=view.findViewById(R.id.textView6);//time

            txt2=view.findViewById(R.id.textView151);
            txt3=view.findViewById(R.id.textView152);
            txt4=view.findViewById(R.id.textView153);
            txt5=view.findViewById(R.id.textView154);
            txt6=view.findViewById(R.id.textView155);
            txt7=view.findViewById(R.id.textView156);



            txt0.setVisibility(view.INVISIBLE);
            if(what.equals("1")) {
                txt1.setText(val7);


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


            return view;
        }
    }
    class MainAdapter extends BaseAdapter{


        @Override
        public int getCount() {
            return CopperListView.size();
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

            view=getLayoutInflater().inflate(R.layout.customlayoutc,null);
            TextView txt0,txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8;
            txt0=view.findViewById(R.id.textView122);//id
            txt1=view.findViewById(R.id.textView6);//time

            txt2=view.findViewById(R.id.textView151);
            txt3=view.findViewById(R.id.textView152);
            txt4=view.findViewById(R.id.textView153);
            txt5=view.findViewById(R.id.textView154);
            txt6=view.findViewById(R.id.textView155);
            txt7=view.findViewById(R.id.textView156);


            txt0.setText(CopperListView.get(i).installation_no);
            txt1.setText(CopperListView.get(i).time);

            txt2.setText(CopperListView.get(i).dropWire);
            txt3.setText(CopperListView.get(i).tenda);
            txt4.setText(CopperListView.get(i).vsdl_cpe);
            txt5.setText(CopperListView.get(i).instruments);
            txt6.setText(CopperListView.get(i).rosett_box_1_way);
            txt7.setText(CopperListView.get(i).rosett_box_2_way);

            return view;
        }
    }
    class dispTask extends AsyncTask<String,Void,String>
    {String add_info_url;
        ProgressDialog progDailog;
        @Override
        protected void onPreExecute()
        {
            add_info_url="http://suphds.hostingerapp.com/dispc.php";
            progDailog = new ProgressDialog(display_c.this);
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
                    val1=jsonObject.getInt("ndropWire");
                    val2=jsonObject.getInt("ntenda");
                    val3=jsonObject.getInt("nvsdl_cpe");
                    val4=jsonObject.getInt("ninstruments");
                    val5=jsonObject.getInt("nrosett_box_1_way");
                    val6=jsonObject.getInt("nrosett_box_2_way");
                    if(!what.equals("2")) {
                        val7 = jsonObject.getString("time");
                    }
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
    class maindispTask extends AsyncTask<String,Void,String>
    {String add_info_url;
        ProgressDialog progDailog;
        @Override
        protected void onPreExecute()
        {
            add_info_url="http://suphds.hostingerapp.com/main_displayc.php";
            progDailog = new ProgressDialog(display_c.this);
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
                CopperListView = new ArrayList<Subject>();
                if(success==1)
                { Subject subject;
                    JSONArray cin_data=jsonObject.getJSONArray("cin_data");
                    for(int i=0;i<cin_data.length();i++) {
                        JSONObject jsonObject1 = cin_data.getJSONObject(i);
                        subject=new Subject();
                        subject.installation_no=jsonObject1.getString("installation_no");
                        subject.dropWire = jsonObject1.getString("dropWire");
                        subject.tenda= jsonObject1.getString("tenda");
                        subject.vsdl_cpe = jsonObject1.getString("vsdl_cpe");
                        subject.instruments = jsonObject1.getString("instruments");
                        subject.rosett_box_1_way = jsonObject1.getString("rosett_box_1_way");
                        subject.rosett_box_2_way = jsonObject1.getString("rosett_box_2_way");
                        subject.time = jsonObject1.getString("time");

                        CopperListView.add(subject);
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
        public String installation_no;
        public String dropWire;
        public String tenda;
        public String vsdl_cpe;
        public String instruments;
        public String rosett_box_1_way;
        public String rosett_box_2_way;
        public String time;
    }


}
