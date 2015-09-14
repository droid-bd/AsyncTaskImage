package com.netcse.asynctaskimage;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


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


        // Dynamic UI Elements

        Button myButton = new Button(this);
        myButton.setText("Press me");

        myButton.setBackgroundColor(Color.YELLOW);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
//[x]
                    // Uri number = Uri.parse("tel:5551234");
                    // Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    // startActivity(callIntent);
//[x]
                    // Map point based on address
                    //Uri location = Uri.parse("geo:0,0?q=1600+Amphitheatre+Parkway,+Mountain+View,+California");
                    // Or map point based on latitude/longitude
//                    Uri location = Uri.parse("geo:37.422219,-122.08364?z=14"); // z param is zoom level
//                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
//                    startActivity(mapIntent);

//[x]
//                    Uri webpage = Uri.parse("http://www.android.com");
//                    Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
//                    startActivity(webIntent);

//[x]
//                    Uri location = Uri.parse("geo:0,0?q=1600+Amphitheatre+Parkway,+Mountain+View,+California");
//                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
//
//                    // Verify it resolves
//                    PackageManager packageManager = getPackageManager();
//                    List<ResolveInfo> activities = packageManager.queryIntentActivities(mapIntent, 0);
//                    boolean isIntentSafe = activities.size() > 0;
//
//                    // Start an activity if it's safe
//                    if (isIntentSafe) {
//                        startActivity(mapIntent);
//                    }

//[x]
//                    Intent intent = new Intent(Intent.ACTION_SEND);
//                    // Always use string resources for UI text
//                    // This says something like "Share this photo with"
//
//                    String title = getResources().getString(R.string.chooser_title);
//
//                    // create intent to show chooser
//                    Intent chooser = Intent.createChooser(intent, title);
//
//                    // verify the intent will resolve to at least one activity
//                    if (intent.resolveActivity(getPackageManager()) != null) {
//                        startActivity(chooser);
//                    }
// end of file:///C:/Android/SDK/docs/training/basics/intents/sending.html



                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "Can't do that", Toast.LENGTH_SHORT).show();
                }
            }
        });

        RelativeLayout myLayout = new RelativeLayout(this);
        myLayout.setBackgroundColor(Color.BLUE);

        myLayout.addView(myButton);
        setContentView(myLayout);


    }

}




























