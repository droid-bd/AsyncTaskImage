package com.netcse.asynctaskimage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    ImageView iv;
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv = (ImageView) findViewById(R.id.imageDownload);
        tv = (TextView) findViewById(R.id.confirmText);

        AsyncTaskCall asyncTaskCall = new AsyncTaskCall(tv, iv);
        String url = "https://www.google.com.bd/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png";
        asyncTaskCall.execute(url);


    }


}




























