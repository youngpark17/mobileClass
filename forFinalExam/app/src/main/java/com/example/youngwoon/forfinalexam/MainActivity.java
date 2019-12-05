package com.example.youngwoon.forfinalexam;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    MyHandler handler;
    Button bt1,bt2,bt3;
    static MyView mv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        handler = new MyHandler();
        mv = (MyView)findViewById(R.id.mv);
        bt1 = (Button)findViewById(R.id.bt1);
        bt2 = (Button)findViewById(R.id.bt2);
        bt3 = (Button)findViewById(R.id.bt3);
        bt1.setEnabled(true);
        bt2.setEnabled(false);

        setTitle("박영운 기말 대비");
        mv.setBackgroundColor(Color.BLUE);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,0,0,"blue");
        menu.add(0,1,1,"red");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case 0:
                mv.setBackgroundColor(Color.BLUE);
                mv.invalidate();
                break;
            case 1:
                mv.setBackgroundColor(Color.RED);
                mv.invalidate();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void onClick(View view){
        switch(view.getId()){
            case R.id.bt1:
                bt1.setEnabled(false);
                bt2.setEnabled(true);
                handler.sendEmptyMessageDelayed(1,1000);
                break;
            case R.id.bt2:
                bt1.setEnabled(true);
                bt2.setEnabled(false);
                handler.removeMessages(1);
                break;
            case R.id.bt3:
                Intent intent = new Intent(this,Main2Activity.class);
                ArrayList<String> arr = new ArrayList<>();
                arr.add("김학준");
                arr.add("박영운");
                arr.add("이주형");
                intent.putStringArrayListExtra("name_arr",arr);
                startActivity(intent);
                break;

        }
    }
}
