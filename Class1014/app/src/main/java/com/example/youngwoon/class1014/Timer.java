package com.example.youngwoon.class1014;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

public class Timer extends Handler {
    int mCnt=0;

    @Override
    public void handleMessage(Message msg) {

        super.handleMessage(msg);
        switch(msg.what){
            case 1:
                Log.d("TimerHandler","Timer:"+mCnt++);
                MainActivity.mView.mY+=50;
                MainActivity.mView.invalidate();
                sendEmptyMessageDelayed(1,1000);

                break;
        }

    }
}
