package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";



    Button button, button2;
    ImageButton imageButton1, imageButton2;
    TextView textView1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "onCreate");

        Button button = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);
        ImageButton imageButton1 = findViewById(R.id.imageButton1);
        ImageButton imageButton2 = findViewById(R.id.imageButton2);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Button works fine", Toast.LENGTH_LONG).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), SecondActivity.class);
                view.getContext().startActivity(intent);}
        });



    }

    @Override
    protected void onStart() {
        super.onStart();
    Toast.makeText(getApplicationContext(), "noStart", Toast.LENGTH_LONG).show();
        Log.i(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
     Toast.makeText(getApplicationContext(), "onResume", Toast.LENGTH_LONG).show();
        Log.i(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
       Toast.makeText(getApplicationContext(), "onPause", Toast.LENGTH_LONG).show();
        Log.i(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "onStop", Toast.LENGTH_LONG).show();
        Log.i(TAG, "onStop: ");
        Log.e(TAG, "onStop: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
       Toast.makeText(getApplicationContext(), "onRestart", Toast.LENGTH_LONG).show();
        Log.i(TAG, "onRestart: ");
        Log.e(TAG, "onRestart: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
       Toast.makeText(getApplicationContext(), "onDestroy", Toast.LENGTH_LONG).show();
        Log.i(TAG, "onDestroy: ");
        Log.e(TAG, "onDestroy: ");
    }
}
