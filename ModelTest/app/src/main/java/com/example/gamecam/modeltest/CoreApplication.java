package com.example.gamecam.modeltest;

import android.app.Application;

/**
 * Created by gamecam on 14.2.2018.
 */

public abstract class CoreApplication<T> extends Application {
    private static CoreApplication instance;
    private T component;

    protected abstract T initAppComponents();

    public static CoreApplication getApp() {
        return instance;
    }

    public CoreApplication() {
        instance = this;
    }

    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {

        }

        this.component = initAppComponents();
    }

    public T component() {
        return this.component;
    }
}
