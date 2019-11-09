package com.example.youngwoon.class1002;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    myView mv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mv = new myView(this);
        setContentView(mv);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mymenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.xy:
                mv.mode=0;
                break;
            case R.id.rec:
                mv.mode=1;
                break;
            case R.id.cir:
                mv.mode=2;
                break;
        }


        return super.onOptionsItemSelected(item);
    }
}

class myView extends View{
    int x;
    int y;
    int mode;
    Rect rect;
    boolean flag;

    public myView(Context context) {
        super(context);
        x=100;
        y=100;
        mode=0;
        rect = new Rect(200,200,300,300);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        x = (int)event.getX();
        y = (int)event.getY();
        invalidate();
        return super.onTouchEvent(event);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setTextSize(50);
        paint.setColor(Color.BLACK);
        if(mode==0){
            canvas.drawText(x+","+y,x,y,paint);
        }
        else if(mode==1){
            if(rect.contains(x,y)){
                setBackgroundColor(Color.rgb((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
                x=-100;
                y=-100;
            }
            else{
                paint.setColor(Color.rgb((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
                canvas.drawRect(rect,paint);
            }
        }
        else{
            canvas.drawCircle(x,y,30,paint);
        }
    }
}
