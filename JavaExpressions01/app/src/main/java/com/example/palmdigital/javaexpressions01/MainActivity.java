package com.example.palmdigital.javaexpressions01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int a = 10;
        String b = "Alan Turing";
        boolean c = true;
        Log.i(tag:"info", msg:"Hello World");
        Log.i( tag: "info", msg: "a = " + a)
        Log.i( tag: "info", msg: "b = " + b)
        Log.i( tag: "info", msg: "c = " + c)

        Log.i(tag: "info", msg:"a = " + a);
        Log.i(tag: "info", msg:"c = " + (1+ 1 == 3));
int result = myAwsesomeFunction();
        float myfloat = 4.0f;
         double myDouble = 42.0;

         // Challenge: make a memthod that returns void that logs something out to the console

        int myFunction2

         }

    }// end of onCreate method
    int myAwsesomeFunction() {
    return 1000;

}
// return a float
float myFloatReturner()
{
   return  100.0f;
} 
void myFunction2()
{
    Log.i(tag: "info", msg: "Hello from myFunction2!")
}















