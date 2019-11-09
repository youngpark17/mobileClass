package com.example.youngwoon.day1018;

import android.os.Handler;
import android.os.Message;

public class MyHandler extends Handler {

    @Override
    public void handleMessage(Message msg) {
        super.handleMessage(msg);
        switch (msg.what){
            case 1: MainActivity.mv.invalidate();
                MainActivity.mv.mx=50+(int)(Math.random()*(MainActivity.mv.getWidth()-100));
                MainActivity.mv.my=50+(int)(Math.random()*(MainActivity.mv.getHeight()-100));
                sendEmptyMessageDelayed(1,1000);
                break;
        }

//        if(msg.what ==1){
//            MainActivity.mv.invalidate();
//            sendEmptyMessageDelayed(1,1000);
//        }
    }


}
