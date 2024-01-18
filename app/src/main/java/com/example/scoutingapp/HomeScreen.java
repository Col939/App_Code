package com.example.scoutingapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class HomeScreen extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("check", "this works 110");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);

        findViewById(R.id.pitScouting).setOnClickListener(this);
        findViewById(R.id.matchScouting).setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {

    }
}

