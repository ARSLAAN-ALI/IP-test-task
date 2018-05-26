package com.example.arsalan.ip;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.Formatter;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

public class MainActivity extends AppCompatActivity {
Context context;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button create=(Button)findViewById(R.id.button7);
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                File yourAppDir = new File(Environment.getExternalStorageDirectory()+File.separator+"IP");

                if(!yourAppDir.exists() && !yourAppDir.isDirectory())
                {
                    // create empty directory

                    if (yourAppDir.mkdirs())
                    {
                        Log.i("CreateDir","App dir created");
                    }
                    else
                    {
                        Log.w("CreateDir","Unable to create app dir!");
                    }
                }
                else
                {
                    Toast.makeText(MainActivity.this, "directory created already", Toast.LENGTH_SHORT).show();
                    Log.i("CreateDir","App dir already exists");
                }
            }
        });
Button me=(Button)findViewById(R.id.btn);
me.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        displayactivity();
    }
});
            // savedInstanceState Button ;
        Button clickme = (Button) findViewById(R.id.button);
        clickme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                launchactivity();
            }
        });}

    private void displayactivity() {

        Intent intent=new Intent(this,Main3Activity.class);
        startActivity(intent);
    }

    private void launchactivity(){

        Intent intent=new Intent(this,Main2Activity.class);
        startActivity(intent);



    }
}