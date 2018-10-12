package com.example.doreswamyhs.mms;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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

public class total_assign_p extends AppCompatActivity {
    ToolTipManager tooltips;
    CheckBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14,cb15,cb16,cb17,cb18,cb19,cb20,cb21,cb22,cb23,cb24,cb25,cb26,cb27,cb28,cb29,cb30;
    EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7,ed8,ed9,ed10,ed11,ed12,ed13,ed14,ed15,ed16,ed17,ed18,ed19,ed20,ed21,ed22,ed23,ed24,ed25,ed26,ed27,ed28,ed29,ed30;
    int num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,num11,num12,num13,num14,num15,num16,num17,num18,num19,num20,num21,num22,num23,num24,num25,num26,num27,num28,num29,num30;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total_assign_p);
        TextView tv=findViewById(R.id.ed128);
        tv.setVisibility(View.INVISIBLE);
        tooltips =new ToolTipManager(this);
        //tooltips
        findViewById(R.id.ed129).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("Blue(in mts)")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);

                return true;
            }
        });


        findViewById(R.id.ed130).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("Green(in mts)")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);

                return true;
            }
        });



        findViewById(R.id.ed131).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("Orange(in mts)")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);

                return true;
            }
        });


        findViewById(R.id.ed132).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("DWC Duct(in mts)")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);

                return true;
            }
        });





        findViewById(R.id.ed133).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("ARM 24 FWD(in mts)")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);

                return true;
            }
        });


        findViewById(R.id.ed134).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("ARM 48 FWD(in mts)")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);

                return true;
            }
        });



        findViewById(R.id.ed136).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("ARM 96 FWD(in mts)")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);

                return true;
            }
        });


        findViewById(R.id.ed135).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("UNARM 24 FWD(in mts)")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);

                return true;
            }
        });


        findViewById(R.id.ed137).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("UNARM 48 FWD(in mts)")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);

                return true;
            }
        });

        findViewById(R.id.ed138).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("UNARM 96 FWD(in mts)")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);

                return true;
            }
        });

        findViewById(R.id.ed139).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("ADSS CABLE(in mts)")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);

                return true;
            }
        });

        findViewById(R.id.ed140).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("Electronic Ball Marker(Unit)")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);

                return true;
            }
        });

        findViewById(R.id.ed141).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("Endplug(Unit)")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);

                return true;
            }
        });

        findViewById(R.id.ed142).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("FAT BOX-16F(unit)")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);

                return true;
            }
        });

        findViewById(R.id.ed143).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("FAT BOX-32F(unit)")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);

                return true;
            }
        });


        findViewById(R.id.ed144).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("FMS Set(unit)")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);

                return true;
            }
        });


        findViewById(R.id.ed145).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("FOSC-BJC-24 FIBER(unit)")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);

                return true;
            }
        });


        findViewById(R.id.ed146).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("FOSC-BJC-48 FIBER(unit)")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);

                return true;
            }
        });


        findViewById(R.id.ed147).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("FOSC-BJC-96 FIBER(unit)")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);

                return true;
            }
        });


        findViewById(R.id.ed148).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("ODF-144 Wall Mount(unit)")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);

                return true;
            }
        });



        findViewById(R.id.ed149).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("ODF(144F)Cabinet(O/I)(unit)")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);

                return true;
            }
        });



        findViewById(R.id.ed150).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("ODF(96F)Cabinet(O/I)(unit)")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);

                return true;
            }
        });

        findViewById(R.id.ed151).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("ODF Rack(unit)")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);

                return true;
            }
        });



        findViewById(R.id.ed152).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("Pole Base(unit)")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);

                return true;
            }
        });




        findViewById(R.id.ed153).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("POLES(unit)")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);

                return true;
            }
        });


        findViewById(R.id.ed154).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("SPLITTERS 1:16(unit)")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);

                return true;
            }
        });



        findViewById(R.id.ed155).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("SPLITTERS 1:8(unit)")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);

                return true;
            }
        });


        findViewById(R.id.ed156).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("Wall Mount 24F with SC-PC Adapters and pigtails(unit)")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);

                return true;
            }
        });




        findViewById(R.id.ed157).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("Wall Mount 48F with SC-PC Adapters and pigtails(unit)")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);

                return true;
            }
        });



        findViewById(R.id.ed158).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ToolTip toolTip = new ToolTip()
                        .withText("Coupler(unit)")
                        .withAnimationType(ToolTip.AnimationType.FROM_MASTER_VIEW)
                        .withShadow();
                tooltips.showToolTip(toolTip, v);

                return true;
            }
        });
        //upload to db
        cb1=findViewById(R.id.cb127);
        ed1=findViewById(R.id.ed129);
        cb2=findViewById(R.id.cb128);
        ed2=findViewById(R.id.ed130);
        cb3=findViewById(R.id.cb129);
        ed3=findViewById(R.id.ed131);
        cb4=findViewById(R.id.cb130);
        ed4=findViewById(R.id.ed132);
        cb5=findViewById(R.id.cb131);
        ed5=findViewById(R.id.ed133);
        cb6=findViewById(R.id.cb132);
        ed6=findViewById(R.id.ed134);
        cb7=findViewById(R.id.cb133);
        ed7=findViewById(R.id.ed136);
        cb8=findViewById(R.id.cb134);
        ed8=findViewById(R.id.ed135);
        cb9=findViewById(R.id.cb135);
        ed9=findViewById(R.id.ed137);
        cb10=findViewById(R.id.cb136);
        ed10=findViewById(R.id.ed138);
        cb11=findViewById(R.id.cb137);
        ed11=findViewById(R.id.ed139);
        cb12=findViewById(R.id.cb138);
        ed12=findViewById(R.id.ed140);
        cb13=findViewById(R.id.cb139);
        ed13=findViewById(R.id.ed141);
        cb14=findViewById(R.id.cb140);
        ed14=findViewById(R.id.ed142);
        cb15=findViewById(R.id.cb141);
        ed15=findViewById(R.id.ed143);
        cb16=findViewById(R.id.cb142);
        ed16=findViewById(R.id.ed144);
        cb17=findViewById(R.id.cb143);
        ed17=findViewById(R.id.ed145);
        cb18=findViewById(R.id.cb144);
        ed18=findViewById(R.id.ed146);
        cb19=findViewById(R.id.cb145);
        ed19=findViewById(R.id.ed147);
        cb20=findViewById(R.id.cb146);
        ed20=findViewById(R.id.ed148);
        cb21=findViewById(R.id.cb147);
        ed21=findViewById(R.id.ed149);
        cb22=findViewById(R.id.cb148);
        ed22=findViewById(R.id.ed150);
        cb23=findViewById(R.id.cb149);
        ed23=findViewById(R.id.ed151);
        cb24=findViewById(R.id.cb150);
        ed24=findViewById(R.id.ed152);
        cb25=findViewById(R.id.cb151);
        ed25=findViewById(R.id.ed153);
        cb26=findViewById(R.id.cb152);
        ed26=findViewById(R.id.ed154);
        cb27=findViewById(R.id.cb153);
        ed27=findViewById(R.id.ed155);
        cb28=findViewById(R.id.cb155);
        ed28=findViewById(R.id.ed156);
        cb29=findViewById(R.id.cb156);
        ed29=findViewById(R.id.ed157);
        cb30=findViewById(R.id.cb154);
        ed30=findViewById(R.id.ed158);
        findViewById(R.id.b103).setOnClickListener(new View.OnClickListener() {
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
                MyTaskParams myTaskParams=new MyTaskParams(num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,num11,num12,num13,num14,num15,num16,num17,num18,num19,num20,num21,num22,num23,num24,num25,num26,num27,num28,num29,num30,date_str);
                BackgroundTask backgroundTask=new BackgroundTask();
                backgroundTask.execute(myTaskParams);

            }
        });
        CountDownTimer newtimer=new CountDownTimer(10000000,1000) {
            @Override
            public void onTick(long l) {
                TextView et=(TextView) findViewById(R.id.txt110);
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
    public void onDestroy() {
        super.onDestroy();
        tooltips.onDestroy();
        tooltips = null;
    }
    private static class MyTaskParams{
        String id,date_str;
        String num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,num11,num12,num13,num14,num15,num16,num17,num18,num19,num20,num21,num22,num23,num24,num25,num26,num27,num28,num29,num30;
        MyTaskParams(int num1,int num2,int num3,int num4,int num5,int num6,int num7,int num8,int num9,int num10,int num11,int num12,int num13,int num14,int num15,int num16,int num17,int num18,int num19,int num20,int num21,int num22,int num23,int num24,int num25,int num26,int num27,int num28,int num29,int num30,String date_str)
        {

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
            add_info_url="http://suphds.hostingerapp.com/total_p.php";
            progDailog = new ProgressDialog(total_assign_p.this);
            progDailog.setMessage("Loading...");
            progDailog.setIndeterminate(false);
            progDailog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progDailog.setCancelable(true);
            progDailog.show();
        }
        @Override
        protected String doInBackground(MyTaskParams... args)
        {String time;
            String num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,num11,num12,num13,num14,num15,num16,num17,num18,num19,num20,num21,num22,num23,num24,num25,num26,num27,num28,num29,num30;

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
                String data_string= URLEncoder.encode("blue","UTF-8")+"="+URLEncoder.encode(num1,"UTF-8")+"&"+
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
        { progDailog.dismiss();
            if(result.matches(".*\\btrue\\b.*"))
            {
                Toast.makeText(getBaseContext(), "Submission successful ", Toast.LENGTH_SHORT).show();
                finish();
            }
            else
            {
                Toast.makeText(getBaseContext(), "Not enough resources...", Toast.LENGTH_SHORT).show();


            }
        }
    }
}
