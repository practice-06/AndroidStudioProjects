package com.example.palmdigital.chooseyourownadventurev01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button wakeUpObject = findViewById(R.id.leftButtonWakeUp);
        wakeUpObject.setOnClickListener(this);
        Button exploreObject = findViewById(R.id.rightButtonExplore);
        exploreObject.setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {
        if (view.getId() == R.id.leftButtonWakeUp)
        {
            Intent i = new Intent(this, WakeUpActivity.class);
            startActivity(i);
        }
        if (view.getId() == R.id.rightButtonExplore)
        {
            Intent i = new Intent(this, ExploreActivity.class);
            startActivity(i);
        }
    }
}
