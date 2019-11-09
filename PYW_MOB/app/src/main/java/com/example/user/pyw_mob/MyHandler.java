package com.example.user.pyw_mob;

import android.os.Handler;
import android.os.Message;

public class MyHandler extends Handler {

    @Override
    public void handleMessage(Message msg) {
        MainActivity.mv.invalidate();
        sendEmptyMessageDelayed(1,1000);
        super.handleMessage(msg);
    }
}
