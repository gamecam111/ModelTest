package com.example.gamecam.modeltest.main.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.gamecam.modeltest.R;
import com.example.gamecam.modeltest.Screen2;
import com.example.gamecam.modeltest.main.injects.DaggerMyComponent;
import com.example.gamecam.modeltest.main.injects.MainPModul;
import com.example.gamecam.modeltest.main.injects.MyComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {


    EditText inUsername, inNumber;
    Button btnSave, btnGet;
    private MyComponent myComponent;



    @Inject
    MainPresenter mp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSave=findViewById(R.id.btnSave);
        btnGet=findViewById(R.id.btnnn);

        myComponent = DaggerMyComponent.builder().mainPModul(new MainPModul(this)).build();
        myComponent.inject(this);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.setActual(99);
            }
        });

        btnGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             System.out.println(mp.getActual());
            }
        });

        System.out.println("**************"+mp.getActual());
        mp.setText("toto je test");

    }

    public void screen2 (View view) {
        startActivity(new Intent(getApplicationContext(), Screen2.class));
    }

}
