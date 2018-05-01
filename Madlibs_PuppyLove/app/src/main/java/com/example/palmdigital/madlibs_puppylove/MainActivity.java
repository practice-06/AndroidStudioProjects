package com.example.palmdigital.madlibs_puppylove;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button_story);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        EditText tv_color       = findViewById(R.id.tv_color);
        String color            = tv_color.getText().toString();

        EditText tv_bodypart    = findViewById(R.id.tv_bodypart);
        String bodypart         = tv_bodypart.getText().toString();

        EditText tv_noun        = findViewById(R.id.tv_noun);
        String noun           = tv_noun.getText().toString();

        EditText tv_verb       = findViewById(R.id.tv_verb);
        String verb            = tv_verb.getText().toString();

        EditText tv_adj         = findViewById(R.id.tv_adjective);
        String adj              = tv_adj.getText().toString();

        EditText et_adj2        = findViewById(R.id.et_adj);
        String adj2             = et_adj2.getText().toString();

        EditText et_verb2        = findViewById(R.id.et_verb);
        String verb2              =et_verb2.getText().toString();

        EditText tv_noun02        = findViewById(R.id.tv_noun02);
        String noun02           = tv_noun02.getText().toString();

        EditText tv_noun03      = findViewById(R.id.tv_noun03);
        String noun03           = tv_noun03.getText().toString();

        String story = "Today I saw him again. When he looks at me with those ";
        story = story + color;
        story = story + " eyes, it makes my " + bodypart;
        story = story + " go pitterpat, and I feel as if I have " + noun;
        story = story + " in my stomach. He scrunches his nose, I want to " + verb;
        story = story + " him softly. He is so " + adj;
        story = story + " and " + adj2;
        story = story + "." + " Tomorrow he will be mine. For now he " + verb2;
        story = story + " in the store " + noun02;
        story = story + " looking at me " + noun03;
        story = story + " love is hard to resist. ";

        TextView output = findViewById(R.id.button_story);
        output.setText(story);

    }
}
