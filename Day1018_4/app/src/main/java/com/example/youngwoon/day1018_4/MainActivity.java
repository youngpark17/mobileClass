package com.example.youngwoon.day1018_4;

import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;

public class MainActivity extends AppCompatActivity {

    MyView mv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mv = findViewById(R.id.mv);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode){
            case KeyEvent.KEYCODE_A:
                mv.mx-=10;
                mv.rect2 = new Rect(mv.mx,mv.my, mv.mx+50,mv.my+50);
                break;
            case KeyEvent.KEYCODE_S:
                mv.my+=10;
                mv.rect2 = new Rect(mv.mx,mv.my, mv.mx+50,mv.my+50);
                break;
            case KeyEvent.KEYCODE_D:
                mv.mx+=10;
                mv.rect2 = new Rect(mv.mx,mv.my, mv.mx+50,mv.my+50);
                break;
            case KeyEvent.KEYCODE_W:
                mv.my-=10;
                mv.rect2 = new Rect(mv.mx,mv.my, mv.mx+50,mv.my+50);
                break;
        }
        mv.invalidate();

        return super.onKeyDown(keyCode, event);
    }




}
