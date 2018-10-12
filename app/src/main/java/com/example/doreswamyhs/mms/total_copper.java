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

public class total_copper extends AppCompatActivity {
    int val1,val2,val3,val4,val5,val6;
    String val_count[]={"1"};
    String aval1,aval2,aval3,aval4,aval5,aval6;
    String tval1,tval2,tval3,tval4,tval5,tval6;


    String id;

    ListView listView;
    ToolTipManager tooltips;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total_copper);
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
            txt1.setVisibility(view.INVISIBLE);

            txt2.setText(""+val1);
            txt3.setText(""+val2);
            txt4.setText(""+val3);
            txt5.setText(""+val4);
            txt6.setText(""+val5);
            txt7.setText(""+val6);
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

            return view;
        }
    }
    class dispTask extends AsyncTask<String,Void,String>
    {String add_info_url;
        ProgressDialog progDailog;
        @Override
        protected void onPreExecute()
        {
            add_info_url="http://suphds.hostingerapp.com/total_displayc.php";
            progDailog = new ProgressDialog(total_copper.this);
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
                    val1=jsonObject.getInt("ndropWire");
                    val2=jsonObject.getInt("ntenda");
                    val3=jsonObject.getInt("nvsdl_cpe");
                    val4=jsonObject.getInt("ninstruments");
                    val5=jsonObject.getInt("nrosett_box_1_way");
                    val6=jsonObject.getInt("nrosett_box_2_way");

                    aval1=jsonObject.getString("adropWire");
                    aval2=jsonObject.getString("atenda");
                    aval3=jsonObject.getString("avsdl_cpe");
                    aval4=jsonObject.getString("ainstruments");
                    aval5=jsonObject.getString("arosett_box_1_way");
                    aval6=jsonObject.getString("arosett_box_2_way");

                    tval1=jsonObject.getString("tdropWire");
                    tval2=jsonObject.getString("ttenda");
                    tval3=jsonObject.getString("tvsdl_cpe");
                    tval4=jsonObject.getString("tinstruments");
                    tval5=jsonObject.getString("trosett_box_1_way");
                    tval6=jsonObject.getString("trosett_box_2_way");


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
