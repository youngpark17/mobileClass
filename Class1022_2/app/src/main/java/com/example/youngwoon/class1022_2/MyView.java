package com.example.youngwoon.class1022_2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class MyView extends View {
    int mx;
    int my;
    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setBackgroundColor(Color.GREEN);
        mx=-100;
        my=-100;
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        paint.setTextSize(60);
        canvas.drawCircle(mx,my,30,paint);
        canvas.drawText("좌표"+mx+","+my,mx,my,paint);
    }








}
