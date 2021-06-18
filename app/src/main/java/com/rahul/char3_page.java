package com.rahul;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class char3_page extends AppCompatActivity {
 TextView chara3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.char3_page);
        chara3= findViewById(R.id.char3);
        Intent intent= getIntent();
        String R =intent.getStringExtra("name3");
        chara3.setText(R);
    }
}