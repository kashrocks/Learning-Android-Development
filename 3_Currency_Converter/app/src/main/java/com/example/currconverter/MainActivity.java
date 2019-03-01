package com.example.currconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view){



        EditText input = (EditText) findViewById(R.id.amountEditText);
        String amountInCad = input.getText().toString();
        double amountInCadDouble = Double.parseDouble(amountInCad);
        double amountInUsdDouble = amountInCadDouble * 0.75;
        String amountInUsd = String.format("%.2f", amountInUsdDouble);
        Toast.makeText(this, "$ " + amountInUsd + " in USD" , Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
