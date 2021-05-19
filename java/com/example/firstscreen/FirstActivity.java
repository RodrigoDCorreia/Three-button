package com.example.firstscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

public class FirstActivity extends AppCompatActivity {

    private static final String TAG = "FirstActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Intent intent = getIntent();
        int id = intent.getIntExtra(MainActivity.EXTRA_BUTTON_ID, R.id.first_button_main);
        Log.d(TAG, "onCreate: Recebido id" + id);//tela desligada as 19h

        String text = "";
        switch (id){
            case R.id.first_button_main:
                text = "Oii eu sou o Goku!";
                break;
            case R.id.second_button_main:
                text = "Oii eu sou o Majin Boooo";
                break;
            case R.id.trird_button_main:
                text = "Oii eu sou o Androide 18!";
                break;
        }

        TextView textView = findViewById(R.id.text_display);
        textView.setText(text);

    }
}