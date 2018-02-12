package com.example.gamecam.modeltest.main.View;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.gamecam.modeltest.R;
import com.example.gamecam.modeltest.main.Presenter.mainPresenter;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private mainPresenter mainPresenter;
    private View mView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mView = findViewById(android.R.id.content);

        if (mainPresenter==null) {
            mainPresenter=new mainPresenter();
        }

        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getPresenter().onClick(mView);
            }
        });

    }


    public mainPresenter getPresenter() {
        return mainPresenter;
    }



}
