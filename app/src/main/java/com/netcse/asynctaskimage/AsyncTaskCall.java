package com.netcse.asynctaskimage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by netcse on 9/8/2015.
 */
public class AsyncTaskCall extends AsyncTask<String, Void, Bitmap> {

    File tmp = new File("/sdcard/asynctask/");
    private ImageView imageView;
    private TextView tv;


    public AsyncTaskCall(TextView tv, ImageView imageView) {
        this.tv = tv;
        this.imageView = imageView;
    }

    @Override
    protected Bitmap doInBackground(String... params) {
        try {

            tmp.mkdirs();

            // This is for download and making IO call
            // new NetworkAndDiskIO().download();

            URL url = new URL(params[0]);
            System.out.println(url);
            URLConnection conn = url.openConnection();
            conn.setConnectTimeout(3000);
            conn.setReadTimeout(5000);
            return BitmapFactory.decodeStream(url.openStream());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    protected void onPostExecute(Bitmap bitmap) {
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
            tv.setText("Confirmed");
        }
    }
}
