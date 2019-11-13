package com.example.youngwoon.class1113;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;

public class Main2Activity extends AppCompatActivity {
    RatingBar rb1;
    EditText et1;
    Button bt2;
    Button bt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        rb1 = (RatingBar)findViewById(R.id.rb1);
        et1 = (EditText)findViewById(R.id.et1);
        bt2 = (Button)findViewById(R.id.bt2);
        bt3 = (Button)findViewById(R.id.bt3);

    }

    public void onClick(View view){
        Intent intent = new Intent(this, MainActivity.class);
        switch (view.getId()){

            case R.id.bt2:
                String a = et1.getText().toString();
                float star = rb1.getRating();
                intent.putExtra("내용전달",a);
                intent.putExtra("별점",star);
                startActivity(intent);
                break;
            case R.id.bt3:
                startActivity(intent);
                break;


        }
    }
}
