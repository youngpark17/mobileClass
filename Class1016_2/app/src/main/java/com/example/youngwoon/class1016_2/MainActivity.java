package com.example.youngwoon.class1016_2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    static myView mv;
    Button b1;
    myHandler myHandler;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mv = (myView)findViewById(R.id.myview);
        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.b1);
        myHandler = new myHandler();
        registerForContextMenu(b1);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mymenu, menu);


        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mymenu_context,menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.orange1:
                Toast.makeText(getApplicationContext(), "오렌지1", Toast.LENGTH_SHORT).show();
                b1.setText("오렌지1");
                myHandler.sendEmptyMessage(1);
                break;

            case R.id.orange2:
                Toast.makeText(getApplicationContext(), "오렌지2", Toast.LENGTH_SHORT).show();
                myHandler.removeMessages(1);
                b1.setText("오렌지2");
                break;

            case R.id.orange3:
                Toast.makeText(getApplicationContext(), "오렌지3", Toast.LENGTH_SHORT).show();
                b1.setText("오렌지3");
                break;
        }
        return super.onContextItemSelected(item);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.apple:
                Toast.makeText(getApplicationContext(), "사과1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.apple2:
                Toast.makeText(getApplicationContext(), "사과2", Toast.LENGTH_SHORT).show();
                break;
            case R.id.apple3:
                Toast.makeText(getApplicationContext(), "사과3", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }


}
