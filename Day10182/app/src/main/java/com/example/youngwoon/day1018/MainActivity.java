package com.example.youngwoon.day1018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    static MyView mv;
    Button bt;
    MyHandler myHandler;
    boolean flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myHandler = new MyHandler();
        bt = (Button)findViewById(R.id.bt);

        mv = (MyView)findViewById(R.id.mv);



    }

    public void onClicked(View v){
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
