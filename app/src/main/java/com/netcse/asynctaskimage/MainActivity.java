package com.netcse.asynctaskimage;

import android.content.Intent;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {
//    ImageView iv;
//    TextView tv;


    @Override
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        // ScrollView sv = new ScrollView(this);
        setContentView(R.layout.activity_main);

        final LinearLayout lm = (LinearLayout) findViewById(R.id.linearMain);



        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

        //Create four
        for(int j=0;j<=4;j++)
        {
            // Create LinearLayout
            LinearLayout ll = new LinearLayout(this);
            ll.setOrientation(LinearLayout.HORIZONTAL);

            // Create TextView
            TextView product = new TextView(this);
            product.setText(" Product"+j+"    ");
            ll.addView(product);

            // Create TextView
            TextView price = new TextView(this);
            price.setText("  $"+j+"     ");
            ll.addView(price);

            // Create Button
            final Button btn = new Button(this);
            // Give button an ID
            btn.setId(j+1);
            btn.setText("Add To Cart");
            // set the layoutParams on the button
            btn.setLayoutParams(params);

            final int index = j;
            // Set click listener for button
            btn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    Log.i("TAG", "index :" + index);

                    Toast.makeText(getApplicationContext(),
                            "Clicked Button Index :" + index,
                            Toast.LENGTH_LONG).show();

                }
            });

            //Add button to LinearLayout
            ll.addView(btn);
            //Add button to LinearLayout defined in XML
            lm.addView(ll);
        }

    }

/*

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        iv = (ImageView) findViewById(R.id.imageDownload);
//        tv = (TextView) findViewById(R.id.confirmText);
//
//        AsyncTaskCall asyncTaskCall = new AsyncTaskCall(tv, iv);
        String url = "https://www.google.com.bd/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png";
//        asyncTaskCall.execute(url);


        // Dynamic UI Elements

        ImageView imageViewDynamic = new ImageView(this);
        TextView textViewDynamic = new TextView(this);

        AsyncTaskCall asyncTaskCall = new AsyncTaskCall(textViewDynamic, imageViewDynamic);
        asyncTaskCall.execute(url);


        Button myButton = new Button(this);
        myButton.setText("Press me");

        myButton.setBackgroundColor(Color.MAGENTA);
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
        myLayout.setBackgroundColor(Color.GRAY);

        myLayout.addView(myButton);

        myLayout.addView(imageViewDynamic);
        myLayout.addView(textViewDynamic);
        setContentView(myLayout);


    }


*/

}




























