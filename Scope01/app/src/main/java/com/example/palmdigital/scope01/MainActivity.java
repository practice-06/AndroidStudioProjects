package com.example.palmdigital.scope01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // declare a local varialble
        // dataType variableName; <-- this is a local variable declaration

        // some examples

        int myInt = 100; // int is a Java primitive type
        myInt = 200;
        double myDouble; // double is a Java primitive type
        char myChar;
        float myFloat;
        String myString;
        long myLong;
        byte myByte;
        // classes
        String myStrig;
        Integer myInt2;
        Float myFloat2;
        myInt = 5;
        myDouble = 5.6;
        myFloat = 5.7f;
        TextView tv_Num1Display;
        TextView tv_Num2Display;


        ImageView iv_stuff;
    }

    public void awesomeMethod() {


    }

}
