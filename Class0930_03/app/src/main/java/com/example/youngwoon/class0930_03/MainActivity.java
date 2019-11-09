package com.example.youngwoon.class0930_03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView tv;
    private EditText et;

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String a = et.getText().toString();
            int k = Integer.parseInt(a);
            Toast.makeText(getApplicationContext(), (k*2)+"",Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button =(Button)findViewById(R.id.button);
        tv = (TextView) findViewById(R.id.tv);
        et = (EditText)findViewById(R.id.et);
        button.setOnClickListener(listener);

    }




}
