package com.example.youngwoon.class1021;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LinearLayout ll;
    MyView mv;
    Button bt2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ll=findViewById(R.id.ll);
        mv = new MyView(this);
        ll.addView(mv);
        bt2 = (Button)findViewById(R.id.bt2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et = (EditText)findViewById(R.id.et);
                String str = et.getText().toString();
                int num = Integer.parseInt(et.getText().toString())*2;
                String str2 = num+"";
                mv.mMode=2;
                mv.mText=str;
                mv.invalidate();
            }
        });
    }

    public void onClicked(View view){
        if(mv.mMode==0){
            mv.mMode=1;
        }
        else{
            mv.mMode=1;
        }
        mv.invalidate();
    }
}
