package com.example.youngwoon.class1022_2;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

import java.util.Random;

public class MyHandler extends Handler {
    int count=0;
    @Override
    public void handleMessage(Message msg) {
        super.handleMessage(msg);
        if(msg.what==1){
            Random rd = new Random();
            MainActivity.myview.mx=rd.nextInt(MainActivity.myview.getWidth()-60)+30;
            MainActivity.myview.my=rd.nextInt(MainActivity.myview.getHeight()-60)+30;
            MainActivity.myview.invalidate();
            sendEmptyMessageDelayed(1,1000);
            Log.d("TimerHandler", "Timer Start: "+count++);
        }

    }
}
