package com.rahul;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class char4_page extends AppCompatActivity {
TextView chara4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.char4_page);
        chara4 =findViewById(R. id.char4);
        Intent intent =getIntent();
        String D =intent.getStringExtra("name4");
        chara4.setText(D);
    }
}