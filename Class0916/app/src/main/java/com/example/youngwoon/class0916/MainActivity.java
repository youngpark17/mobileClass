package com.example.youngwoon.class0916;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button_add;
    Button button_min;
    Button button_mul;
    Button button_div;
    Button button_enter;
    EditText ed;
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button_add = (Button) findViewById(R.id.button_add);
        button_div = (Button) findViewById(R.id.button_div);
        button_min = (Button) findViewById(R.id.button_min);
        button_mul = (Button) findViewById(R.id.button_mul);
        button_enter = (Button) findViewById(R.id.button_enter);
        ed = (EditText) findViewById(R.id.ed);
        tv = (TextView) findViewById(R.id.tv);


    }


    public void onClicked(View view) {
        String a;
        switch (view.getId()) {

            case R.id.button1:
                Toast.makeText(getApplicationContext(), "1", Toast.LENGTH_SHORT).show();
                a = ed.getText().toString();
                ed.setText(a + "1");
                break;
            case R.id.button2:
                Toast.makeText(getApplicationContext(), "2", Toast.LENGTH_SHORT).show();
                a = ed.getText().toString();
                ed.setText(a + "2");
                break;
            case R.id.button3:
                Toast.makeText(getApplicationContext(), "3", Toast.LENGTH_SHORT).show();
                a = ed.getText().toString();
                ed.setText(a + "3");
                break;
            case R.id.button4:
                Toast.makeText(getApplicationContext(), "4", Toast.LENGTH_SHORT).show();
                a = ed.getText().toString();
                ed.setText(a + "4");
                break;
            case R.id.button5:
                Toast.makeText(getApplicationContext(), "5", Toast.LENGTH_SHORT).show();
                a = ed.getText().toString();
                ed.setText(a + "5");
                break;
            case R.id.button6:
                Toast.makeText(getApplicationContext(), "6", Toast.LENGTH_SHORT).show();
                a = ed.getText().toString();
                ed.setText(a + "6");
                break;
            case R.id.button7:
                Toast.makeText(getApplicationContext(), "7", Toast.LENGTH_SHORT).show();
                a = ed.getText().toString();
                ed.setText(a + "7");
                break;
            case R.id.button8:
                Toast.makeText(getApplicationContext(), "8", Toast.LENGTH_SHORT).show();
                a = ed.getText().toString();
                ed.setText(a + "8");
                break;
            case R.id.button9:
                Toast.makeText(getApplicationContext(), "9", Toast.LENGTH_SHORT).show();
                a = ed.getText().toString();
                ed.setText(a + "9");
                break;
            case R.id.button_add:
                Toast.makeText(getApplicationContext(), "+", Toast.LENGTH_SHORT).show();
                a = ed.getText().toString();
                ed.setText(a + "+");
                break;
            case R.id.button_div:
                Toast.makeText(getApplicationContext(), "/", Toast.LENGTH_SHORT).show();
                a = ed.getText().toString();
                ed.setText(a + "/");
                break;
            case R.id.button_min:
                Toast.makeText(getApplicationContext(), "-", Toast.LENGTH_SHORT).show();
                a = ed.getText().toString();
                ed.setText(a + "-");
                break;
            case R.id.button_mul:
                Toast.makeText(getApplicationContext(), "*", Toast.LENGTH_SHORT).show();
                a = ed.getText().toString();
                ed.setText(a + "*");
                break;
            case R.id.button_enter:
                Toast.makeText(getApplicationContext(), "Enter", Toast.LENGTH_SHORT).show();
                a = ed.getText().toString();
                String[] arr = a.split("");
                int sum = Calculator(arr);
                tv.setText(sum);
                ed.setText("");
                break;
        }
    }

    public int Calculator(String[] arr) {
        int sum = 0;
        String tmp1="";
        String tmp2="";
        boolean flag=false;
        for (int i = 0; i < arr.length; i++) {
            switch (ca(arr[i])){
                case 0 : if(flag){
                    tmp1+=arr[i];
                }
                else{
                    tmp2+=arr[i];
                }
                break;

                case 1 :
            }
        }
    }

    public int ca(String p) {
        switch(p){
            case "+":
                return 1;
            case "-":
                return 2;
            case "/":
                return 3;
            case "*":
                return 4;
            default:
                return 0;
        }

    }


}
