package com.example.youngwoon.class1106;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class myView extends View {
    int[] mx;
    int[] my;
    int count;

    public myView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setBackgroundColor(Color.YELLOW);
        mx=new int[50];
        my=new int[50];
        count=0;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        mx[count]=(int)event.getX();
        my[count]=(int)event.getY();
        count++;
        invalidate();
        return super.onTouchEvent(event);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        if(count<=50){
                for(int i=0; i<count; i++){
                    canvas.drawCircle(mx[i],my[i],10,paint);
                }
        }
        super.onDraw(canvas);
    }
}
