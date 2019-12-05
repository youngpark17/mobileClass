package com.example.youngwoon.forfinalexam;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main2Activity extends AppCompatActivity {
    ArrayList<String> arr;
    ArrayAdapter<String> madapter;
    RadioButton rb1,rb2,rb3;
    EditText et1;
    int flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        flag=1;
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        ListView lv = (ListView)findViewById(R.id.lv);
        rb1 = (RadioButton)findViewById(R.id.rb1);
        rb2 = (RadioButton)findViewById(R.id.rb2);
        rb3 = (RadioButton)findViewById(R.id.rb3);
        et1 = (EditText)findViewById(R.id.et1);

        SharedPreferences settings = getSharedPreferences("share",0);
        if(settings.getInt("flag",0)==1){
            arr = new ArrayList<>();
            String dbArr = settings.getString("dbName","");
            String[] dbArr2 = dbArr.split(",");
            for(String p : dbArr2){
                arr.add(p);
            }
        }
        else{
            arr =arr = intent.getStringArrayListExtra("name_arr");
        }

        madapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arr);
        lv.setAdapter(madapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (flag){
                    case 1:
                        String st = et1.getText().toString();
                        arr.add(position,st);
                        madapter.notifyDataSetChanged();
                        break;
                    case 2:
                        arr.remove(position);
                        madapter.notifyDataSetChanged();
                        break;
                    case 3:
                        arr.add(position,arr.get(position));
                        madapter.notifyDataSetChanged();
                        break;
                }
            }
        });


    }

    public void onClick2(View view){
        switch (view.getId()){
            case R.id.rb1:
                Toast.makeText(getApplicationContext(),"추가 모드",Toast.LENGTH_LONG).show();
                flag=1;
                break;
            case R.id.rb2:
                Toast.makeText(getApplicationContext(),"삭제 모드",Toast.LENGTH_LONG).show();
                flag=2;
                break;
            case R.id.rb3:
                Toast.makeText(getApplicationContext(),"복사 모드",Toast.LENGTH_LONG).show();
                flag=3;
                break;
        }
    }

    @Override
    protected void onStop() {
        SharedPreferences settings = getSharedPreferences("share",0);
        String tmp_name="";
        for(String name : arr){
            tmp_name+=name+",";
        }
        SharedPreferences.Editor editor = settings.edit();
        editor.putString("dbName",tmp_name);
        editor.putInt("flag",1);
        editor.commit();
        super.onStop();
    }


}
