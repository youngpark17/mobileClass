package com.example.youngwoon.class1113;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button bt1;
    TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1=(Button)findViewById(R.id.bt1);
        tv1=(TextView)findViewById(R.id.tv1);
        tv1.setBackgroundColor(Color.YELLOW);
        Intent intent = getIntent();
        tv1.setText("별점은"+intent.getFloatExtra("별점",0)+"\n"+"고객평가는 다음과 같음"+intent.getStringExtra("내용전달"));
    }

    public void onClick(View view){
        if(view.getId()==R.id.bt1){
            Intent intent = new Intent(this, Main2Activity.class);
            startActivity(intent);

        }


    }
}
