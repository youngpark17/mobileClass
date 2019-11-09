package com.example.youngwoon.day1020_1;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button bt;
    EditText et1;
    EditText et2;
    TextView tv;
    boolean flag;
    RadioButton rd1;
    RadioButton rd2;
    static MyView myView;
    myHandler myhandler;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt = (Button)findViewById(R.id.bt);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        tv = (TextView)findViewById(R.id.tv);
        rd1 = (RadioButton)findViewById(R.id.rd1);
        rd2 = (RadioButton)findViewById(R.id.rd2);
        myhandler = new myHandler();
        myView = (MyView)findViewById(R.id.myview);
        registerForContextMenu(myView);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mycontextmenu,menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.green:
                myView.setBackgroundColor(Color.GREEN);
                break;
            case R.id.blue:
                myView.setBackgroundColor(Color.BLUE);
                break;
            case R.id.red:
                myView.setBackgroundColor(Color.RED);
                break;
            case R.id.circle_draw:
                myhandler.sendEmptyMessage(1);
                break;
            case R.id.circle_notDraw:
                myhandler.removeMessages(1);
                myhandler.Cnt=0;
                break;
        }

        return super.onContextItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mymenu,menu);
        return super.onCreateOptionsMenu(menu);
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                bt.setText("+");
                break;
            case R.id.item2:
                bt.setText("-");
                break;
            case R.id.item3:
                bt.setText("*");
                break;
            case R.id.item4:
                bt.setText("/");
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void onClicked(View view){
        if(view.getId()==bt.getId() && flag){
            int num1=0;
            int num2=0;
            String num3;
            char op = bt.getText().toString().charAt(0);
            switch (op){
                case '+':
                    num1 =  Integer.parseInt(et1.getText().toString());
                    num2 = Integer.parseInt(et2.getText().toString());
                    num3  = (num1+num2)+"";
                    tv.setText(num3);
                    break;
                case '-':
                    num1 =  Integer.parseInt(et1.getText().toString());
                    num2 = Integer.parseInt(et2.getText().toString());
                    num3  = (num1-num2)+"";
                    tv.setText(num3);
                    break;
                case '*':
                    num1 =  Integer.parseInt(et1.getText().toString());
                    num2 = Integer.parseInt(et2.getText().toString());
                    num3  = (num1*num2)+"";
                    tv.setText(num3);
                    break;
                case '/':
                    num1 =  Integer.parseInt(et1.getText().toString());
                    num2 = Integer.parseInt(et2.getText().toString());
                    num3  = (num1/num2)+"";
                    tv.setText(num3);
                    break;
            }
        }
        else if(view.getId()==rd1.getId()){
            flag=true;
        }
        else{
            flag=false;
        }



    }
}
