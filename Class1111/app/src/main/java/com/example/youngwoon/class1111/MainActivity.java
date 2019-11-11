package com.example.youngwoon.class1111;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
        Intent intent = new Intent(this, SubActivity.class);
        intent.putExtra("NAME","홍길동");
        intent.putExtra("SIZE",5);
        int[] x = {100,300,80,400,500};
        int[] y = {300,550,400,300,600};
        intent.putExtra("X",x);
        intent.putExtra("Y",y);
        startActivity(intent);
    }
}
