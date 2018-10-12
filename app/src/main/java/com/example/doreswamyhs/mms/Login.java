package com.example.doreswamyhs.mms;

import android.Manifest;
import android.app.AlertDialog;

import android.app.ProgressDialog;
import android.content.Context;

import android.content.DialogInterface;
import android.content.Intent;

import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

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


public class Login extends AppCompatActivity {
    TextView USER_NAME,USER_PASS;
    AlertDialog alertDialog;
    String user_name,user_pass;

    boolean loginstatus = false;
    private static final String TAG="Login";
    String[] permissions = new String[]{
            Manifest.permission.CAMERA,
            Manifest.permission.INTERNET,
            Manifest.permission.READ_PHONE_STATE,
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE,

    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_login);
        Log.d(TAG,"OnCreate:Started");
        findViewById(R.id.textView8).setVisibility(View.INVISIBLE);
        checkPermissions();


        USER_NAME =(EditText)findViewById(R.id.editText3);
        USER_PASS=(EditText)findViewById(R.id.editText);
        ImageView iv=findViewById(R.id.imageView);
        iv.setImageResource(R.drawable.img1);
        Button button=(Button)findViewById(R.id.button);
        ConnectivityManager connectivityManager=(ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo=connectivityManager.getActiveNetworkInfo();
        if(networkInfo!=null && networkInfo.isConnected())
        {
            Toast.makeText(this,"Internet Access", Toast.LENGTH_SHORT);
        }
        else
        {
            findViewById(R.id.textView8).setVisibility(View.VISIBLE);
            AlertDialog alertDialog=new AlertDialog.Builder(this).create();
            alertDialog.setMessage("No Internet Access");
             alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            System.exit(0);
                        }
                    });
             alertDialog.show();

        }

        ImageButton imageButton=findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                USER_PASS.setTransformationMethod(null);

            }
        });

    }
    public void test(View v)
    {
        user_name=USER_NAME.getText().toString();
        user_pass=USER_PASS.getText().toString();
        user_name=user_name.toUpperCase();
        if(user_name.isEmpty())
        {
            Toast.makeText(this,"Please enter a USER_ID", Toast.LENGTH_SHORT).show();
        }
        else if(user_pass.isEmpty())
        {
            Toast.makeText(this,"Please enter PASSWORD", Toast.LENGTH_SHORT).show();
        }
        else if((user_name.charAt(0)=='U' && user_name.charAt(1)=='G') || (user_name.charAt(0)=='P') || (user_name.charAt(0)=='F' && user_name.charAt(1)=='I' && user_name.charAt(2)=='N') || (user_name.charAt(0)=='C' && user_name.charAt(1)=='I' && user_name.charAt(2)=='N') || user_name.equals("ADMIN")  )
        {

            BackgroundTask backgroundTask = new BackgroundTask();
            backgroundTask.execute(user_name, user_pass);
        }

        else {
            Toast.makeText(this,"Please enter Valid USER_ID", Toast.LENGTH_SHORT).show();
            USER_NAME.setText("");
        }
        }
    private boolean checkPermissions() {
        int result;
        List<String> listPermissionsNeeded = new ArrayList<>();
        for (String p : permissions) {
            result = ContextCompat.checkSelfPermission(this, p);
            if (result != PackageManager.PERMISSION_GRANTED) {
                listPermissionsNeeded.add(p);
            }
        }
        if (!listPermissionsNeeded.isEmpty()) {
            ActivityCompat.requestPermissions(this, listPermissionsNeeded.toArray(new String[listPermissionsNeeded.size()]), 100);
            return false;
        }
        return true;
    }
    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        if (requestCode == 100) {
            if (grantResults.length > 0
                    && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                // do something
            }
            return;
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.in_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.item1:
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9844441071"));
                startActivity(intent);
                return true;
            case R.id.item2:
                Intent emailIntent=new Intent(Intent.ACTION_SEND);
                emailIntent.setType("text/plain");
                startActivity(emailIntent);

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }



    class BackgroundTask extends AsyncTask<String,Void,String>
    {String add_info_url;
        ProgressDialog progDailog;
        @Override
        protected void onPreExecute()
        {
            add_info_url="http://suphds.hostingerapp.com/login.php";
            progDailog = new ProgressDialog(Login.this);
            progDailog.setMessage("Loading...");
            progDailog.setIndeterminate(false);
            progDailog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progDailog.setCancelable(true);
            progDailog.show();
        }
        @Override
        protected String doInBackground(String... args)
        {String userid,pass;
            userid=args[0];
            pass=args[1];
            try{
                URL url=new URL(add_info_url);
              /*  Authenticator.setDefault(new Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username,password.toCharArray());
                    }
                });*/
                HttpURLConnection httpURLConnection=(HttpURLConnection)url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                OutputStream outputStream=httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(outputStream,"UTF-8"));
                String data_string= URLEncoder.encode("userid","UTF-8")+"="+URLEncoder.encode(userid,"UTF-8")+"&"+
                        URLEncoder.encode("password","UTF-8")+"="+URLEncoder.encode(pass,"UTF-8");
                bufferedWriter.write(data_string);
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStream.close();
                InputStream inputStream=httpURLConnection.getInputStream();
                BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(inputStream,"iso-8859-1"));
                String response="";
                String line="";
                line=bufferedReader.readLine();
                String line1=bufferedReader.readLine();
                /*while((line=bufferedReader.readLine())!=null)
                { line=line.trim();

                 response+=line;
                }*/
                bufferedReader.close();
                inputStream.close();
                httpURLConnection.disconnect();
                return line;
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
            success();
            }
            else
            {
                Toast.makeText(getBaseContext(), "Invalid Credentials...", Toast.LENGTH_SHORT).show();
                USER_NAME.setText("");
                USER_PASS.setText("");
            }
        }
    }
    public void success()
    {
        String NAME=user_name;
        loginstatus=true;

        if(loginstatus)
        {
            Toast.makeText(getBaseContext(), "Login Successful..."+NAME, Toast.LENGTH_SHORT).show();
            if(NAME.charAt(0)=='U' && NAME.charAt(1)=='G'){
                Intent intent=new Intent(getBaseContext(),ugcm.class);
                intent.putExtra("Name",NAME);
                startActivity(intent);

            }
            else if(NAME.charAt(0)=='P'){
                Intent intent=new Intent(getBaseContext(),Project.class);
                intent.putExtra("Name",NAME);
                startActivity(intent);

            }
            else if(NAME.charAt(0)=='C' && NAME.charAt(1)=='I' && NAME.charAt(2)=='N'){
                Intent intent=new Intent(getBaseContext(),CopperInstallation.class);
                intent.putExtra("Name",NAME);
                startActivity(intent);

            }
            else if(NAME.charAt(0)=='F' && NAME.charAt(1)=='I' && NAME.charAt(2)=='N'){
                Intent intent=new Intent(getBaseContext(),FibreInstallation.class);
                intent.putExtra("Name",NAME);
                startActivity(intent);

            }
            else if(NAME.equals("ADMIN")){
                Intent intent=new Intent(getBaseContext(),AdminPage.class);
                startActivity(intent);

            }
            else
            {
                Toast.makeText(getBaseContext(), "Invalid Credentials...", Toast.LENGTH_SHORT).show();
            }

        }

        USER_NAME.setText("");
        USER_PASS.setText("");
    }

    @Override
    public void onBackPressed() {
        backButtonhandler();
        return;
    }

    public void backButtonhandler()
    {
        final AlertDialog.Builder alertdialog=new AlertDialog.Builder(Login.this);
        alertdialog.setTitle("Leave Application");
        alertdialog.setMessage("Are u sure u want to leave the application");
        //alertdialog.setIcon(R.drawable.dialog_icon);
        alertdialog.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        alertdialog.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
    alertdialog.show();
    }
}


