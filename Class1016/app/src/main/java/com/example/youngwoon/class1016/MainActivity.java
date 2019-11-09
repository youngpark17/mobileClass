package com.example.youngwoon.class1016;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button  b1;
    static myView mv;
    boolean flag;
    myHandler myHandler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.bt1);
        mv=(myView)findViewById(R.id.mv);
        myHandler=new myHandler();
    }

    public void onClick(View view){
        if(!flag){
            flag=true;
            myHandler.sendEmptyMessage(1);
        }
        else{
            flag=false;
            myHandler.removeMessages(1);
        }
    }
}
