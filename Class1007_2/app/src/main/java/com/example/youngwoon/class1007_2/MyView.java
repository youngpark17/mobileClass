package com.example.youngwoon.class1007_2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import java.util.Random;

public class MyView extends View {
    private Random mr = new Random();

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setBackgroundColor(Color.rgb((int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100)));
    }

    @Override
    protected void onDraw(Canvas canvas) {

        int width = getWidth(); // 현재화면의 가로크기를 얻어올 수 있음
        int height = getHeight();
        int x = 50+ mr.nextInt(width-100); //0~widht-100 사이의 값.
        int y = 50+ mr.nextInt(height-100);
        int r = 30+mr.nextInt(30);

        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        canvas.drawCircle(x,y,r,paint);
    }
}
