package com.example.youngwoon.class1016_2;

import android.os.Handler;
import android.os.Message;

public class myHandler extends Handler {

    @Override
    public void handleMessage(Message msg) {
        super.handleMessage(msg);
        switch(msg.what){
            case 1:

                MainActivity.mv.invalidate();
                break;
        }
    }
}
