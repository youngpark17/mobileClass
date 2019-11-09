package com.example.youngwoon.day1018;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private int count;
    private boolean flag;
    private Handler handler;
    private TextView text1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1=(TextView)findViewById(R.id.text1);
        count=0;
        handler = new Handler();


    }

    public void onClicked(View view){
        handler.post(new Runnable() {
            @Override
            public void run() {
                if(count<=4&&!flag){
                    count+=1;
                    text1.setText(count+"");
                    if(count==5){
                        flag=true;
                    }
                    handler.postDelayed(this,1000);

                }
                else{
                    if(flag){
                        count--;
                        text1.setText(count+"");
                        if(count==0){
                            flag=false;
                            return;
                        }
                        handler.postDelayed(this,1000);
                    }
                    else{

                        handler.removeCallbacks(this);

                    }

                }
            }
        });
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode){
            case KeyEvent.KEYCODE_0:
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(getApplicationContext(), "0입력되었습니다.",Toast.LENGTH_SHORT).show();

                    }
                }, 0);
                break;
            case KeyEvent.KEYCODE_1:
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(getApplicationContext(), "1입력되었습니다", Toast.LENGTH_SHORT).show();
                    }
                },0);
                break;
            case KeyEvent.KEYCODE_2:
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        handler.removeCallbacks(this);
                    }
                });
        }
        return super.onKeyDown(keyCode, event);
    }
}
