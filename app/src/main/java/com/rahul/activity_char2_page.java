package com.rahul;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.rahul.R;

public class activity_char2_page extends AppCompatActivity {
 TextView chara2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_char2_page);
        chara2= findViewById( R.id.char2);
        Intent intent =getIntent();
        String A = intent.getStringExtra("name2");
       chara2.setText(A);

    }
}