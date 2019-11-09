package com.example.youngwoon.class1014;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

import java.util.Random;

public class MyView extends View {
    Random mRand;
    Rect mRect;
    int mY=0;

    public MyView(Context context) {
        super(context);
        setBackgroundColor(Color.YELLOW);
        mRand = new Random();
        mRect = new Rect(200,200,500,500);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(mRect.contains((int)event.getX(),(int)event.getY())){
            invalidate();
        }
        return super.onTouchEvent(event);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        int r1 = mRand.nextInt(256); //0부터 255까지.
        int r2 = mRand.nextInt(256);
        int r3 = mRand.nextInt(256);
        paint.setColor(Color.rgb(r1,r2,r3));
        mRect.set(200,200+mY,500,500+mY);
        canvas.drawRect(mRect,paint);
    }


}
