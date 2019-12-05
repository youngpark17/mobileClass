package com.example.youngwoon.forfinalexam;

import android.os.Handler;
import android.os.Message;

public class MyHandler extends Handler {

    @Override
    public void handleMessage(Message msg) {
        super.handleMessage(msg);
        MainActivity.mv.invalidate();
        sendEmptyMessageDelayed(1,1000);
    }
}
