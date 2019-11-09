package com.example.youngwoon.day1020_1;

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
        setBackgroundColor(Color.GREEN);
        mx=-100;
        my=-100;
        rd= new Random();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();

        paint.setColor(Color.rgb(mx,my,100));
        canvas.drawCircle(mx,my,30,paint);
    }
}
