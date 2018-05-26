package com.example.arsalan.ip;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
       // TextView text=(TextView)findViewById(R.id.textView);



    }
    public void selectFrag(View view) {
        Fragment fr;
        if(view == findViewById(R.id.button2)) {
            fr = new Fragmenttwo();
        }else {
            fr = new Fragmentone();
        }
        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_place, fr);
        fragmentTransaction.commit();
    }
}
