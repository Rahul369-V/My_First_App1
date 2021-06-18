package com.rahul;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.util.Log;
import android.view.View;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;


public class MainActivity extends AppCompatActivity {

    // public MediaPlayer theme;

    EditText username, password ;
    Button registerbutton ,nextbutton1 ;
    TextView errormessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     //   theme=MediaPlayer.create(MainActivity.this,R.raw.theme1);

        setContentView(R.layout.activity_main);
       username =findViewById(R.id.box1);
       password =findViewById(R.id.box2);
       registerbutton=findViewById(R.id.button1);
         nextbutton1=findViewById(R.id.button2);
         errormessage =findViewById(R.id.error);

         registerbutton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

                String name =username.getText().toString();
                String pass = password.getText().toString();
                String error1 ="please provide the valid  details ";

                if(validpassword(pass)&validusername(name)){
                    Toast.makeText(MainActivity.this,"SUCCESS",Toast.LENGTH_LONG).show();

                    // theme.start();



                }
                else{
                    errormsg(error1);
                }
             }
         });



        nextbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String condition1 = username.getText().toString();
                String condition2 =password.getText().toString();
                if (validpassword(condition2)&validusername(condition1)){
                    Intent intent =new Intent(MainActivity.this,page_2.class);
                    intent.putExtra("NAME",condition1);

                       startActivity(intent);


                }else{
                    Toast.makeText(MainActivity.this,"failed",Toast.LENGTH_LONG).show();
                }


            }
        });

        Log.i("lifecycle", "onCreate()");   // AVTIVIVITY LIFE CYCLE

    }

//    @Override
//    protected void onResume() {     //// TODO : ACTIVITY LIFE CYCLE IMPORTANT
//        super.onResume();
//        String Name =username.getText().toString();
//        String passs = password.getText().toString();
//        Log.i("lifecycle", "onResume: ");
//        if (validpassword(passs)&validusername(Name)) {
//            theme.start();
//        }


//    protected  void onPause(){
//        super.onPause();
//        Log.i("lifecycle", "onPause: ");
//        theme.;
//    }
   private String SECRET ="123";

    private boolean validusername(String name){
     return correctuser("^[A-Za-z]+$",name);
    }
    private boolean validpassword(String pass){
        if(pass.equals(SECRET)){
            return true;}
        else {
            return false;
        }
    }
    private  void errormsg(String error){
        errormessage.setVisibility(View.VISIBLE);
        errormessage .setText(error);

    }
     private boolean correctuser (String pattern,String input){

    Pattern r =Pattern.compile(pattern);   ///// CLASS SHOULD BE IN PASCAL NAME CONVENTION(Pattern)
    return r.matcher(input).matches();



     }


}

