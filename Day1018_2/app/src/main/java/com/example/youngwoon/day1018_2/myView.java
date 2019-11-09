package com.example.youngwoon.day1018_2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class myView extends View {
    private boolean flag;
    private Rect rect;
    private Paint paint;
    public myView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setBackgroundColor(Color.YELLOW);
        rect = new Rect(500,800,700,1000);
        paint = new Paint();
        paint.setColor(Color.BLUE);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawRect(rect,paint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int mx = (int)event.getX();
        int my = (int)event.getY();
        if(rect.contains(mx,my)){
            setBackgroundColor(Color.rgb((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
            invalidate();
        }
        else{
            paint.setColor(Color.rgb((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
            invalidate();
        }
        return super.onTouchEvent(event);
    }
}
