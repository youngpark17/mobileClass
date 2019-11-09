package com.example.youngwoon.day1018_3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

import java.util.Random;

public class myView extends View {
    private Rect rect1;
    private Rect rect2;
    private Random rd;

    public myView(Context context) {
        super(context);
        rd = new Random();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        Paint paint2 = new Paint();
        paint2.setColor(Color.YELLOW);
        paint.setColor(Color.BLUE);
        int x1,x2;
        int y1,y2;
        x1 = (int)(Math.random()*getWidth());
        x2 = rd.nextInt(getWidth());
        y1 = (int)(Math.random()*getHeight());
        y2 = rd.nextInt(getHeight());
        rect1 = new Rect(x1,y1,x1+200,y1+200);
        rect2 = new Rect(x2,y2,x2+200,y2+200);
        if(rect1.intersect(rect2)){
            canvas.drawRect(rect1,paint);
            canvas.drawRect(rect2,paint2);
        }
        else{
            canvas.drawRect(rect1,paint);
            canvas.drawRect(rect2,paint);
        }


    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        invalidate();
        return super.onTouchEvent(event);
    }
}
