package com.example.youngwoon.class1016;

import java.util.Random;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;

public class myView extends View {
    int mx;
    int my;
    Random rd;

    public myView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mx=-100;
        my=-100;
        rd = new Random();
        setBackgroundColor(Color.YELLOW);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        canvas.drawCircle(rd.nextInt(500),rd.nextInt(700),100,paint);


    }
}
