package com.example.youngwoon.day1018;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import java.util.Random;

public class myView extends View {

    private int mx;
    private int my;
    private Random rd;

    public myView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setBackgroundColor(Color.YELLOW);
        mx=-100;
        my=-100;
        rd = new Random();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        invalidate();
        return super.onTouchEvent(event);
    }

    @Override
        protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        mx = rd.nextInt(500);
        my = rd.nextInt(700);
        Rect rect = new Rect(mx,my,200+mx, 300+my);
        canvas.drawRect(rect,paint);
    }


}
