package com.example.youngwoon.class0911_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickView(View view){
        Toast.makeText(getApplicationContext(), "good", Toast.LENGTH_SHORT).show();
    }

    public void onClickVo(View view){
        Toast.makeText(getApplicationContext(),"bad",Toast.LENGTH_SHORT).show();
    }
}
