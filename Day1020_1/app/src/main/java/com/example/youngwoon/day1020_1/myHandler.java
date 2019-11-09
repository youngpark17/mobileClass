package com.example.youngwoon.day1020_1;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

public class myHandler extends Handler {
    int Cnt=0;

    @Override
    public void handleMessage(Message msg) {
        if(msg.what==1){
            MainActivity.myView.mx = MainActivity.myView.rd.nextInt(MainActivity.myView.getWidth()-60)+30;
            MainActivity.myView.my = MainActivity.myView.rd.nextInt(MainActivity.myView.getHeight()-60)+30;
            Log.d("TimerHanlder", "Timer Start:"+Cnt++);


            MainActivity.myView.invalidate();
            sendEmptyMessageDelayed(1,1000);
        }
    }
}
