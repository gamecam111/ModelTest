package com.example.gamecam.modeltest.main.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.TextView;

/**
 * Created by gamecam on 12.2.2018.
 */
import com.example.gamecam.modeltest.R;

import javax.inject.Inject;


public class MainPresenter implements MainPresenterInterface{
    private Context mContext;
    private TextView tx;
    private MainModel md;
    private int actual=0;

    @Inject
    public MainPresenter(Context cn) {
        this.mContext = cn;
        //md= new MainModel();

    }

    public Context getContext() {
        return mContext;
    }

    public int getActual() {
        return actual;
    }

    public void setActual(int actual) {
        this.actual = actual;
    }

    public void setText (String text) {
        tx=(TextView) ((Activity) mContext).findViewById(R.id.textView);
        tx.setText(text);
    }
}
