package com.example.youngwoon.example_chapter4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioButton rb1;
    RadioButton rb2;
    Button button1;
    EditText et;

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(v.getId()==button1.getId()){
                if(rb1.isChecked()){
                    String a = et.getText().toString();
                    Float b = Float.parseFloat(a);
                    et.setText((b*2)+"");

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                }

                    et.setText("");
                }



            }

            if(v.getId()==et.getId()){
                et.setText("");
            }

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2  = (RadioButton) findViewById(R.id.rb2);
        button1 = (Button)findViewById(R.id.button1);
        et = (EditText) findViewById(R.id.et);
        button1.setOnClickListener(listener);
        et.setOnClickListener(listener);

    }
}
