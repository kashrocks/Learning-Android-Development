package com.example.animations;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean bartShow = true;

    public void fade(View view){

        ImageView bartImageView = (ImageView) findViewById(R.id.bartImageView);
        ImageView homerImageView = (ImageView) findViewById(R.id.homerImageView);

//        if (bartShow) {
//            bartImageView.animate().alpha(0).setDuration(2000);
//            homerImageView.animate().alpha(1).setDuration(2000);
//            bartShow = false;
//        } else {
//            bartImageView.animate().alpha(1).setDuration(2000);
//            homerImageView.animate().alpha(0).setDuration(2000);
//            bartShow = true;
//        }

        bartImageView.animate().translationY(1000)


        Log.i("Info", "Tapped");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
