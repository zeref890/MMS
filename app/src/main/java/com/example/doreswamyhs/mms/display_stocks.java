package com.example.doreswamyhs.mms;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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

public class display_stocks extends AppCompatActivity {
    String str;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_stocks);
        Button button=findViewById(R.id.b10);
        editText=findViewById(R.id.ed2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = editText.getText().toString();
                str=str.toUpperCase();
                if(str.isEmpty())
                {
                    Toast.makeText(getBaseContext(),"Please enter a USER_ID", Toast.LENGTH_SHORT).show();
                }

                else if((str.charAt(0)=='U' && str.charAt(1)=='G') || (str.charAt(0)=='P') || (str.charAt(0)=='F' && str.charAt(1)=='I' && str.charAt(2)=='N') || (str.charAt(0)=='C' && str.charAt(1)=='I' && str.charAt(2)=='N') )
                {
                    BackgroundTask backgroundTask = new BackgroundTask();
                    backgroundTask.execute(str);
                    editText.setText("");


                }
                else {
                    Toast.makeText(getBaseContext(),"Please enter Valid USER_ID", Toast.LENGTH_SHORT).show();
                    editText.setText("");
                }
            }
        });
    }

    class BackgroundTask extends AsyncTask<String,Void,String>
    {String add_info_url;
        ProgressDialog progDailog;
        @Override
        protected void onPreExecute()
        {
            add_info_url="http://suphds.hostingerapp.com/check.php";
            progDailog = new ProgressDialog(display_stocks.this);
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
                Toast.makeText(getBaseContext(), "Invalid UserId...", Toast.LENGTH_SHORT).show();

            }
        }
    }
    private void success()
    {
        if(str.charAt(0)=='U' && str.charAt(1)=='G'){
            Intent intent=new Intent(getBaseContext(),display_ug.class);
            intent.putExtra("str",str);
            startActivity(intent);

        }
        else if(str.charAt(0)=='P'){
            Intent intent=new Intent(getBaseContext(),display_p.class);
            intent.putExtra("str",str);
            startActivity(intent);

        }
        else if(str.charAt(0)=='C' && str.charAt(1)=='I' && str.charAt(2)=='N'){
            Intent intent=new Intent(getBaseContext(),display_c.class);
            intent.putExtra("str",str);
            startActivity(intent);

        }
        else if(str.charAt(0)=='F' && str.charAt(1)=='I' && str.charAt(2)=='N'){
            Intent intent=new Intent(getBaseContext(),display.class);
            intent.putExtra("str",str);
            startActivity(intent);

        }
        else
        {
            Toast.makeText(getBaseContext(), "Invalid UserId...", Toast.LENGTH_SHORT).show();

        }
        editText.setText("");

    }
}
