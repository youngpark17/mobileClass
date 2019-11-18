package com.example.youngwoon.class1118;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    EditText nextText;
    String m_imageName, m_strNext;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText)findViewById(R.id.editText);
        nextText = (EditText)findViewById(R.id.nextText);
        bt = findViewById(R.id.bt);

        SharedPreferences settings = getSharedPreferences("share",0);
        m_imageName = settings.getString("imageName","초기값, 디폴트");
        nextText.setText(m_imageName);
    }

    @Override
    protected void onStop() {
        super.onStop();
        SharedPreferences settings = getSharedPreferences("share",0);
        //SharedPreferences settings = getPreferences(0);
        m_imageName = editText.getText().toString();
        SharedPreferences.Editor editor = settings.edit();
        editor.putString("imageName",m_imageName);

        //2nd Example
        m_strNext = nextText.getText().toString();
        editor.putString("nextName", m_strNext);
        editor.commit();
    }

    public void onClick(View view){
        Intent intent = new Intent(this, SubActivity.class);
        startActivity(intent);

    }
}
