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

public class display_p extends AppCompatActivity {
    int val1,val2,val3,val4,val5,val6,val7,val8,val9,val10,val11,val12,val13,val14,val15,val16,val17,val18,val19,val20,val21,val22,val23,val24,val25,val26,val27,val28,val29,val30;
    String val_count[]={"1"};
    List<Subject> ProjectListView;

    String id,what,val31;

    ListView listView;
    SwipeRefreshLayout swipeRefreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_p);

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

            view=getLayoutInflater().inflate(R.layout.customlayoutp,null);
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
            txt15=view.findViewById(R.id.textView163);
            txt16=view.findViewById(R.id.textView164);
            txt17=view.findViewById(R.id.textView165);
            txt18=view.findViewById(R.id.textView166);
            txt19=view.findViewById(R.id.textView167);
            txt20=view.findViewById(R.id.textView168);
            txt21=view.findViewById(R.id.textView169);
            txt22=view.findViewById(R.id.textView170);
            txt23=view.findViewById(R.id.textView171);
            txt24=view.findViewById(R.id.textView172);
            txt25=view.findViewById(R.id.textView173);
            txt26=view.findViewById(R.id.textView174);
            txt27=view.findViewById(R.id.textView175);
            txt28=view.findViewById(R.id.textView176);
            txt29=view.findViewById(R.id.textView177);
            txt30=view.findViewById(R.id.textView178);
            txt31=view.findViewById(R.id.textView179);




            txt0.setVisibility(view.INVISIBLE);
            if(what.equals("1")) {

                txt1.setText(val31);
            }
            else
            {txt1.setVisibility(view.INVISIBLE);

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
            txt16.setText(""+val15);
            txt17.setText(""+val16);
            txt18.setText(""+val17);
            txt19.setText(""+val18);
            txt20.setText(""+val19);
            txt21.setText(""+val20);
            txt22.setText(""+val21);
            txt23.setText(""+val22);
            txt24.setText(""+val23);
            txt25.setText(""+val24);
            txt26.setText(""+val25);
            txt27.setText(""+val26);
            txt28.setText(""+val27);
            txt29.setText(""+val28);
            txt30.setText(""+val29);
            txt31.setText(""+val30);

            return view;
        }
    }
    class MainAdapter extends BaseAdapter{


        @Override
        public int getCount() {
            return ProjectListView.size();
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

            view=getLayoutInflater().inflate(R.layout.customlayoutp,null);
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
            txt15=view.findViewById(R.id.textView163);
            txt16=view.findViewById(R.id.textView164);
            txt17=view.findViewById(R.id.textView165);
            txt18=view.findViewById(R.id.textView166);
            txt19=view.findViewById(R.id.textView167);
            txt20=view.findViewById(R.id.textView168);
            txt21=view.findViewById(R.id.textView169);
            txt22=view.findViewById(R.id.textView170);
            txt23=view.findViewById(R.id.textView171);
            txt24=view.findViewById(R.id.textView172);
            txt25=view.findViewById(R.id.textView173);
            txt26=view.findViewById(R.id.textView174);
            txt27=view.findViewById(R.id.textView175);
            txt28=view.findViewById(R.id.textView176);
            txt29=view.findViewById(R.id.textView177);
            txt30=view.findViewById(R.id.textView178);
            txt31=view.findViewById(R.id.textView179);




            txt0.setText(ProjectListView.get(i).worksite_no);
            txt1.setText(ProjectListView.get(i).time);

            txt2.setText(ProjectListView.get(i).blue);
            txt3.setText(ProjectListView.get(i).green);
            txt4.setText(ProjectListView.get(i).orange);
            txt5.setText(ProjectListView.get(i).dwc_duct);
            txt6.setText(ProjectListView.get(i).arm_24_fwd);
            txt7.setText(ProjectListView.get(i).arm_48_fwd);
            txt8.setText(ProjectListView.get(i).arm_96_fwd);
            txt9.setText(ProjectListView.get(i).unarm_24_fwd);
            txt10.setText(ProjectListView.get(i).unarm_48_fwd);
            txt11.setText(ProjectListView.get(i).unarm_96_fwd);
            txt12.setText(ProjectListView.get(i).adss_cable);
            txt13.setText(ProjectListView.get(i).electronic_ball_marker);
            txt14.setText(ProjectListView.get(i).endPlug);
            txt15.setText(ProjectListView.get(i).fat_box_16f);
            txt16.setText(ProjectListView.get(i).fat_box_32f);
            txt17.setText(ProjectListView.get(i).fms_set);
            txt18.setText(ProjectListView.get(i).fosc_bjc_24_fiber);
            txt19.setText(ProjectListView.get(i).fosc_bjc_48_fiber);
            txt20.setText(ProjectListView.get(i).fosc_bjc_96_fiber);
            txt21.setText(ProjectListView.get(i).odf_144_wall_Mount);
            txt22.setText(ProjectListView.get(i).odf_144f_cabinet);
            txt23.setText(ProjectListView.get(i).odf_96f_cabinet);
            txt24.setText(ProjectListView.get(i).odf_rack);
            txt25.setText(ProjectListView.get(i).pole_base);
            txt26.setText(ProjectListView.get(i).poles);
            txt27.setText(ProjectListView.get(i).splitters_1_16);
            txt28.setText(ProjectListView.get(i).splitters_1_8);
            txt29.setText(ProjectListView.get(i).wall_mount_24f_with_sc_pc_adapters_and_pigtails);
            txt30.setText(ProjectListView.get(i).wall_mount_48f_with_sc_pc_adapters_and_pigtails);
            txt31.setText(ProjectListView.get(i).coupler);
            return view;
        }
    }
    class dispTask extends AsyncTask<String,Void,String>
    {String add_info_url;
        ProgressDialog progDailog;
        @Override
        protected void onPreExecute()
        {
            add_info_url="http://suphds.hostingerapp.com/dispp.php";
            progDailog = new ProgressDialog(display_p.this);
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
                    val1=jsonObject.getInt("nblue");
                    val2=jsonObject.getInt("ngreen");
                    val3=jsonObject.getInt("norange");
                    val4=jsonObject.getInt("ndwc_duct");
                    val5=jsonObject.getInt("narm_24_fwd");
                    val6=jsonObject.getInt("narm_48_fwd");
                    val7=jsonObject.getInt("narm_96_fwd");
                    val8=jsonObject.getInt("nunarm_24_fwd");
                    val9=jsonObject.getInt("nunarm_48_fwd");
                    val10=jsonObject.getInt("nunarm_96_fwd");
                    val11=jsonObject.getInt("nadss_cable");
                    val12=jsonObject.getInt("nelectronic_ball_marker");
                    val13=jsonObject.getInt("nendPlug");
                    val14=jsonObject.getInt("nfat_box_16f");
                    val15=jsonObject.getInt("nfat_box_32f");
                    val16=jsonObject.getInt("nfms_set");
                    val17=jsonObject.getInt("nfosc_bjc_24_fiber");
                    val18=jsonObject.getInt("nfosc_bjc_48_fiber");
                    val19=jsonObject.getInt("nfosc_bjc_96_fiber");
                    val20=jsonObject.getInt("nodf_144_wall_Mount");
                    val21=jsonObject.getInt("nodf_144f_cabinet");
                    val22=jsonObject.getInt("nodf_96f_cabinet");
                    val23=jsonObject.getInt("nodf_rack");
                    val24=jsonObject.getInt("npole_base");
                    val25=jsonObject.getInt("npoles");
                    val26=jsonObject.getInt("nsplitters_1_16");
                    val27=jsonObject.getInt("nsplitters_1_8");
                    val28=jsonObject.getInt("nwall_mount_24f_with_sc_pc_adapters_and_pigtails");
                    val29=jsonObject.getInt("nwall_mount_48f_with_sc_pc_adapters_and_pigtails");
                    val30=jsonObject.getInt("ncoupler");
                    if(!what.equals("2")) {
                    val31=jsonObject.getString("time");
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
            add_info_url="http://suphds.hostingerapp.com/main_displayp.php";
            progDailog = new ProgressDialog(display_p.this);
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
               ProjectListView = new ArrayList<Subject>();
                if(success==1)
                { Subject subject;
                    JSONArray p_data=jsonObject.getJSONArray("p_data");
                    for(int i=0;i<p_data.length();i++) {
                        JSONObject jsonObject1 = p_data.getJSONObject(i);
                        subject=new Subject();
                        subject.worksite_no=jsonObject1.getString("worksite_no");
                        subject.blue = jsonObject1.getString("blue");
                        subject.green= jsonObject1.getString("green");
                        subject.orange = jsonObject1.getString("orange");
                        subject.dwc_duct = jsonObject1.getString("dwc_duct");
                        subject.arm_24_fwd = jsonObject1.getString("arm_24_fwd");
                        subject.arm_48_fwd = jsonObject1.getString("arm_48_fwd");
                        subject.arm_96_fwd = jsonObject1.getString("arm_96_fwd");
                        subject.unarm_24_fwd = jsonObject1.getString("unarm_24_fwd");
                        subject.unarm_48_fwd = jsonObject1.getString("unarm_48_fwd");
                        subject.unarm_96_fwd = jsonObject1.getString("unarm_96_fwd");
                        subject.adss_cable = jsonObject1.getString("adss_cable");
                        subject.electronic_ball_marker = jsonObject1.getString("electronic_ball_marker");
                        subject.endPlug = jsonObject1.getString("endPlug");
                        subject.fat_box_16f = jsonObject1.getString("fat_box_16f");
                        subject.fat_box_32f = jsonObject1.getString("fat_box_32f");
                        subject.fms_set = jsonObject1.getString("fms_set");
                        subject.fosc_bjc_24_fiber = jsonObject1.getString("fosc_bjc_24_fiber");
                        subject.fosc_bjc_48_fiber = jsonObject1.getString("fosc_bjc_48_fiber");
                        subject.fosc_bjc_96_fiber = jsonObject1.getString("fosc_bjc_96_fiber");
                        subject.odf_144_wall_Mount = jsonObject1.getString("odf_144_wall_Mount");
                        subject.odf_144f_cabinet = jsonObject1.getString("odf_144f_cabinet");
                        subject.odf_96f_cabinet = jsonObject1.getString("odf_96f_cabinet");
                        subject.odf_rack = jsonObject1.getString("odf_rack");
                        subject.pole_base = jsonObject1.getString("pole_base");
                        subject.poles = jsonObject1.getString("poles");
                        subject.splitters_1_16 = jsonObject1.getString("splitters_1_16");
                        subject.splitters_1_8 = jsonObject1.getString("splitters_1_8");
                        subject.wall_mount_24f_with_sc_pc_adapters_and_pigtails = jsonObject1.getString("wall_mount_24f_with_sc_pc_adapters_and_pigtails");
                        subject.wall_mount_48f_with_sc_pc_adapters_and_pigtails = jsonObject1.getString("wall_mount_48f_with_sc_pc_adapters_and_pigtails");
                        subject.coupler = jsonObject1.getString("coupler");
                        subject.time = jsonObject1.getString("time");
                        ProjectListView.add(subject);
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
        public String worksite_no;
        public String blue;
        public String green;
        public String orange;
        public String dwc_duct;
        public String arm_24_fwd;
        public String arm_48_fwd;
        public String arm_96_fwd;
        public String unarm_24_fwd;
        public String unarm_48_fwd;
        public String unarm_96_fwd;
        public String adss_cable;
        public String electronic_ball_marker;
        public String endPlug;
        public String fat_box_16f;
        public String fat_box_32f;
        public String fms_set;
        public String fosc_bjc_24_fiber;
        public String fosc_bjc_48_fiber;
        public String fosc_bjc_96_fiber;
        public String odf_144_wall_Mount;
        public String odf_144f_cabinet;
        public String odf_96f_cabinet;
        public String odf_rack;
        public String pole_base;
        public String poles;
        public String splitters_1_16;
        public String splitters_1_8;
        public String wall_mount_24f_with_sc_pc_adapters_and_pigtails;
        public String wall_mount_48f_with_sc_pc_adapters_and_pigtails;
        public String coupler;
        public String time;
    }
}
