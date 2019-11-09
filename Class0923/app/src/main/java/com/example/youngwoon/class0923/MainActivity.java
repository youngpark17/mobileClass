package com.example.youngwoon.class0923;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText editText;
    CheckBox box_1;
    CheckBox box_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        box_1 = (CheckBox)findViewById(R.id.box_1);
        box_2 = (CheckBox)findViewById(R.id.box_2);
        editText = (EditText)findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "hi", Toast.LENGTH_SHORT).show();
            }
        });

        box_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = editText.getText().toString();
                Toast.makeText(getApplicationContext(),str,Toast.LENGTH_SHORT).show();

            }
        });
    }

}

