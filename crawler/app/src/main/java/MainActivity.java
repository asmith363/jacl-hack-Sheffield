package com.example.playground;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private Button Login ;
    private Button SignUp ;
    private EditText MyDate ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name = (EditText) findViewById(R.id.usernameInput);
        Password = (EditText) findViewById(R.id.passwordInput);
        Login = (Button) findViewById(R.id.signin);
        SignUp = (Button) findViewById(R.id.signup);
        MyDate = (EditText) findViewById(R.id.dob);


        Login.setOnClickListener( new View.OnClickListener() {
            public void onClick(View view){
                sendUser(Name.getText().toString(), Password.getText().toString());
            }
        } );

        /*
        MyDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new DatePickerDialog(MainActivity.this, date, myCalendar.get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });
        */

    }
/*
    private void updateLabel() {
        String myFormat = "dd/MM/yy";
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.UK);
        MyDate.setText(sdf.format(myCalendar.getTime()));
    }
*/
    private void sendUser(String userName, String userPassword){
        if (userName.equals("admin") && userPassword.equals("password")){
            Intent intent = new Intent(MainActivity.this, DisplaySignUp.class);
            startActivity(intent);
        }else {
            AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
            alertDialog.setTitle("Error!");
            alertDialog.setMessage("Wrong username or password");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
            alertDialog.show();

        }
    }

/*    Calendar myCalendar = Calendar.getInstance();

    DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {
            myCalendar.set(Calendar.YEAR, year);
            myCalendar.set(Calendar.MONTH, monthOfYear);
            myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
            updateLabel();
        }

    };
*/

    public void createUser(View view){
        Intent intent = new Intent(this, DisplaySignUp.class);
        startActivity(intent);
    }

}
