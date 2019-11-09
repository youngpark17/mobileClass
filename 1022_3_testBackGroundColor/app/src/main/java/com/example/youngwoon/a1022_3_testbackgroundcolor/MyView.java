package com.example.youngwoon.a1022_3_testbackgroundcolor;

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
    int mx2;
    int my2;
    boolean flag;
    Rect rect;
    Random rd;

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setBackgroundColor(Color.GREEN);
        mx=-100;
        my=-100;
        mx2=300;
        my2=300;
        rd=new Random();
        rect = new Rect(-100,-100,-99,-99);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        ;
        if (rect.contains(mx2, my2)) {
            setBackgroundColor(Color.rgb(rd.nextInt(255), rd.nextInt(255), rd.nextInt(255)));
            mx2 = -100;
            my2 = -100;

        } else {
            if (mx2 > 0 && my2 > 0) {
                paint.setColor(Color.rgb(rd.nextInt(255), rd.nextInt(255), rd.nextInt(255)));

            }
            canvas.drawRect(rect, paint);

        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        mx2=(int)event.getX();
        my2=(int)event.getY();
        rect = new Rect(400,400,700,700);
        invalidate();

        return super.onTouchEvent(event);


    }
}
