package com.example.palmdigital.a02toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "Hell0 Android Deve lopers",
                Toast.LENGTH_LONG).show();
        Toast.makeText(context: MainActivity.this, text:"Acount Created!",
        Toast.LENGTH_SHORT).show();

    }
}
