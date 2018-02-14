package com.example.gamecam.modeltest.main.injects;

/**
 * Created by gamecam on 13.2.2018.
 */

import android.content.Context;
import android.content.SharedPreferences;

import com.example.gamecam.modeltest.ApplicationScope;
import com.example.gamecam.modeltest.main.ui.MainPresenter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


@Module
public class MainPModul {

    private Context context;

    public MainPModul(Context context) {
        this.context = context;
    }

    @Provides
    @ApplicationScope
    MainPresenter getPresenter() {
        return new MainPresenter(context);
    }
}