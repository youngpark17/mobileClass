package com.example.youngwoon.day1019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    static MyView myView;
    Button bt;
    MyHandler myHandler;
    boolean flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt = (Button)findViewById(R.id.bt);
        myView=(MyView)findViewById(R.id.mv);
        myHandler = new MyHandler();
    }

    public void onClicked(View view){
        if(!flag){
            myHandler.sendEmptyMessage(1);
            flag=true;
        }
        else{
            myHandler.removeMessages(1);
            flag=false;
        }
    }
}
