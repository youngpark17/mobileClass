package com.example.youngwoon.pro2_0918;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LinearLayout ll;
    Button button1;
    Button button2;
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ll = (LinearLayout) findViewById(R.id.ll);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
    }

    public void onClicked(View view) {
        switch (view.getId()) {
            case R.id.button1:
                ll.setOrientation(LinearLayout.HORIZONTAL);
                break;
            case R.id.button2:
                ll.setOrientation(LinearLayout.VERTICAL);
                break;
            case R.id.button3:
                Toast.makeText(getApplicationContext(), "끝", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
