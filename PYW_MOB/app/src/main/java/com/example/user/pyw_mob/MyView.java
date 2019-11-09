package com.example.user.pyw_mob;

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
        int a = rd.nextInt(getWidth());
        int b = rd.nextInt(getHeight());
        if(a>=getWidth()-100){
            a-=100;
        }
        if(b>=getHeight()-100){
            b-=100;
        }

        Paint paint = new Paint();
        paint.setTextSize(30);
        paint.setColor(Color.YELLOW);
        canvas.drawText("잡은 물고기 개수 :"+count+"마리", getWidth()-300, 100,paint);
        rect = new Rect(a,b, a+100,b+100);
        canvas.drawRect(rect,paint);

        super.onDraw(canvas);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int px = (int)event.getX();
        int py = (int)event.getY();

        if(rect.contains(px,py)){
            count++;
            invalidate();
        }
        else{
            return true;
        }

        return super.onTouchEvent(event);
    }
}
