package com.example.gamecam.modeltest;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;

import dagger.Module;
import dagger.Provides;

/**
 * Created by gamecam on 14.2.2018.
 */

@Module
public class AppModule {

    private static final String PREFERENCES_FILE_NAME = "tramon_prefs";

    private final StartApplication mApplication;
    private final Context mContext;

    public AppModule(final StartApplication application) {
        this.mApplication = application;
        this.mContext = application.getApplicationContext();
    }

    @Provides
    @ApplicationScope
    Application provideApplication () {
        return this.mApplication;
    }

    @Provides
    @ApplicationScope
    Context provideContext () {
        return this.mContext;
    }

    @Provides
    @ApplicationScope
    Resources provideResources() {
        return mApplication.getResources();
    }

    @Provides
    @ApplicationScope
    SharedPreferences provideSharedPreferences() {
        return mApplication.getSharedPreferences(PREFERENCES_FILE_NAME, 0);
    }

}
