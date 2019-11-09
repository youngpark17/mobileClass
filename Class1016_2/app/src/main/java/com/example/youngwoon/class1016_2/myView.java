package com.example.youngwoon.class1016_2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import java.util.Random;

public class myView extends View {
    Rect rect1;
    Rect rect2;
    Random rd;

    public myView(Context context, AttributeSet attrs) {
        super(context, attrs);
        rd = new Random();
        setBackgroundColor(Color.BLUE);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        rect1 = new Rect(rd.nextInt(200),rd.nextInt(200),rd.nextInt(500),rd.nextInt(500));
        rect2 = new Rect(rd.nextInt(200),rd.nextInt(200),rd.nextInt(500),rd.nextInt(500));
        paint.setColor(Color.YELLOW);
        canvas.drawRect(rect1,paint);
        paint.setColor(Color.GREEN);
        canvas.drawRect(rect2,paint);
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        invalidate();
        return super.onTouchEvent(event);
    }


}
