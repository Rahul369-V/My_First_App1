package com.rahul;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class page_2 extends AppCompatActivity {
    TextView title,charactername,luckynumber;
    Button nextbuttton2;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //hooks
        setContentView(R.layout.activity_page2);

        title= findViewById(R.id.text1);
        charactername= findViewById(R.id.text2);
        luckynumber =findViewById(R.id.text3);
        nextbuttton2 = findViewById(R.id.button3);

        //INTEnT TO GET  THE DATA
        Intent intent=getIntent();
          final String name =intent.getStringExtra("NAME");
         charactername .setText(name);

         // lucky number of the  person

         int x=name.length();
         luckynumber.setText("Your Lucky Number Is : "+x);

        nextbuttton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String CHARACTERS=name;
                if (CHARACTERS.startsWith("a")) {
                    Intent intent1 =new Intent(page_2.this, char1_page.class);
                    intent1.putExtra("name1",CHARACTERS);
                    startActivity(intent1);


                }else if (CHARACTERS.startsWith("r")){
                    Intent intent1 =new Intent(page_2.this, activity_char2_page.class);
                    intent1.putExtra("name2",CHARACTERS);

                    startActivity(intent1);

                }else if (CHARACTERS.startsWith("d")){
                    Intent intent1 =new Intent(page_2.this, char3_page.class);
                    intent1.putExtra("name3",CHARACTERS);
                    startActivity(intent1);


                }else{
                    Intent intent1 =new Intent(page_2.this, char4_page.class);
                    intent1.putExtra("name4",CHARACTERS);
                    startActivity(intent1);
                }


            }
        });






    }



}