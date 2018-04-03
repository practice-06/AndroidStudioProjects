package com.example.palmdigital.buttontotoast01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button buttonObject1 = (Button)findViewById(R.id.button1);
        buttonObject1.setOnClickListener((View.OnClickListener) this);

    }
    public void onClick (View view)
    {
        TextView textView = findViewById(R.id.textView1);
        String text = textView.getText().toString();


        if(text == "On")
            textView.setText("Off");
        else //it must be off

            TextView.setText("On");

    }
}
