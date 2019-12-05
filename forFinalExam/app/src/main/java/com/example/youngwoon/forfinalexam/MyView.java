package com.example.youngwoon.forfinalexam;

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
    int count;
    Random rd;
    Rect rect;

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mx=-100;
        my=-100;
        count=0;
        setBackgroundColor(Color.BLUE);
        rd = new Random();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        int mx = rd.nextInt(getWidth());
        int my = rd.nextInt(getHeight());
        if(mx>getWidth()-40){
            mx-=40;
        }
        if(my>getHeight()-40){
            my-=40;
        }
        rect = new Rect(mx,my,mx+40,my+40);
        paint.setTextSize(30);
        canvas.drawText("잡은 물고기수"+count+"마리",getWidth()-300,100,paint);
        paint.setColor(Color.YELLOW);
        canvas.drawRect(rect,paint);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int tx = (int)event.getX();
        int ty = (int)event.getY();

        if(rect.contains(tx,ty)){
            count++;
            invalidate();
        }

        return super.onTouchEvent(event);
    }
}
