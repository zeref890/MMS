package com.example.doreswamyhs.mms;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import android.widget.Button;
import android.widget.EditText;
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

public class NewUserAdmin extends AppCompatActivity {
    TextView USER_NAME, USER_PASS;
    String user_name, user_pass;
    Button REG;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user_admin);

        USER_NAME = (EditText) findViewById(R.id.useridadm);
        USER_PASS = (EditText) findViewById(R.id.userpwdadm);
        REG = (Button) findViewById(R.id.button9);
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {
            Toast.makeText(getBaseContext(), "Internet Access", Toast.LENGTH_SHORT);
        }

    }

    public void createuser(View view) {
        user_name = USER_NAME.getText().toString();
        user_pass = USER_PASS.getText().toString();
        user_name = user_name.toUpperCase();
        if (user_name.isEmpty()) {
            Toast.makeText(this, "Please enter a USER_ID", Toast.LENGTH_SHORT).show();
        } else if (user_pass.isEmpty()) {
            Toast.makeText(this, "Please enter PASSWORD", Toast.LENGTH_SHORT).show();
        } else if ((user_name.charAt(0) == 'U' && user_name.charAt(1) == 'G') || (user_name.charAt(0) == 'P') || (user_name.charAt(0) == 'F' && user_name.charAt(1) == 'I' && user_name.charAt(2) == 'N') || (user_name.charAt(0) == 'C' && user_name.charAt(1) == 'I' && user_name.charAt(2) == 'N')) {
            BackgroundTask backgroundTask = new BackgroundTask();
            backgroundTask.execute(user_name, user_pass);
            USER_NAME.setText("");
            USER_PASS.setText("");

        } else {
            Toast.makeText(this, "Please enter Valid USER_ID", Toast.LENGTH_SHORT).show();
            USER_NAME.setText("");
        }

    }

    class BackgroundTask extends AsyncTask<String,Void,String>
    {String add_info_url;
        ProgressDialog progDailog;
        @Override
        protected void onPreExecute()
        {
            add_info_url="http://suphds.hostingerapp.com/add_info.php";
            progDailog = new ProgressDialog(NewUserAdmin.this);
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
                Toast.makeText(getBaseContext(), "Successfully Added New User", Toast.LENGTH_SHORT).show();
                finish();
            }
            else
            {
                Toast.makeText(getBaseContext(), "User Already Exists", Toast.LENGTH_SHORT).show();
                USER_NAME.setText("");

            }
        }
    }
}
