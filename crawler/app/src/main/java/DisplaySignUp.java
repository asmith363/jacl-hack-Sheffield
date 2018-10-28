package com.example.playground;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;


import java.util.Calendar;

public class DisplaySignUp extends AppCompatActivity {
    private EditText Name;
    private EditText Password;
    private EditText Password2 ;
    private EditText Email ;
    private EditText DoB ;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_sign_up);
        Name = (EditText) findViewById(R.id.newuser);
        Password = (EditText) findViewById(R.id.pass1);
        Password2 = (EditText) findViewById(R.id.pass2);
        Email = (EditText) findViewById(R.id.email);
        DoB = (EditText) findViewById(R.id.dob);
        //Calendar cal = Calendar.getInstance();
        //cal.setLenient(false);
        //DoB = DoB.getText();
        //cal.setTime(DoB);

    }

    private void validate(){
        boolean cont = true ;
        if (Name.length() <8){
            userError.setText("usernames must be 8 characters");
            cont = false ;
        }
        if (Password.length() <8){
            pass1Error.setText("passwords must be 8 characters");
            cont = false ;
        }
        if (Password != Password2){
            pass2.setText("passwords do not match");
            cont = false ;
        }
        if (!EmailCheck.isValidEmail(Email.getText())){
            mailError.setText("not a valid email");
            cont = false ;
        }
        if (cont){
            Intent intent = new Intent(this, something.class);
            startActivity(intent);
        }

        /*try {
            cal.getTime();
        }
        catch (Exception e) {
            System.out.println("Invalid date");
        }*/
    }
}


