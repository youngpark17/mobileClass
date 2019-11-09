package com.example.youngwoon.class1030;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    LinkedList<String> mFruitList;
    ArrayAdapter<String> madapter;
    EditText et;
    int a;
    RadioButton rb1;
    RadioButton rb2;
    RadioButton rb3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=(EditText)findViewById(R.id.et);
        et.setBackgroundColor(Color.YELLOW);
        ListView lv = (ListView)findViewById(R.id.lv);
        String[] values = {"Apple", "Banana","BlueBerry","Cherry","Coconut","Jackfruit","Lemon","Mango","Melon"};
        mFruitList = new LinkedList<>();
        for(String s : values){
            mFruitList.add(s);
        }
        a=1;
        rb1 = (RadioButton)findViewById(R.id.rb1);
        rb2 = (RadioButton)findViewById(R.id.rb2);
        rb3 = (RadioButton)findViewById(R.id.rb3);
        rb1.setOnClickListener(listener);
        rb2.setOnClickListener(listener);
        rb3.setOnClickListener(listener);



        madapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mFruitList);
        lv.setAdapter(madapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (a){
                    case 1:
                        mFruitList.remove(position);
                        madapter.notifyDataSetChanged();
                        break;
                    case 2:
                        String str = et.getText().toString();
                        mFruitList.set(position, str);
                        madapter.notifyDataSetChanged();
                        break;
                    case 3:
                        String str2 = et.getText().toString();
                        mFruitList.add(position,str2);
                        madapter.notifyDataSetChanged();
                        break;

                }
            }
        });


    }

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.rb1:
                    a=1;
                    break;
                case R.id.rb2:
                    a=2;
                    break;
                case R.id.rb3:
                    a=3;
                    break;
            }
        }
    };
}
