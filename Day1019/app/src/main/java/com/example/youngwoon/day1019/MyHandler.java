package com.example.youngwoon.day1019;

import android.os.Handler;
import android.os.Message;

import java.util.Random;

public class MyHandler extends Handler {

    @Override
    public void handleMessage(Message msg) {
        if(msg.what ==1 ){
            MainActivity.myView.invalidate();
            sendEmptyMessageDelayed(1,1000);
        }
    }
}
