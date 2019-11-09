package com.example.youngwoon.class0909;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClicked(View v){
        Toast.makeText(getApplicationContext(), "버튼이 눌려졌습니다.", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, SubActivity.class);

        startActivity(intent);
    }

}
