package com.example.youngwoon.listexample01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView)findViewById(R.id.list);

        List<String> data  = new ArrayList<>();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
        list.setAdapter(adapter);

        data.add("홍드로이드");
        data.add("박영운");
        data.add("박드로이드");

        adapter.notifyDataSetChanged();
    }

    public void onClicked(View view){
        Toast.makeText(getApplicationContext(), "버튼이 눌렸습니다",Toast.LENGTH_LONG ).show();
    }
}
