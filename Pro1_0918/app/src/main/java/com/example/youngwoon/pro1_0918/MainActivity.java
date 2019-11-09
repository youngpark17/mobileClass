package com.example.youngwoon.pro1_0918;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button1;
    Button button2;
    boolean flag1;
    boolean flag2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        flag1=true;
        flag2=true;

    }

    public void onClicked(View view){

        switch (view.getId()){


            case R.id.button1:
                if(flag1){
                    button1.setText("텍스트 바뀐거");
                    flag1=!flag1;
                }
                else{
                    button1.setText("텍스트 내용 설정");
                    flag1=!flag1;
                }
                break;
            case R.id.button2:
                    if(flag2){
                        button2.setEnabled(!flag2);
                        flag2=!flag2;

                    }
                    else{
                        button2.setEnabled(!flag2);
                        flag2=!flag2;
                    }
                    break;

                }
        }

    }

