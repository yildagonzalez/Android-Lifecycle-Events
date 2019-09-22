package com.vogella.android.lifecycleevents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Log.d (android.util) class will log message in logcat
        Log.d("Life Cycle Event: ", "In onCreate()");

    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("Life Cycle Event: ", "In onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("Life Cycle Event: ", "In onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("Life Cycle Event: ", "In onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("Life Cycle Event: ", "In onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Life Cycle Event: ", "In onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Life Cycle Event: ", "In onRestart()");
    }
}
