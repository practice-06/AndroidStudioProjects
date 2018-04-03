package com.example.palmdigital.multibuttons01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public TextView tvObject1;
    public Button buttonObjectBlue;
    public Button buttonObjectGreen;
    public Button buttonObjectRed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvObject1 = findViewById(R.id.textView);
        buttonObjectBlue = findViewById(R.id.buttonBlue);
        buttonObjectGreen = findViewById(R.id.buttonGreen);
        buttonObjectRed = findViewById(R.id.buttonRed);

        buttonObjectBlue.setOnClickListener(this);
        buttonObjectGreen.setOnClickListener(this);
        buttonObjectRed.setOnClickListener(this);

         public void onClick (View view)
    {
        if (view.getId() == R.id.buttonBlue) {
            setToBlue(0xff0000ff);
        }
            else if (view.getId() == R.id.buttonGreen)
                setToGreen(0xff00ff00);
            else {
                setToRed(0xffff0000);
            }
            public void setColor (int hexCode)
    {
    tvObject1.setText(hexCode);
    }
    public void setToBlue (int hexCode)
    {
        tvObject1.setText("Blue");
    }
    public void setToGreen (int hexCode)
    {
        tvObject1.setText("Green");
    }
    public void setToRed (int hexCode)
    {
        tvObject1.setText("Red");
    }
}

        }






