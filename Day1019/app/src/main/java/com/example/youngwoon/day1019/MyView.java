package com.example.youngwoon.day1019;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import java.util.Random;

public class MyView extends View {
    int mx;
    int my;
    Random rd;

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mx=-100;
        my=-100;
        setBackgroundColor(Color.YELLOW);
        rd = new Random();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        mx = rd.nextInt(getWidth()-100)+50;
        my = rd.nextInt(getHeight()-100)+50;
        canvas.drawCircle(mx,my,50,paint);
    }
}
