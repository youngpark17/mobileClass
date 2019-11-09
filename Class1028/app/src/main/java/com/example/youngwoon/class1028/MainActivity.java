package com.example.youngwoon.class1028;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity{
    LinkedList<String> mFruitList;
    ArrayAdapter<String> madapter;
    EditText mItem;


    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mItem = (EditText)findViewById(R.id.editText);
        //1. data : 배열
        String[] values = {"Apple", "Banana","BlueBerry","Cherry","Coconut","Jackfruit","Lemon","Mango","Melon"};
        //2. Java Collections LinkedList
        mFruitList = new LinkedList<>();
        for(int i=0; i<values.length; i++){
            mFruitList.add(values[i]);
        }

        madapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mFruitList);
        ListView listView = (ListView)findViewById(R.id.listview);
        listView.setAdapter(madapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String str = mItem.getText().toString();
                mFruitList.set(position, str);
                madapter.notifyDataSetChanged();
                //position
                //String str = Integer.toString(position);
                //Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();


            }
        });

    }

   /* @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        //mFruitList.remove(position);
        //mFruitList.add(position, position+"added");
        mFruitList.set(position,"수정");
        madapter.notifyDataSetChanged();

        // 기본실습
        //String item = (String)getListAdapter().getItem(position);


        //position
        //String str = Integer.toString(position);
        //Toast.makeText(getApplicationContext(), item, Toast.LENGTH_SHORT).show();

        //응용
        //색깔바꾸기 토글...
//        if(position==0){
//            l.setBackgroundColor(Color.YELLOW);
//        }
//        else if(position==1){
//            l.setBackgroundColor(Color.WHITE);
//        }
//        v.setBackgroundColor(Color.GREEN);
    }*/
}
