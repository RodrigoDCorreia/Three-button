package com.example.firstscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    public static final String EXTRA_BUTTON_ID = "com.example.firstscreen.extra.button_id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launch_first_activity(View view) {
        int id = view.getId();
        Log.d(TAG, "launch_first_activity: botão pressionado com id:" + id);
        Intent intentfirst = new Intent(this, FirstActivity.class);
        intentfirst.putExtra(EXTRA_BUTTON_ID, id);
        startActivity(intentfirst);
    }

}