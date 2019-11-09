package com.example.youngwoon.class1021_2;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    static MyView myView;
    Button bt;
    MyHandler myhandler;
    boolean flag;
    Button bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt = (Button)findViewById(R.id.bt1);
        myView =(MyView)findViewById(R.id.mv);
        myhandler = new MyHandler();
        bt2 = (Button)findViewById(R.id.bt2);
        registerForContextMenu(myView);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mymenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.contextmenu,menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.citem1:
                Toast.makeText(getApplicationContext(),"컨테스으아티메셀렉템1",Toast.LENGTH_SHORT).show();
                break;

            case R.id.citem2:
                Toast.makeText(getApplicationContext(),"컨테스으아티메셀렉템2",Toast.LENGTH_SHORT).show();
                break;

            case R.id.citem3:
                Toast.makeText(getApplicationContext(),"컨테스으아티메셀렉템3",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-1234-5678"));
                startActivity(intent);
                break;
        }
        return super.onContextItemSelected(item);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                myView.setBackgroundColor(Color.BLUE);
                myView.invalidate();
                break;

            case R.id.item2:
                myView.setBackgroundColor(Color.YELLOW);
                myView.invalidate();
                break;

            case R.id.item3:
                myView.setBackgroundColor(Color.YELLOW);
                myView.invalidate();
                break;
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode){
            case KeyEvent.KEYCODE_0:
                Toast.makeText(getApplicationContext(), "0키가 눌림", Toast.LENGTH_SHORT).show();
                break;

            case KeyEvent.KEYCODE_1:
                Toast.makeText(getApplicationContext(), "1키가 눌림", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onKeyDown(keyCode, event);
    }

    public void onClicked(View view){
        switch (view.getId()){
            case R.id.bt1:
                if(!flag){
                    myhandler.sendEmptyMessage(1);
                    flag=true;
                }
                else{
                    myhandler.removeMessages(1);
                    flag=false;
                    myView.cnt=0;
                }
                break;

        }
    }
}
