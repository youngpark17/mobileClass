package com.example.youngwoon.day1018;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

public class MyView extends View {
    int mx;
    int my;


    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mx=-100;
        my=-100;
        setBackgroundColor(Color.YELLOW);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        Paint paint2 = new Paint();
        paint.setColor(Color.BLUE);
        canvas.drawCircle(mx, my,50,paint);
        paint2.setColor(Color.BLACK);
        paint2.setTextSize(150);
        canvas.drawText(mx+" "+mx,mx,my,paint2);
    }
}
