package com.example.palmdigital.buttontotextview01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonObject1 = findViewById(R.id.button01);
        buttonObject1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        TextView tvObject1 = findViewById(R.id.textView1);
        tvObject1.setText("You changed me!");

        String text = tvObject1.getText().toString();

        Log.i("info" ,"text");
    }
}
