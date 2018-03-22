package com.example.gamecam.modeltest.SecondScreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


import com.example.gamecam.modeltest.R;
import com.example.gamecam.modeltest.StartApplication;
import com.example.gamecam.modeltest.main.injects.MainPModul;
import com.example.gamecam.modeltest.main.ui.MainActivity;
import com.example.gamecam.modeltest.main.ui.MainPresenter;

import javax.inject.Inject;

public class Screen2 extends AppCompatActivity {

    @Inject
    MainPresenter mp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        StartApplication.get(this)
                .component()
                .plus(new MainPModul(getApplicationContext()))
                .inject(this);

        System.out.println(mp.getActual());
        System.out.println(mp.plus(mp.getActual(), 1));
    }

    public void back (View view) {
        startActivity (new Intent(getApplicationContext(), MainActivity.class));
    }
}
