package com.example.youngwoon.class1021_2;

import android.os.Handler;
import android.os.Message;

import java.util.Random;

public class MyHandler extends Handler {
    Random rd;

    @Override
    public void handleMessage(Message msg) {
        super.handleMessage(msg);
        rd = new Random();
        if(msg.what==1){
            MainActivity.myView.mx = rd.nextInt(MainActivity.myView.getWidth()-60)+30;
            MainActivity.myView.my = rd.nextInt(MainActivity.myView.getHeight()-60)+30;
            MainActivity.myView.invalidate();
            sendEmptyMessageDelayed(1,1000);
        }
    }
}
