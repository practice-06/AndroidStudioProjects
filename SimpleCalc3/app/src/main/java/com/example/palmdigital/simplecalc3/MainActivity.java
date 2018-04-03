package com.example.palmdigital.simplecalc3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvNum1Display;
    TextView tvNum2Display;
    TextView textViewOutput;
    double num1;
    double num2;
    double sum;
    double oper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvNum1Display = findViewById(R.id.tvNum1Display);
        tvNum2Display = findViewById(R.id.tvNum2Display);
        textViewOutput = findViewById(R.id.textView);


        ImageView imageView0 = findViewById(R.id.imageView_0_top);
        ImageView imageView1 = findViewById(R.id.imageView_1_top);
        ImageView imageView2 = findViewById(R.id.imageView_2_top);
        ImageView imageView3 = findViewById(R.id.imageView_3_top);
        ImageView imageView4 = findViewById(R.id.imageView_4_top);
        ImageView imageView5 = findViewById(R.id.imageView_5_top);
        ImageView imageView6 = findViewById(R.id.imageView_6_top);
        ImageView imageView7 = findViewById(R.id.imageView_7_top);
        ImageView imageView8 = findViewById(R.id.imageView_8_top);
        ImageView imageView9 = findViewById(R.id.imageView_9_top);
        ImageView imageView00 = findViewById(R.id.imageView_0_bottom);
        ImageView imageView101 = findViewById(R.id.imageView_1_bottom);
        ImageView imageView102 = findViewById(R.id.imageView_2_bottom);
        ImageView imageView103 = findViewById(R.id.imageView_3_bottom);
        ImageView imageView104 = findViewById(R.id.imageView_4_bottom);
        ImageView imageView105 = findViewById(R.id.imageView_5_bottom);
        ImageView imageView106 = findViewById(R.id.imageView_6_bottom);
        ImageView imageView107 = findViewById(R.id.imageView_7_bottom);
        ImageView imageView108 = findViewById(R.id.imageView_8_bottom);
        ImageView imageView109 = findViewById(R.id.imageView_9_bottom);
        ImageView imageViewminus = findViewById(R.id.imageView_minus);
        ImageView imageViewplus = findViewById(R.id.imageView_plus);
        ImageView imageViewtimes = findViewById(R.id.imageView_times);
        ImageView imageViewdivide = findViewById(R.id.imageView_division);
        ImageView imageViewexponents = findViewById(R.id.imageView_exponential);
        ImageView imageView_equals = findViewById(R.id.imageView_equals);

        imageView0.setOnClickListener(this);
        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
        imageView4.setOnClickListener(this);
        imageView5.setOnClickListener(this);
        imageView6.setOnClickListener(this);
        imageView7.setOnClickListener(this);
        imageView8.setOnClickListener(this);
        imageView9.setOnClickListener(this);
        imageView00.setOnClickListener(this);
        imageView101.setOnClickListener(this);
        imageView102.setOnClickListener(this);
        imageView103.setOnClickListener(this);
        imageView104.setOnClickListener(this);
        imageView105.setOnClickListener(this);
        imageView106.setOnClickListener(this);
        imageView107.setOnClickListener(this);
        imageView108.setOnClickListener(this);
        imageView109.setOnClickListener(this);
        imageViewminus.setOnClickListener(this);
        imageViewplus.setOnClickListener(this);
        imageViewtimes.setOnClickListener(this);
        imageViewdivide.setOnClickListener(this);
        imageViewexponents.setOnClickListener(this);
        imageView_equals.setOnClickListener(this);


    }

    public void onClick(View v)
    {
        if (v.getId() == R.id.imageView_0_top)
       {
           tvNum1Display.setText("0");
           num1 =0;
       }
        else if(v.getId() == R.id.imageView_1_top)
        {
            tvNum1Display.setText("1");
            num1 =1;

        }
        else if (v.getId() == R.id.imageView_2_top)
        {
            tvNum1Display.setText("2");
            num1 =2;
        }
        else if (v.getId() == R.id.imageView_3_top)
        {
            tvNum1Display.setText("3");
            num1 =3;
        }
        else if (v.getId() == R.id.imageView_4_top)
        {
            tvNum1Display.setText("4");
            num1 =4;
        }
        else if (v.getId() == R.id.imageView_5_top)
        {
            tvNum1Display.setText("5");
            num1 =5;
        }
        else if (v.getId() == R.id.imageView_6_top)
        {
            tvNum1Display.setText("6");
            num1 =6;
        }
        else if (v.getId() == R.id.imageView_7_top)
        {
            tvNum1Display.setText("7");
            num1 =7;
        }
        else if (v.getId() == R.id.imageView_8_top)
        {
            tvNum1Display.setText("8");
            num1 =8;
        }
        else if (v.getId() == R.id.imageView_9_top)
        {
            tvNum1Display.setText("9");
            num1 =9;
        }
        else if (v.getId() == R.id.imageView_0_bottom)
       {
           tvNum2Display.setText("0");
           num2 =0;
       }
        else if (v.getId() == R.id.imageView_1_bottom)
        {
            tvNum2Display.setText("1");
            num2 =1;
        }
        else if (v.getId() == R.id.imageView_2_bottom)
        {
            tvNum2Display.setText("2");
            num2 =2;
        }
        else if (v.getId() == R.id.imageView_3_bottom)
        {
            tvNum2Display.setText("3");
            num2 =3;
        }
        else if (v.getId() == R.id.imageView_4_bottom)
        {
            tvNum2Display.setText("4");
            num2 =4;
        }
        else if (v.getId() == R.id.imageView_5_bottom)
        {
            tvNum2Display.setText("5");
            num2 =5;
        }
        else if (v.getId() == R.id.imageView_6_bottom)
        {
            tvNum2Display.setText("6");
            num2 =6;
        }
       else if (v.getId() == R.id.imageView_7_bottom)
       {
           tvNum2Display.setText("7");
           num2 =7;
       }
       else if (v.getId() == R.id.imageView_8_bottom)
       {
           tvNum2Display.setText("8");
           num2 =8;
       }
       else if (v.getId() == R.id.imageView_9_bottom)
       {
           tvNum2Display.setText("9");
           num2 =9;
       }
       else if (v.getId() == R.id.imageView_plus)
        {
            oper = 1;
        }
        else if (v.getId() == R.id.imageView_minus)
       {
           oper = 2;
       }
       else if (v.getId() == R.id.imageView_times)
       {
           oper = 3;
       }
       else if (v.getId() == R.id.imageView_division)
       {
           oper = 4;
       }
       else if (v.getId() == R.id.imageView_exponential)
       {
           oper = 5;
       }
        else if (v.getId()  == R.id.imageView_equals)
        {
            if (oper == 1)
            {
                sum = num1 + num2;
            }
            if(oper == 2)
            {
                sum = num1 - num2;
            }
            if (oper == 3)
            {
                sum = num1 * num2;
            }
            if (oper == 4)
            {
               if (num2 == 0)
               {
                   Toast.makeText(this, "division by 0 not accepted",Toast.LENGTH_SHORT).show();
               }
               else
               {
                   sum = num1 / num2;
               }
            }
            if (oper == 5)
            {
                sum = exp(num1,num2);
            }
            textViewOutput.setText("" + sum);
        }
    }
    public double exp(double base, double exponent)
    {
        double pro




        duct = 1;
        for (int i = 0; i < exponent; i++)
        {
            product = product * base;
        }
        return product;
    }


}

