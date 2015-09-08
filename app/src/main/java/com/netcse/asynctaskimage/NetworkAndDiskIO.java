package com.netcse.asynctaskimage;


import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

/*
    Class for Calling Http or Network and make Disk IO
 */


/**
 * Created by netcse on 9/8/2015.
 */
public class NetworkAndDiskIO {


    public void download() {
        try {

            for (int i = 0; i < 10; i++) {

                URL google = new URL("http://www.google.com/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");
                InputStream is = google.openStream();

                // for java thread
//                    File tmp = new File("/sdcard/asynctask/");
//                    tmp.mkdir();
//                    File file = new File(tmp, "google" + Integer.toString(i) + ".png");

                File file = new File("/sdcard/asynctask2/", "google" + Integer.toString(i) + ".png");


                // tmp.createNewFile();

                System.out.println("Hello " + i);

                OutputStream os = new FileOutputStream(file);

                byte[] b = new byte[20];
                int length;

                while ((length = is.read(b)) != -1) {

                    os.write(b, 0, length);
                    // os.write(b, 500, length); => java.lang.IndexOutOfBoundsException
                    // b = the source buffer
                    // 0 = the start offset in the data
                    // length = the number of bytes to write

                }
                is.close();
                os.close();

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
