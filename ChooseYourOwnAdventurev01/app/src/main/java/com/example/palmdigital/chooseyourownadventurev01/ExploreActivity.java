package com.example.palmdigital.chooseyourownadventurev01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExploreActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button wakeUpObject = findViewById(R.id.leftButtonWakeUp);
        wakeUpObject.setOnClickListener(this);
        Button mainObject = findViewById(R.id.rightButtonExplore);
        mainObject.setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {
        if (view.getId() == R.id.buttonLeftBackyard)
        {
            Intent i = new Intent(this, BackyardActivity.class);
            startActivity(i);
        }
        if (view.getId() == R.id.buttonRightToilet)
        {
            Intent i = new Intent(this, ToiletActivity.class);
            startActivity(i);
        }
    }
}
