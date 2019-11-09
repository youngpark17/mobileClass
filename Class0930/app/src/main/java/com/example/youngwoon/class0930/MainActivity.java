package com.example.youngwoon.class0930;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

class MyView extends View {
    int mX,mY;

    public MyView(Context context) {
        super(context);
        setBackgroundColor(Color.GREEN);  // Color.rgb(FF,00,00) red
        mX=-100;
        mY=-100;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint(); //paint로 text와 도형, 원, 사각형은 출력할 수 있어야 한다.
        paint.setTextSize(50);
        canvas.drawText("Hello!",mX, mY, paint);  //좌측 상단부터 0,0
        paint.setColor(Color.YELLOW);
        canvas.drawRect(100,300,400,600, paint);
        canvas.drawCircle(700,1000,80,paint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        mX = (int)event.getX();
        mY = (int)event.getY();
        invalidate();
        return super.onTouchEvent(event);
    }
}



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyView myView = new MyView(this);
        setContentView(myView);
    }
}


