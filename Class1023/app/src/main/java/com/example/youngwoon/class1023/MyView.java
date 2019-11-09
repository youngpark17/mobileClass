package com.example.youngwoon.class1023;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import java.util.Random;

public class MyView extends View {
    int mx;
    int my;
    Rect rect;
    Paint paint;
    Random rd;


    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mx=-100;
        my=-100;
        setBackgroundColor(Color.GREEN);
        paint = new Paint();
        rect = new Rect();

        rd = new Random();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawRect(rect,paint);
        super.onDraw(canvas);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        mx=(int)event.getX();
        my=(int)event.getY();
        if(rect.contains(mx,my)){
            setBackgroundColor(Color.rgb(rd.nextInt(255),rd.nextInt(255),rd.nextInt(255)));
            invalidate();
        }
        else{
            paint.setColor(Color.rgb(rd.nextInt(255),rd.nextInt(255),rd.nextInt(255)));
            rect = new Rect(mx,my,mx+300,my+300);
            invalidate();
        }


        return super.onTouchEvent(event);
    }
}
