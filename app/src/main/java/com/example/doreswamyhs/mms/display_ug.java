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

public class display_ug extends AppCompatActivity {
    int val1,val2,val3,val4,val5,val6,val7,val8,val9,val10,val11,val12,val13,val14;
    String val_count[]={"1"};
    List<Subject> UgListView;

    String id,what,val15;

    ListView listView;
    SwipeRefreshLayout swipeRefreshLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_ug);
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
            if(what.equals("1")) {
                txt1.setText(val15);


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
            txt15.setText(""+val14);
            return view;
        }
    }
    class MainAdapter extends BaseAdapter{


        @Override
        public int getCount() {
            return UgListView.size();
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




            txt0.setText(UgListView.get(i).srno);
            txt1.setText(UgListView.get(i).time);

            txt2.setText(UgListView.get(i).n5_pair);
            txt3.setText(UgListView.get(i).n10_pair);
            txt4.setText(UgListView.get(i).n20_pair);
            txt5.setText(UgListView.get(i).n50_pair);
            txt6.setText(UgListView.get(i).n100_pair);
            txt7.setText(UgListView.get(i).n200_pair);
            txt8.setText(UgListView.get(i).n400_pair);
            txt9.setText(UgListView.get(i).n800_pair);
            txt10.setText(UgListView.get(i).dp_100_pr);
            txt11.setText(UgListView.get(i).dp_50_pr);
            txt12.setText(UgListView.get(i).gas_cylinder);
            txt13.setText(UgListView.get(i).rigide_module);
            txt14.setText(UgListView.get(i).tape);
            txt15.setText(UgListView.get(i).uy_connector);
            return view;
        }
    }
    class dispTask extends AsyncTask<String,Void,String>
    {String add_info_url;
        ProgressDialog progDailog;
        @Override
        protected void onPreExecute()
        {
            add_info_url="http://suphds.hostingerapp.com/dispug.php";
            progDailog = new ProgressDialog(display_ug.this);
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
                    if(!what.equals("2")) {
                        val15 = jsonObject.getString("time");
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
            add_info_url="http://suphds.hostingerapp.com/main_displayug.php";
            progDailog = new ProgressDialog(display_ug.this);
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
                UgListView = new ArrayList<Subject>();
                if(success==1)
                { Subject subject;
                    JSONArray ug_data=jsonObject.getJSONArray("ug_data");
                    for(int i=0;i<ug_data.length();i++) {
                        JSONObject jsonObject1 = ug_data.getJSONObject(i);
                        subject=new Subject();
                        subject.srno=jsonObject1.getString("srno");
                        subject.n5_pair = jsonObject1.getString("5_pair");
                        subject.n10_pair= jsonObject1.getString("10_pair");
                        subject.n20_pair = jsonObject1.getString("20_pair");
                        subject.n50_pair = jsonObject1.getString("50_pair");
                        subject.n100_pair = jsonObject1.getString("100_pair");
                        subject.n200_pair = jsonObject1.getString("200_pair");
                        subject.n400_pair = jsonObject1.getString("400_pair");
                        subject.n800_pair = jsonObject1.getString("800_pair");
                        subject.dp_100_pr = jsonObject1.getString("dp_100_pr");
                        subject.dp_50_pr = jsonObject1.getString("dp_50_pr");
                        subject.gas_cylinder = jsonObject1.getString("gas_cylinder");
                        subject.rigide_module = jsonObject1.getString("rigide_module");
                        subject.tape = jsonObject1.getString("tape");
                        subject.uy_connector = jsonObject1.getString("uy_connector");
                        subject.time = jsonObject1.getString("time");
                        UgListView.add(subject);
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
        public String srno;
        public String n5_pair;
        public String n10_pair;
        public String n20_pair;
        public String n50_pair;
        public String n100_pair;
        public String n200_pair;
        public String n400_pair;
        public String n800_pair;
        public String dp_100_pr;
        public String dp_50_pr;
        public String gas_cylinder;
        public String rigide_module;
        public String tape;
        public String uy_connector;
        public String time;
    }
}
