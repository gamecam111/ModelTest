package com.example.gamecam.modeltest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


import com.example.gamecam.modeltest.main.ui.MainActivity;

import javax.inject.Inject;

public class Screen2 extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

    }

    public void back (View view) {
        startActivity (new Intent(getApplicationContext(), MainActivity.class));
    }
}
