package com.example.doreswamyhs.mms;

import android.app.ProgressDialog;
import android.content.Intent;
import android.hardware.Camera;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.CountDownTimer;
import android.os.Environment;

import android.provider.MediaStore;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.spyhunter99.supertooltips.ToolTip;
import com.spyhunter99.supertooltips.ToolTipManager;

import net.gotev.uploadservice.MultipartUploadRequest;
import net.gotev.uploadservice.UploadNotificationConfig;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
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
import java.util.Date;
import java.util.UUID;

import uk.co.deanwild.materialshowcaseview.MaterialShowcaseSequence;
import uk.co.deanwild.materialshowcaseview.ShowcaseConfig;

public class Project extends AppCompatActivity {
    ToolTipManager tooltips;
    CheckBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14,cb15,cb16,cb17,cb18,cb19,cb20,cb21,cb22,cb23,cb24,cb25,cb26,cb27,cb28,cb29,cb30;
    EditText ed0,ed1,ed2,ed3,ed4,ed5,ed6,ed7,ed8,ed9,ed10,ed11,ed12,ed13,ed14,ed15,ed16,ed17,ed18,ed19,ed20,ed21,ed22,ed23,ed24,ed25,ed26,ed27,ed28,ed29,ed30;
    int num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,num11,num12,num13,num14,num15,num16,num17,num18,num19,num20,num21,num22,num23,num24,num25,num26,num27,num28,num29,num30;
    int val1,val2,val3,val4,val5,val6,val7,val8,val9,val10,val11,val12,val13,val14,val15,val16,val17,val18,val19,val20,val21,val22,val23,val24,val25,val26,val27,val28,val29,val30;
    String id;
    String string;
    static final int REQUEST_IMAGE_CAPTURE = 1;
    File photoFile = null;
    private String mCurrentPhotoPath,imgfn;
    Boolean done=false;
    Boolean completed=false;
    String SHOWCASE_ID="7706";
    boolean cc=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);
        tooltips =new ToolTipManager(this);
        TextView tv=findViewById(R.id.editText3);
        Bundle b=getIntent().getExtras();
        id=b.getString("Name");
        tv.setText(id);
        //showcase
        ShowcaseConfig config=new ShowcaseConfig();
        config.setDelay(500);
        MaterialShowcaseSequence sequence=new MaterialShowcaseSequence(this,SHOWCASE_ID);
        sequence.setConfig(config);
        sequence.addSequenceItem(tv,"This is your User ID","GOT IT");
        sequence.addSequenceItem(findViewById(R.id.textView4),"This is the current Date and Time","GOT IT");
        sequence.addSequenceItem(findViewById(R.id.editText37),"Long Press to get hint","GOT IT");
        sequence.addSequenceItem(findViewById(R.id.checkBox33),"Select the respective Check Box before Submit","GOT IT");
        sequence.start();
        //tooltips
        findViewById(R.id.siteno).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("Worksite number")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });


        findViewById(R.id.editText37).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("Blue(in mts):"+val1)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });


        findViewById(R.id.editText38).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("Green(in mts):"+val2)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });



        findViewById(R.id.editText39).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("Orange(in mts):"+val3)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });


        findViewById(R.id.editText40).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("DWC Duct(in mts):"+val4)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });





        findViewById(R.id.editText41).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("ARM 24 FWD(in mts):"+val5)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });


        findViewById(R.id.editText42).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("ARM 48 FWD(in mts):"+val6)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });



        findViewById(R.id.editText43).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("ARM 96 FWD(in mts):"+val7)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });


        findViewById(R.id.editText44).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("UNARM 24 FWD(in mts):"+val8)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });


        findViewById(R.id.editText45).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("UNARM 48 FWD(in mts):"+val9)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });

        findViewById(R.id.editText46).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("UNARM 96 FWD(in mts):"+val10)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });

        findViewById(R.id.editText47).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("ADSS CABLE(in mts):"+val11)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });

        findViewById(R.id.editText48).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("Electronic Ball Marker(Unit):"+val12)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });

        findViewById(R.id.editText49).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("Endplug(Unit):"+val13)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });

        findViewById(R.id.editText50).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("FAT BOX-16F(unit):"+val14)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });

        findViewById(R.id.editText51).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("FAT BOX-32F(unit):"+val15)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });


        findViewById(R.id.editText52).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("FMS Set(unit):"+val16)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });


        findViewById(R.id.editText53).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("FOSC-BJC-24 FIBER(unit):"+val17)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });


        findViewById(R.id.editText54).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("FOSC-BJC-48 FIBER(unit):"+val18)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });


        findViewById(R.id.editText55).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("FOSC-BJC-96 FIBER(unit):"+val19)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });


        findViewById(R.id.editText56).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("ODF-144 Wall Mount(unit):"+val20)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });



        findViewById(R.id.editText57).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("ODF(144F)Cabinet(O/I)(unit):"+val21)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });



        findViewById(R.id.editText58).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("ODF(96F)Cabinet(O/I)(unit):"+val22)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });

        findViewById(R.id.editText59).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("ODF Rack(unit):"+val23)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);

                return true;
            }
        });



        findViewById(R.id.editText60).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("Pole Base(unit):"+val24)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });




        findViewById(R.id.editText61).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("POLES(unit):"+val25)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });


        findViewById(R.id.editText62).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("SPLITTERS 1:16(unit):"+val26)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });



        findViewById(R.id.editText63).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("SPLITTERS 1:8(unit):"+val27)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });


        findViewById(R.id.editText64).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("Wall Mount 24F with SC-PC Adapters and pigtails(unit):"+val28)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });




        findViewById(R.id.editText65).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("Wall Mount 48F with SC-PC Adapters and pigtails(unit):"+val29)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });



        findViewById(R.id.editText66).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("Coupler(unit):"+val30)
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);
                
                return true;
            }
        });
        dispTask dp=new dispTask();
        dp.execute(id);

        //upload to db
        ed0=findViewById(R.id.siteno);
        cb1=findViewById(R.id.checkBox33);
        ed1=findViewById(R.id.editText37);
        cb2=findViewById(R.id.checkBox34);
        ed2=findViewById(R.id.editText38);
        cb3=findViewById(R.id.checkBox35);
        ed3=findViewById(R.id.editText39);
        cb4=findViewById(R.id.checkBox36);
        ed4=findViewById(R.id.editText40);
        cb5=findViewById(R.id.checkBox37);
        ed5=findViewById(R.id.editText41);
        cb6=findViewById(R.id.checkBox38);
        ed6=findViewById(R.id.editText42);
        cb7=findViewById(R.id.checkBox39);
        ed7=findViewById(R.id.editText43);
        cb8=findViewById(R.id.checkBox40);
        ed8=findViewById(R.id.editText44);
        cb9=findViewById(R.id.checkBox41);
        ed9=findViewById(R.id.editText45);
        cb10=findViewById(R.id.checkBox42);
        ed10=findViewById(R.id.editText46);
        cb11=findViewById(R.id.checkBox43);
        ed11=findViewById(R.id.editText47);
        cb12=findViewById(R.id.checkBox44);
        ed12=findViewById(R.id.editText48);
        cb13=findViewById(R.id.checkBox45);
        ed13=findViewById(R.id.editText49);
        cb14=findViewById(R.id.checkBox46);
        ed14=findViewById(R.id.editText50);
        cb15=findViewById(R.id.checkBox47);
        ed15=findViewById(R.id.editText51);
        cb16=findViewById(R.id.checkBox48);
        ed16=findViewById(R.id.editText52);
        cb17=findViewById(R.id.checkBox49);
        ed17=findViewById(R.id.editText53);
        cb18=findViewById(R.id.checkBox50);
        ed18=findViewById(R.id.editText54);
        cb19=findViewById(R.id.checkBox51);
        ed19=findViewById(R.id.editText55);
        cb20=findViewById(R.id.checkBox52);
        ed20=findViewById(R.id.editText56);
        cb21=findViewById(R.id.checkBox53);
        ed21=findViewById(R.id.editText57);
        cb22=findViewById(R.id.checkBox54);
        ed22=findViewById(R.id.editText58);
        cb23=findViewById(R.id.checkBox55);
        ed23=findViewById(R.id.editText59);
        cb24=findViewById(R.id.checkBox56);
        ed24=findViewById(R.id.editText60);
        cb25=findViewById(R.id.checkBox57);
        ed25=findViewById(R.id.editText61);
        cb26=findViewById(R.id.checkBox58);
        ed26=findViewById(R.id.editText62);
        cb27=findViewById(R.id.checkBox59);
        ed27=findViewById(R.id.editText63);
        cb28=findViewById(R.id.checkBox61);
        ed28=findViewById(R.id.editText64);
        cb29=findViewById(R.id.checkBox62);
        ed29=findViewById(R.id.editText65);
        cb30=findViewById(R.id.checkBox60);
        ed30=findViewById(R.id.editText66);
        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string=ed0.getText().toString();
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
                if(cb15.isChecked())
                {
                    String str=ed15.getText().toString();
                    try {
                        num15 = Integer.parseInt(str);

                    } catch (NumberFormatException e) {
                        //Put an alert Dialog
                        //Log.i("",str+" is not a number");
                    }

                }
                else
                {
                    num15=0;
                }
                if(cb16.isChecked())
                {
                    String str=ed16.getText().toString();
                    try {
                        num16 = Integer.parseInt(str);

                    } catch (NumberFormatException e) {
                        //Put an alert Dialog
                        //Log.i("",str+" is not a number");
                    }

                }
                else
                {
                    num16=0;
                }
                if(cb17.isChecked())
                {
                    String str=ed17.getText().toString();
                    try {
                        num17 = Integer.parseInt(str);

                    } catch (NumberFormatException e) {
                        //Put an alert Dialog
                        //Log.i("",str+" is not a number");
                    }

                }
                else
                {
                    num17=0;
                }
                if(cb18.isChecked())
                {
                    String str=ed18.getText().toString();
                    try {
                        num18 = Integer.parseInt(str);

                    } catch (NumberFormatException e) {
                        //Put an alert Dialog
                        //Log.i("",str+" is not a number");
                    }

                }
                else
                {
                    num18=0;
                }
                if(cb19.isChecked())
                {
                    String str=ed19.getText().toString();
                    try {
                        num19 = Integer.parseInt(str);

                    } catch (NumberFormatException e) {
                        //Put an alert Dialog
                        //Log.i("",str+" is not a number");
                    }

                }
                else
                {
                    num19=0;
                }
                if(cb20.isChecked())
                {
                    String str=ed20.getText().toString();
                    try {
                        num20 = Integer.parseInt(str);

                    } catch (NumberFormatException e) {
                        //Put an alert Dialog
                        //Log.i("",str+" is not a number");
                    }

                }
                else
                {
                    num20=0;
                }
                if(cb21.isChecked())
                {
                    String str=ed21.getText().toString();
                    try {
                        num21 = Integer.parseInt(str);

                    } catch (NumberFormatException e) {
                        //Put an alert Dialog
                        //Log.i("",str+" is not a number");
                    }

                }
                else
                {
                    num21=0;
                }
                if(cb22.isChecked())
                {
                    String str=ed22.getText().toString();
                    try {
                        num22 = Integer.parseInt(str);

                    } catch (NumberFormatException e) {
                        //Put an alert Dialog
                        //Log.i("",str+" is not a number");
                    }

                }
                else
                {
                    num22=0;
                }
                if(cb23.isChecked())
                {
                    String str=ed23.getText().toString();
                    try {
                        num23 = Integer.parseInt(str);

                    } catch (NumberFormatException e) {
                        //Put an alert Dialog
                        //Log.i("",str+" is not a number");
                    }

                }
                else
                {
                    num23=0;
                }
                if(cb24.isChecked())
                {
                    String str=ed24.getText().toString();
                    try {
                        num24 = Integer.parseInt(str);

                    } catch (NumberFormatException e) {
                        //Put an alert Dialog
                        //Log.i("",str+" is not a number");
                    }

                }
                else
                {
                    num24=0;
                }
                if(cb25.isChecked())
                {
                    String str=ed25.getText().toString();
                    try {
                        num25 = Integer.parseInt(str);

                    } catch (NumberFormatException e) {
                        //Put an alert Dialog
                        //Log.i("",str+" is not a number");
                    }

                }
                else
                {
                    num25=0;
                }
                if(cb26.isChecked())
                {
                    String str=ed26.getText().toString();
                    try {
                        num26 = Integer.parseInt(str);

                    } catch (NumberFormatException e) {
                        //Put an alert Dialog
                        //Log.i("",str+" is not a number");
                    }

                }
                else
                {
                    num26=0;
                }
                if(cb27.isChecked())
                {
                    String str=ed27.getText().toString();
                    try {
                        num27 = Integer.parseInt(str);

                    } catch (NumberFormatException e) {
                        //Put an alert Dialog
                        //Log.i("",str+" is not a number");
                    }

                }
                else
                {
                    num27=0;
                }
                if(cb28.isChecked())
                {
                    String str=ed28.getText().toString();
                    try {
                        num28 = Integer.parseInt(str);

                    } catch (NumberFormatException e) {
                        //Put an alert Dialog
                        //Log.i("",str+" is not a number");
                    }

                }
                else
                {
                    num28=0;
                }
                if(cb29.isChecked())
                {
                    String str=ed29.getText().toString();
                    try {
                        num29 = Integer.parseInt(str);

                    } catch (NumberFormatException e) {
                        //Put an alert Dialog
                        //Log.i("",str+" is not a number");
                    }

                }
                else
                {
                    num29=0;
                }
                if(cb30.isChecked())
                {
                    String str=ed30.getText().toString();
                    try {
                        num30 = Integer.parseInt(str);

                    } catch (NumberFormatException e) {
                        //Put an alert Dialog
                        //Log.i("",str+" is not a number");
                    }

                }
                else
                {
                    num30=0;
                }
                Calendar cal =Calendar.getInstance();
                DateFormat df=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                String date_str=df.format(cal.getTime());
                MyTaskParams myTaskParams=new MyTaskParams(id,string,num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,num11,num12,num13,num14,num15,num16,num17,num18,num19,num20,num21,num22,num23,num24,num25,num26,num27,num28,num29,num30,date_str);
                if(string.isEmpty())
                {
                    Toast.makeText(getBaseContext(),"Please enter WORKSITE_NO ", Toast.LENGTH_SHORT).show();
                    ed0.setText("");
                }
                else {

                    BackgroundTask backgroundTask = new BackgroundTask();
                    backgroundTask.execute(myTaskParams);
                }
            }
        });


        //timer
        CountDownTimer newtimer=new CountDownTimer(10000000,1000) {
            @Override
            public void onTick(long l) {
                TextView et=findViewById(R.id.textView4);
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

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.project,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.item2:
                Intent intent=new Intent(getBaseContext(),reset_pass.class);
                intent.putExtra("userid",id);
                startActivity(intent);
                return true;
            case R.id.item3:

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
    private File createImageFile() throws IOException {

        String timeStamp = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss").format(new Date());
        String imageFileName = id+"_"+ timeStamp + "_";
        File storageDir = Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES);
        File image = File.createTempFile(
                imageFileName,  // prefix
                ".jpg",         // suffix
                storageDir      // directory
        );


        mCurrentPhotoPath = image.getAbsolutePath();
        imgfn=image.getName();
        done=true;
        return image;

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK && photoFile!=null && mCurrentPhotoPath!=null && imgfn!=null && done && completed && isCameraUsebyApp())
        {Intent intent=new Intent(getBaseContext(),Submission.class);
            intent.putExtra("Name",id);
            intent.putExtra("no",string);
            intent.putExtra("path",mCurrentPhotoPath);
            intent.putExtra("on_no",imgfn);
            startActivity(intent);}
        else {
            Toast.makeText(getBaseContext(), "Please Take a Picture", Toast.LENGTH_SHORT).show();
            Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            if (cameraIntent.resolveActivity(getPackageManager()) != null) {

                try {
                    photoFile = createImageFile();


                } catch (IOException ex) {

                    Toast.makeText(getBaseContext(),"Error", Toast.LENGTH_SHORT).show();
                }

                if (photoFile != null ) {

                    if(Build.VERSION.SDK_INT >=24)
                    {
                        cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, FileProvider.getUriForFile(Project.this,
                                BuildConfig.APPLICATION_ID + ".provider",
                                photoFile));
                    }
                    else
                    {
                        cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(photoFile));
                    }
                    startActivityForResult(cameraIntent, REQUEST_IMAGE_CAPTURE);
                    completed=true;


                }


            }

        }

    }



    public void onDestroy() {
        super.onDestroy();
        tooltips.onDestroy();
        tooltips = null;
    }
    private static class MyTaskParams{
        String id,date_str,string;
        String num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,num11,num12,num13,num14,num15,num16,num17,num18,num19,num20,num21,num22,num23,num24,num25,num26,num27,num28,num29,num30;
        MyTaskParams(String id,String string,int num1,int num2,int num3,int num4,int num5,int num6,int num7,int num8,int num9,int num10,int num11,int num12,int num13,int num14,int num15,int num16,int num17,int num18,int num19,int num20,int num21,int num22,int num23,int num24,int num25,int num26,int num27,int num28,int num29,int num30,String date_str)
        {
            this.id=id;
            this.string=string;
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
            this.num15=String.valueOf(num15);
            this.num16=String.valueOf(num16);
            this.num17=String.valueOf(num17);
            this.num18=String.valueOf(num18);
            this.num19=String.valueOf(num19);
            this.num20=String.valueOf(num20);
            this.num21=String.valueOf(num21);
            this.num22=String.valueOf(num22);
            this.num23=String.valueOf(num23);
            this.num24=String.valueOf(num24);
            this.num25=String.valueOf(num25);
            this.num26=String.valueOf(num26);
            this.num27=String.valueOf(num27);
            this.num28=String.valueOf(num28);
            this.num29=String.valueOf(num29);
            this.num30=String.valueOf(num30);
            this.date_str=date_str;

        }

    }
    class BackgroundTask extends AsyncTask<MyTaskParams,Void,String>
    {String add_info_url;
        ProgressDialog progDailog;
        @Override
        protected void onPreExecute()
        {
            add_info_url="http://suphds.hostingerapp.com/upi.php";
            progDailog = new ProgressDialog(Project.this);
            progDailog.setMessage("Loading...");
            progDailog.setIndeterminate(false);
            progDailog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progDailog.setCancelable(true);
            progDailog.show();
        }
        @Override
        protected String doInBackground(MyTaskParams... args)
        {String userid,time,string;
            String num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,num11,num12,num13,num14,num15,num16,num17,num18,num19,num20,num21,num22,num23,num24,num25,num26,num27,num28,num29,num30;
            userid=args[0].id;
            string=args[0].string;
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
            num15=args[0].num15;
            num16=args[0].num16;
            num17=args[0].num17;
            num18=args[0].num18;
            num19=args[0].num19;
            num20=args[0].num20;
            num21=args[0].num21;
            num22=args[0].num22;
            num23=args[0].num23;
            num24=args[0].num24;
            num25=args[0].num25;
            num26=args[0].num26;
            num27=args[0].num27;
            num28=args[0].num28;
            num29=args[0].num29;
            num30=args[0].num30;

            time=args[0].date_str;

            try{
                URL url=new URL(add_info_url);
                HttpURLConnection httpURLConnection=(HttpURLConnection)url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                OutputStream outputStream=httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(outputStream,"UTF-8"));
                String data_string= URLEncoder.encode("userid","UTF-8")+"="+URLEncoder.encode(userid,"UTF-8")+"&"+
                        URLEncoder.encode("worksite_no","UTF-8")+"="+URLEncoder.encode(string,"UTF-8")+"&"+
                        URLEncoder.encode("blue","UTF-8")+"="+URLEncoder.encode(num1,"UTF-8")+"&"+
                        URLEncoder.encode("green","UTF-8")+"="+URLEncoder.encode(num2,"UTF-8")+"&"+
                        URLEncoder.encode("orange","UTF-8")+"="+URLEncoder.encode(num3,"UTF-8")+"&"+
                        URLEncoder.encode("dwc_duct","UTF-8")+"="+URLEncoder.encode(num4,"UTF-8")+"&"+
                        URLEncoder.encode("arm_24_fwd","UTF-8")+"="+URLEncoder.encode(num5,"UTF-8")+"&"+
                        URLEncoder.encode("arm_48_fwd","UTF-8")+"="+URLEncoder.encode(num6,"UTF-8")+"&"+
                        URLEncoder.encode("arm_96_fwd","UTF-8")+"="+URLEncoder.encode(num7,"UTF-8")+"&"+
                        URLEncoder.encode("unarm_24_fwd","UTF-8")+"="+URLEncoder.encode(num8,"UTF-8")+"&"+
                        URLEncoder.encode("unarm_48_fwd","UTF-8")+"="+URLEncoder.encode(num9,"UTF-8")+"&"+
                        URLEncoder.encode("unarm_96_fwd","UTF-8")+"="+URLEncoder.encode(num10,"UTF-8")+"&"+
                        URLEncoder.encode("adss_cable","UTF-8")+"="+URLEncoder.encode(num11,"UTF-8")+"&"+
                        URLEncoder.encode("electronic_ball_marker","UTF-8")+"="+URLEncoder.encode(num12,"UTF-8")+"&"+
                        URLEncoder.encode("endPlug","UTF-8")+"="+URLEncoder.encode(num13,"UTF-8")+"&"+
                        URLEncoder.encode("fat_box_16f","UTF-8")+"="+URLEncoder.encode(num14,"UTF-8")+"&"+
                        URLEncoder.encode("fat_box_32f","UTF-8")+"="+URLEncoder.encode(num15,"UTF-8")+"&"+
                        URLEncoder.encode("fms_set","UTF-8")+"="+URLEncoder.encode(num16,"UTF-8")+"&"+
                        URLEncoder.encode("fosc_bjc_24_fiber","UTF-8")+"="+URLEncoder.encode(num17,"UTF-8")+"&"+
                        URLEncoder.encode("fosc_bjc_48_fiber","UTF-8")+"="+URLEncoder.encode(num18,"UTF-8")+"&"+
                        URLEncoder.encode("fosc_bjc_96_fiber","UTF-8")+"="+URLEncoder.encode(num19,"UTF-8")+"&"+
                        URLEncoder.encode("odf_144_wall_Mount","UTF-8")+"="+URLEncoder.encode(num20,"UTF-8")+"&"+
                        URLEncoder.encode("odf_144f_cabinet","UTF-8")+"="+URLEncoder.encode(num21,"UTF-8")+"&"+
                        URLEncoder.encode("odf_96f_cabinet","UTF-8")+"="+URLEncoder.encode(num22,"UTF-8")+"&"+
                        URLEncoder.encode("odf_rack","UTF-8")+"="+URLEncoder.encode(num23,"UTF-8")+"&"+
                        URLEncoder.encode("pole_base","UTF-8")+"="+URLEncoder.encode(num24,"UTF-8")+"&"+
                        URLEncoder.encode("poles","UTF-8")+"="+URLEncoder.encode(num25,"UTF-8")+"&"+
                        URLEncoder.encode("splitters_1_16","UTF-8")+"="+URLEncoder.encode(num26,"UTF-8")+"&"+
                        URLEncoder.encode("splitters_1_8","UTF-8")+"="+URLEncoder.encode(num27,"UTF-8")+"&"+
                        URLEncoder.encode("wall_mount_24f_with_sc_pc_adapters_and_pigtails","UTF-8")+"="+URLEncoder.encode(num28,"UTF-8")+"&"+
                        URLEncoder.encode("wall_mount_48f_with_sc_pc_adapters_and_pigtails","UTF-8")+"="+URLEncoder.encode(num29,"UTF-8")+"&"+
                        URLEncoder.encode("coupler","UTF-8")+"="+URLEncoder.encode(num30,"UTF-8")+"&"+
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
        {progDailog.dismiss();
            if(result.matches(".*\\btrue\\b.*"))
        {
            Toast.makeText(getBaseContext(), "Submission successful ", Toast.LENGTH_SHORT).show();

            ed0.setText("");
            ed1.setText("");
            ed2.setText("");
            ed3.setText("");
            ed4.setText("");
            ed5.setText("");
            ed6.setText("");
            ed7.setText("");
            ed8.setText("");
            ed9.setText("");
            ed10.setText("");
            ed11.setText("");
            ed12.setText("");
            ed13.setText("");
            ed14.setText("");
            ed15.setText("");
            ed16.setText("");
            ed17.setText("");
            ed18.setText("");
            ed19.setText("");
            ed20.setText("");
            ed21.setText("");
            ed22.setText("");
            ed23.setText("");
            ed24.setText("");
            ed25.setText("");
            ed26.setText("");
            ed27.setText("");
            ed28.setText("");
            ed29.setText("");
            ed30.setText("");
            if(cb1.isChecked())
            {
                cb1.toggle();
            }
            if(cb2.isChecked())
            {
                cb2.toggle();
            }
            if(cb3.isChecked())
            {
                cb3.toggle();
            }
            if(cb4.isChecked())
            {
                cb4.toggle();
            }
            if(cb5.isChecked())
            {
                cb5.toggle();
            }
            if(cb6.isChecked())
            {
                cb6.toggle();
            }
            if(cb7.isChecked())
            {
                cb7.toggle();
            }
            if(cb8.isChecked())
            {
                cb8.toggle();
            }
            if(cb9.isChecked())
            {
                cb9.toggle();
            }
            if(cb10.isChecked())
            {
                cb10.toggle();
            }
            if(cb11.isChecked())
            {
                cb11.toggle();
            }
            if(cb12.isChecked())
            {
                cb12.toggle();
            }
            if(cb13.isChecked())
            {
                cb13.toggle();
            }
            if(cb14.isChecked())
            {
                cb14.toggle();
            }
            if(cb15.isChecked())
            {
                cb15.toggle();
            }
            if(cb16.isChecked())
            {
                cb16.toggle();
            }
            if(cb17.isChecked())
            {
                cb17.toggle();
            }
            if(cb18.isChecked())
            {
                cb18.toggle();
            }
            if(cb19.isChecked())
            {
                cb19.toggle();
            }
            if(cb20.isChecked())
            {
                cb20.toggle();
            }
            if(cb21.isChecked())
            {
                cb21.toggle();
            }
            if(cb22.isChecked())
            {
                cb22.toggle();
            }
            if(cb23.isChecked())
            {
                cb23.toggle();
            }
            if(cb24.isChecked())
            {
                cb24.toggle();
            }
            if(cb25.isChecked())
            {
                cb25.toggle();
            }
            if(cb26.isChecked())
            {
                cb26.toggle();
            }
            if(cb27.isChecked())
            {
                cb27.toggle();
            }
            if(cb28.isChecked())
            {
                cb28.toggle();
            }
            if(cb29.isChecked())
            {
                cb29.toggle();
            }
            if(cb30.isChecked())
            {
                cb30.toggle();
            }
            Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            if (cameraIntent.resolveActivity(getPackageManager()) != null) {

                try {
                    photoFile = createImageFile();


                } catch (IOException ex) {

                    Toast.makeText(getBaseContext(),"Error", Toast.LENGTH_SHORT).show();
                }

                if (photoFile != null ) {

                    if(Build.VERSION.SDK_INT >=24)
                    {
                        cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, FileProvider.getUriForFile(Project.this,
                                BuildConfig.APPLICATION_ID + ".provider",
                                photoFile));
                    }
                    else
                    {
                        cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(photoFile));
                    }
                    startActivityForResult(cameraIntent, REQUEST_IMAGE_CAPTURE);
                    completed=true;


                }


            }

        }
            else if(result.matches(".*\\bExceeded limit\\b.*") || result.matches(".*\\bNothing Assigned\\b.*") )
            {
                Toast.makeText(getBaseContext(), "Not enough resources", Toast.LENGTH_SHORT).show();

            }
            else if(result.matches(".*\\bFalse\\b.*"))
            {
                Toast.makeText(getBaseContext(), "The Worksite_No is already in use", Toast.LENGTH_SHORT).show();
            }
        }
    }

    class dispTask extends AsyncTask<String,Void,String>
    {String add_info_url;
        ProgressDialog progDailog;
        @Override
        protected void onPreExecute()
        {
            add_info_url="http://suphds.hostingerapp.com/dispp.php";
            progDailog = new ProgressDialog(Project.this);
            progDailog.setMessage("Loading...");
            progDailog.setIndeterminate(false);
            progDailog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progDailog.setCancelable(true);
            progDailog.show();
        }
        @Override
        protected String doInBackground(String... args)
        {String userid,what="0";
            userid=args[0];
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

                    Toast.makeText(getApplicationContext(),"Done",Toast.LENGTH_SHORT).show();

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
    public boolean isCameraUsebyApp() {
        Camera camera = null;
        try {
            camera = Camera.open();
        } catch (RuntimeException e) {
            return false;
        } finally {
            if (camera != null) camera.release();
        }
        return true;
    }
}
