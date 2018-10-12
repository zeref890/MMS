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

public class total_project extends AppCompatActivity {
    int val1,val2,val3,val4,val5,val6,val7,val8,val9,val10,val11,val12,val13,val14,val15,val16,val17,val18,val19,val20,val21,val22,val23,val24,val25,val26,val27,val28,val29,val30;
    String aval1,aval2,aval3,aval4,aval5,aval6,aval7,aval8,aval9,aval10,aval11,aval12,aval13,aval14,aval15,aval16,aval17,aval18,aval19,aval20,aval21,aval22,aval23,aval24,aval25,aval26,aval27,aval28,aval29,aval30;
    String tval1,tval2,tval3,tval4,tval5,tval6,tval7,tval8,tval9,tval10,tval11,tval12,tval13,tval14,tval15,tval16,tval17,tval18,tval19,tval20,tval21,tval22,tval23,tval24,tval25,tval26,tval27,tval28,tval29,tval30;
    String val_count[]={"1"};
    ListView listView;
    ToolTipManager tooltips;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total_project);
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

            txt16.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    ToolTip toolTip = new ToolTip()
                            .withText("Total:"+tval15 +"\nAssigned:"+aval15)
                            .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                            .withShadow();
                    tooltips.showToolTip(toolTip, v);

                    return true;
                }
            });

            txt17.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    ToolTip toolTip = new ToolTip()
                            .withText("Total:"+tval16 +"\nAssigned:"+aval16)
                            .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                            .withShadow();
                    tooltips.showToolTip(toolTip, v);

                    return true;
                }
            });

            txt18.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    ToolTip toolTip = new ToolTip()
                            .withText("Total:"+tval17 +"\nAssigned:"+aval17)
                            .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                            .withShadow();
                    tooltips.showToolTip(toolTip, v);

                    return true;
                }
            });

            txt19.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    ToolTip toolTip = new ToolTip()
                            .withText("Total:"+tval18 +"\nAssigned:"+aval18)
                            .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                            .withShadow();
                    tooltips.showToolTip(toolTip, v);

                    return true;
                }
            });

            txt20.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    ToolTip toolTip = new ToolTip()
                            .withText("Total:"+tval19 +"\nAssigned:"+aval19)
                            .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                            .withShadow();
                    tooltips.showToolTip(toolTip, v);

                    return true;
                }
            });

            txt21.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    ToolTip toolTip = new ToolTip()
                            .withText("Total:"+tval20 +"\nAssigned:"+aval20)
                            .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                            .withShadow();
                    tooltips.showToolTip(toolTip, v);

                    return true;
                }
            });

            txt22.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    ToolTip toolTip = new ToolTip()
                            .withText("Total:"+tval21 +"\nAssigned:"+aval21)
                            .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                            .withShadow();
                    tooltips.showToolTip(toolTip, v);

                    return true;
                }
            });

            txt23.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    ToolTip toolTip = new ToolTip()
                            .withText("Total:"+tval22 +"\nAssigned:"+aval22)
                            .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                            .withShadow();
                    tooltips.showToolTip(toolTip, v);

                    return true;
                }
            });

            txt24.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    ToolTip toolTip = new ToolTip()
                            .withText("Total:"+tval23 +"\nAssigned:"+aval23)
                            .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                            .withShadow();
                    tooltips.showToolTip(toolTip, v);

                    return true;
                }
            });

            txt25.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    ToolTip toolTip = new ToolTip()
                            .withText("Total:"+tval24 +"\nAssigned:"+aval24)
                            .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                            .withShadow();
                    tooltips.showToolTip(toolTip, v);

                    return true;
                }
            });

            txt26.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    ToolTip toolTip = new ToolTip()
                            .withText("Total:"+tval25 +"\nAssigned:"+aval25)
                            .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                            .withShadow();
                    tooltips.showToolTip(toolTip, v);

                    return true;
                }
            });

            txt27.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    ToolTip toolTip = new ToolTip()
                            .withText("Total:"+tval26 +"\nAssigned:"+aval26)
                            .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                            .withShadow();
                    tooltips.showToolTip(toolTip, v);

                    return true;
                }
            });

            txt28.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    ToolTip toolTip = new ToolTip()
                            .withText("Total:"+tval27 +"\nAssigned:"+aval27)
                            .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                            .withShadow();
                    tooltips.showToolTip(toolTip, v);

                    return true;
                }
            });

            txt29.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    ToolTip toolTip = new ToolTip()
                            .withText("Total:"+tval28 +"\nAssigned:"+aval28)
                            .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                            .withShadow();
                    tooltips.showToolTip(toolTip, v);

                    return true;
                }
            });

            txt30.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    ToolTip toolTip = new ToolTip()
                            .withText("Total:"+tval29 +"\nAssigned:"+aval29)
                            .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                            .withShadow();
                    tooltips.showToolTip(toolTip, v);

                    return true;
                }
            });

            txt31.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    ToolTip toolTip = new ToolTip()
                            .withText("Total:"+tval30 +"\nAssigned:"+aval30)
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
            add_info_url="http://suphds.hostingerapp.com/total_displayp.php";
            progDailog = new ProgressDialog(total_project.this);
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

                    aval1=jsonObject.getString("ablue");
                    aval2=jsonObject.getString("agreen");
                    aval3=jsonObject.getString("aorange");
                    aval4=jsonObject.getString("adwc_duct");
                    aval5=jsonObject.getString("aarm_24_fwd");
                    aval6=jsonObject.getString("aarm_48_fwd");
                    aval7=jsonObject.getString("aarm_96_fwd");
                    aval8=jsonObject.getString("aunarm_24_fwd");
                    aval9=jsonObject.getString("aunarm_48_fwd");
                    aval10=jsonObject.getString("aunarm_96_fwd");
                    aval11=jsonObject.getString("aadss_cable");
                    aval12=jsonObject.getString("aelectronic_ball_marker");
                    aval13=jsonObject.getString("aendPlug");
                    aval14=jsonObject.getString("afat_box_16f");
                    aval15=jsonObject.getString("afat_box_32f");
                    aval16=jsonObject.getString("afms_set");
                    aval17=jsonObject.getString("afosc_bjc_24_fiber");
                    aval18=jsonObject.getString("afosc_bjc_48_fiber");
                    aval19=jsonObject.getString("afosc_bjc_96_fiber");
                    aval20=jsonObject.getString("aodf_144_wall_Mount");
                    aval21=jsonObject.getString("aodf_144f_cabinet");
                    aval22=jsonObject.getString("aodf_96f_cabinet");
                    aval23=jsonObject.getString("aodf_rack");
                    aval24=jsonObject.getString("apole_base");
                    aval25=jsonObject.getString("apoles");
                    aval26=jsonObject.getString("asplitters_1_16");
                    aval27=jsonObject.getString("asplitters_1_8");
                    aval28=jsonObject.getString("awall_mount_24f_with_sc_pc_adapters_and_pigtails");
                    aval29=jsonObject.getString("awall_mount_48f_with_sc_pc_adapters_and_pigtails");
                    aval30=jsonObject.getString("acoupler");

                   tval1=jsonObject.getString("tblue");
                   tval2=jsonObject.getString("tgreen");
                   tval3=jsonObject.getString("torange");
                   tval4=jsonObject.getString("tdwc_duct");
                   tval5=jsonObject.getString("tarm_24_fwd");
                   tval6=jsonObject.getString("tarm_48_fwd");
                   tval7=jsonObject.getString("tarm_96_fwd");
                   tval8=jsonObject.getString("tunarm_24_fwd");
                   tval9=jsonObject.getString("tunarm_48_fwd");
                   tval10=jsonObject.getString("tunarm_96_fwd");
                   tval11=jsonObject.getString("tadss_cable");
                   tval12=jsonObject.getString("telectronic_ball_marker");
                   tval13=jsonObject.getString("tendPlug");
                   tval14=jsonObject.getString("tfat_box_16f");
                   tval15=jsonObject.getString("tfat_box_32f");
                   tval16=jsonObject.getString("tfms_set");
                   tval17=jsonObject.getString("tfosc_bjc_24_fiber");
                   tval18=jsonObject.getString("tfosc_bjc_48_fiber");
                   tval19=jsonObject.getString("tfosc_bjc_96_fiber");
                   tval20=jsonObject.getString("todf_144_wall_Mount");
                   tval21=jsonObject.getString("todf_144f_cabinet");
                   tval22=jsonObject.getString("todf_96f_cabinet");
                   tval23=jsonObject.getString("todf_rack");
                   tval24=jsonObject.getString("tpole_base");
                   tval25=jsonObject.getString("tpoles");
                   tval26=jsonObject.getString("tsplitters_1_16");
                   tval27=jsonObject.getString("tsplitters_1_8");
                   tval28=jsonObject.getString("twall_mount_24f_with_sc_pc_adapters_and_pigtails");
                   tval29=jsonObject.getString("twall_mount_48f_with_sc_pc_adapters_and_pigtails");
                   tval30=jsonObject.getString("tcoupler");



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
