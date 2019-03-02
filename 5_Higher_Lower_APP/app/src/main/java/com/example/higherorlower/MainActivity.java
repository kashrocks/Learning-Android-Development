package com.example.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int actual;

    public void guessCheck(View view) {
        EditText input = (EditText) (findViewById(R.id.numEditText));
        int conInput = Integer.parseInt(input.getText().toString());

        if (conInput > actual) {

            Toast.makeText(this, "The num is lower", Toast.LENGTH_SHORT).show();

        } else if (conInput < actual) {

            Toast.makeText(this, "The num is higher", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "You guessed the number: " + Integer.toString(actual) + " correctly!", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random ran = new Random();

        actual = ran.nextInt(21);

        Toast.makeText(this, "Number is  " + Integer.toString(actual), Toast.LENGTH_SHORT).show();

    }
}
