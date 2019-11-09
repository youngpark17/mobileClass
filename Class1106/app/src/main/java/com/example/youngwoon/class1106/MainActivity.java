package com.example.youngwoon.class1106;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    myView mv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState !=null){
            setContentView(R.layout.activity_main);
            mv=(myView)findViewById(R.id.mv);
            mv.mx=savedInstanceState.getIntArray("mx");
            mv.my=savedInstanceState.getIntArray("my");

        }
        else{
            setContentView(R.layout.activity_main);
            mv=(myView)findViewById(R.id.mv);
        }

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putIntArray("mx",mv.mx);
        outState.putIntArray("my",mv.my);
    }
}
