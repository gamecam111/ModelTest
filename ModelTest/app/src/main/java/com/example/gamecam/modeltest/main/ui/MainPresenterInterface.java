package com.example.gamecam.modeltest.main.ui;

import android.content.Context;

/**
 * Created by gamecam on 13.2.2018.
 */

public interface MainPresenterInterface {
    public Context getContext();
    public int getActual();
    public void setActual(int x);
}
