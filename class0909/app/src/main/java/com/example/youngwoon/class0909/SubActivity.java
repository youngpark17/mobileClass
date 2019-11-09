package com.example.youngwoon.class0909;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class SubActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub_activity);


    }

    protected void onClick(View v){
        Toast.makeText(getApplicationContext(), "이용해주셔서 감사합니다", Toast.LENGTH_SHORT).show();

        finish();
    }
}
