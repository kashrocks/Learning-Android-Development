package com.example.a2login_textbutton;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void logInto(View view){
        EditText loginEditTextUser = (EditText) findViewById(R.id.loginEditText);
        EditText loginEditTextPass = (EditText) findViewById(R.id.loginEditText2);
        Log.i("info", "It worked!");
        // the below outputs to the log
        Log.i("Values", loginEditTextUser.getText().toString());
        Log.i("Values", loginEditTextPass.getText().toString());
        // the below makes a small message can be used as an error message
        Toast.makeText(this, "YOOOOo", Toast.LENGTH_SHORT).show();
        // below replaces the image when the button is clicked

        ImageView image = (ImageView) findViewById(R.id.oneDog);
        image.setImageResource(R.drawable.puppy);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
