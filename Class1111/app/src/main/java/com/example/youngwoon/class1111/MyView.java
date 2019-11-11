package com.example.youngwoon.class1111;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class MyView extends View {
    String m_name;
    int m_size;
    int[] m_x;
    int[] m_y;

    public MyView(Context context) {
        super(context);
        setBackgroundColor(Color.YELLOW);
        m_name="";
        m_size=0;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setTextSize(40);
        canvas.drawText(m_name, 100,100,paint);
        paint.setColor(Color.BLUE);
        for(int i=0; i<m_size; i++){
            canvas.drawCircle(m_x[i],m_y[i],30,paint);
        }
    }
}
