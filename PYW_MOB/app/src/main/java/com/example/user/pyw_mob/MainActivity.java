package com.example.user.pyw_mob;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bt1;
    Button bt2;
    static MyView mv;
    MyHandler myhandler;
    boolean flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("박영운");
        setContentView(R.layout.activity_main);
        bt1=(Button)findViewById(R.id.bt1);
        bt2=(Button)findViewById(R.id.bt2);
        mv = (MyView)findViewById(R.id.mv);
        myhandler = new MyHandler();
        bt1.setEnabled(true);
        bt2.setEnabled(false);
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.bt1:
                bt1.setEnabled(false);
                bt2.setEnabled(true);
                myhandler.sendEmptyMessage(1);

                break;
            case R.id.bt2:
                bt2.setEnabled(false);
                bt1.setEnabled(true);
                myhandler.removeMessages(1);
                mv.count=0;
                break;
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,1,0,"BLUE");
        menu.add(0,2,0,"RED");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case 1:
                mv.setBackgroundColor(Color.BLUE);
                mv.invalidate();
                break;
            case 2:
                mv.setBackgroundColor(Color.RED);
                mv.invalidate();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
