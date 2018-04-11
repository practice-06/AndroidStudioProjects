package com.example.palmdigital.chooseyourownadventurev01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ToiletActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toilet);

        Button yesObject = findViewById(R.id.Yes);
        yesObject.setOnClickListener(this);
        Button heckyesObject = findViewById(R.id.HeckYes);
        heckyesObject.setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {
        if (view.getId() == R.id.Yes)
        {
            Intent i = new Intent(this, YesActivity.class);
            startActivity(i);
        }
        if (view.getId() == R.id.HeckYes)
        {
            Intent i = new Intent(this, YesActivity.class);
            startActivity(i);
        }
    }
}
