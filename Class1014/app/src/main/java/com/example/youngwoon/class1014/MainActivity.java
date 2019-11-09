package com.example.youngwoon.class1014;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static MyView mView;
    Timer mHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mView = new MyView(this);
        mHandler = new Timer();
        setContentView(mView);
    }



    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch(keyCode){

            case KeyEvent.KEYCODE_S:
                mHandler.sendEmptyMessage(1);
                Toast.makeText(getApplicationContext(),"시작",Toast.LENGTH_SHORT).show();
                break;

            case KeyEvent.KEYCODE_E:
                mHandler.removeMessages(1);
                mHandler.mCnt=0;
                Toast.makeText(getApplicationContext(),"종료",Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onKeyDown(keyCode, event);
    }
}
