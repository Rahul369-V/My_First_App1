package com.rahul;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.rahul.R;

public class char1_page extends AppCompatActivity {
TextView chara1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_char1_page);
        chara1= findViewById( R.id.char1);
        Intent intent =getIntent();
        String A = intent.getStringExtra("name1");
        chara1.setText(A);


    }
}