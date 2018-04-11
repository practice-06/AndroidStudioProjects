package com.example.palmdigital.chooseyourownadventurev01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BackyardActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backyard);

        Button ScreamObject = findViewById(R.id.LeftScream);
        ScreamObject.setOnClickListener(this);
        Button  FainObject= findViewById(R.id.RightFaint);
        FainObject.setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {
        if (view.getId() == R.id.RightFaint)
        {
            Intent i = new Intent(this, WakeUpActivity.class);
            startActivity(i);
        }
        if (view.getId() == R.id.LeftScream)
        {
            Intent i = new Intent(this, ScreamActivity.class);
            startActivity(i);
        }
    }
}
