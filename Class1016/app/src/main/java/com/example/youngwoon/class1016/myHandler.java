package com.example.youngwoon.class1016;

import android.os.Handler;
import android.os.Message;

public class myHandler extends Handler {

    @Override
    public void handleMessage(Message msg) {
        if(msg.what==1){
            MainActivity.mv.invalidate();
            sendEmptyMessageDelayed(1,1000);
        }
    }
}
