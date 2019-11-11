package com.example.youngwoon.class1111;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class SubActivity extends AppCompatActivity {
    MyView myView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myView = new MyView(this);
        Intent intent = getIntent();
        myView.m_name=intent.getStringExtra("NAME");
        myView.m_size = intent.getIntExtra("SIZE",0); // 안넘어 올 경우 디폴트값
        myView.m_x = intent.getIntArrayExtra("X");
        myView.m_y = intent.getIntArrayExtra("Y");
        setContentView(myView);
    }
}
