package com.example.youngwoon.class1022_2;

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
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bt;
    static MyView myview;
    MyHandler myhandler;
    boolean flag;
    EditText et1;
    EditText et2;
    TextView tv1;
    CheckBox cb;
    int flag2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt =(Button)findViewById(R.id.bt);
        myview=(MyView)findViewById(R.id.myview);
        myhandler = new MyHandler();
        et1 = (EditText)findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et2);
        tv1 = (TextView)findViewById(R.id.tv);
        flag2=0;
        cb = (CheckBox)findViewById(R.id.cb);
        registerForContextMenu(myview);


    }

    public void onClick(View view){

        switch (view.getId()){
            case R.id.bt:
                if(!flag&&cb.isChecked()){
                    myhandler.sendEmptyMessage(1);
                    flag=true;
                }
                else{
                    myhandler.removeMessages(1);
                    flag=false;
                }
                break;
            case R.id.bt2:
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-1234-5678"));
                startActivity(intent);
                break;
        }


    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.contextmenu,menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.citem1){
            int a = Integer.parseInt(et1.getText().toString());
            int b = Integer.parseInt(et2.getText().toString());
            switch (flag2){
                case 1:
                    tv1.setText((a+b)+"");
                    break;
                case 2:
                    tv1.setText((a-b)+"");
                    break;
                case 3:
                    tv1.setText((a*b)+"");
                    break;
                case 4:
                    tv1.setText((a/b)+"");
                    break;
            }
        }
        return super.onContextItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        menu.add(1,1,0,"더하기");
        menu.add(1,2,0,"빼기");
        menu.add(1,3,0,"곱하기");
        menu.add(1,4,0,"나누기");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case 1:
                myview.setBackgroundColor(Color.BLUE);
                flag2=1; //+
                break;

            case 2:
                myview.setBackgroundColor(Color.YELLOW);
                flag2=2; //-
                break;

            case 3:
                myview.setBackgroundColor(Color.RED);
                flag2=3;
                break;
            case 4:
                flag2=4;
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode){
            case KeyEvent.KEYCODE_1:
                Toast.makeText(getApplicationContext(), "1번 눌림", Toast.LENGTH_SHORT).show();
                break;
            case KeyEvent.KEYCODE_2:
                Toast.makeText(getApplicationContext(), "2번 눌림", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onKeyDown(keyCode, event);
    }
}
