package com.example.connect3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView myListView;

    public void generateTimesTable(int timesTableNumber) {

        final ArrayList<String> myFamily = new ArrayList<String>();
        for (int j = 1; j <= 10; j++){
            myFamily.add(String.valueOf(j*timesTableNumber));
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myFamily);

        myListView.setAdapter(arrayAdapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //generateTimesTable(1);


        final SeekBar tableSeekBar = findViewById(R.id.seekBar);
        myListView = findViewById(R.id.myListView);
        int max = 20;
        int startingPos = 10;
        tableSeekBar.setMax(max);
        tableSeekBar.setProgress(startingPos);
        generateTimesTable(startingPos);

        tableSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int min = 1;
                int timesTableNumber;
                if (progress < min) {
                    timesTableNumber = min;
                    tableSeekBar.setProgress(min);
                } else {
                    timesTableNumber = progress;
                }

                Log.i("Seek bar val", Integer.toString(timesTableNumber));
                generateTimesTable(timesTableNumber);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });






    }
}
