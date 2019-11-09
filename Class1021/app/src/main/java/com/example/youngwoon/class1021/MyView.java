package com.example.youngwoon.class1021;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class MyView extends View {
    int mMode;
    String mText;

    public MyView(Context context) {
        super(context);
        mMode=0;
        mText="";
        setBackgroundColor(Color.GREEN);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        super.onDraw(canvas);
        switch (mMode){
            case 1:
                paint.setColor(Color.RED);
                canvas.drawCircle(200,200,300,paint);
                break;
            case 2:
                paint.setTextSize(50);
                canvas.drawText("mText",100,100,paint);
                break;
        }
    }
}
