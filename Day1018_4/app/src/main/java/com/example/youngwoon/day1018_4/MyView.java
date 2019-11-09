package com.example.youngwoon.day1018_4;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Toast;

public class MyView extends View {
     Rect rect1;
     Rect rect2;
     int x1,y1;
    int mx,my;

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setBackgroundColor(Color.GREEN);
        x1 = 100;
        y1 = 200;
        mx = 500;
        my = 500;
        rect1 = new Rect(x1,y1,x1+100,y1+100);
        rect2 = new Rect(mx,my, mx+50,my+50);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint2 = new Paint();
       ;Paint paint = new Paint();

        canvas.drawRect(rect1,paint);
        canvas.drawRect(rect2, paint2);

        if(rect1.intersect(rect2)){
            paint2.setColor(Color.BLUE);
            canvas.drawRect(rect2, paint2);
            canvas.drawRect(rect1,paint);
        }






    }




}
