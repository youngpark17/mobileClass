package com.example.youngwoon.class1120;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    RadioButton rd1;
    RadioButton rd2;
    LinearLayout ll;
    private int color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rd1 = (RadioButton)findViewById(R.id.rd1);
        rd2 = (RadioButton)findViewById(R.id.rd2);
        ll = (LinearLayout)findViewById(R.id.ll);
        SharedPreferences settings = getSharedPreferences("share",0);
        ll.setBackgroundColor(settings.getInt("color",0));

    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.rd1:
                ll.setBackgroundColor(Color.GREEN);
                color = Color.GREEN;
                break;
            case R.id.rd2:
                ll.setBackgroundColor(Color.GRAY);
                color = Color.GRAY;
                break;
        }

    }

    @Override
    protected void onStop() {
        super.onStop();
        SharedPreferences settings = getSharedPreferences("share",0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putInt("color",color);
        editor.commit();
    }
}
