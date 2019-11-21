package com.example.youngwoon.class_db_connections;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    List<String> ID_List;
    List<String> PW_List;
    public List<Members> userList ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ID_List=new ArrayList<>();
        PW_List=new ArrayList<>();
        tv=(TextView)findViewById(R.id.tv);
        initLoadDB();
        String id="";
        String pw="";
        for(int i=0; i<ID_List.size(); i++){
            id+=ID_List.get(i).toString()+" ";
            pw+=PW_List.get(i).toString()+" \n";
        }
        tv.setText(id+pw);

    }


    private void initLoadDB() {

        DataAdapter mDbHelper = new DataAdapter(getApplicationContext());
        mDbHelper.createDatabase();
        mDbHelper.open();

        // db에 있는 값들을 model을 적용해서 넣는다.
        userList = mDbHelper.getTableData();

        for(int i=0; i<userList.size(); i++){
            ID_List.add(userList.get(i).id);
            PW_List.add(userList.get(i).pw);
            Log.d("tag"+i, ID_List.get(i));
        }

        // db 닫기
        mDbHelper.close();
    }
}
