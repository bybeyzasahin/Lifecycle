package com.example.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    String log = "WHEREEEEEEEEE : ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(log, "onCreate() method works");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(log, "onStart() method works");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(log, "onResume() method works");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(log, "onPause() method works");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(log, "onStop() method works");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(log, "onDestroy() method works");
    }

}