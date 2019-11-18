package com.example.youngwoon.class1118;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

public class SubActivity extends AppCompatActivity {
    EditText editText2;
    String m_strNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub);
        editText2 = (EditText)findViewById(R.id.editText2);

        SharedPreferences settings = getSharedPreferences("share",0);
        m_strNext = settings.getString("nextName","default");
        editText2.setText(m_strNext);
    }
}
