package com.example.youngwoon.class1007_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private MyView mView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mView =(MyView)findViewById(R.id.myview);

    }

    public void onClick(View view){
        mView.invalidate();
    }


}
