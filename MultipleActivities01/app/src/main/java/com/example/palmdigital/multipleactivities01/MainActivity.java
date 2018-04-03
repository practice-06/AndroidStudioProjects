package com.example.palmdigital.multipleactivities01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    Button bSwitch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bSwitch = findViewById(R.id.buttonSwitch);

        bSwitch.setOnClickListener((View.OnClickListener) this);

    }
    public void onClick(View view)
    {
     if (view.getId() == R.id.buttonSwitch)
     {
         Intent i = new Intent(this, Main2Activity.class);
         startActivity(i);
     }
    }
}
