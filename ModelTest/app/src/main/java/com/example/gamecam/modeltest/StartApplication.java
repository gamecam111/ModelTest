package com.example.gamecam.modeltest;

import android.content.Context;

/**
 * Created by gamecam on 14.2.2018.
 */

public class StartApplication extends CoreApplication<AppComponent> {


    @Override
    public void onCreate() {
        super.onCreate();

        if(BuildConfig.DEBUG) {

        }

    }

    public AppComponent initAppComponents() {
        return DaggerAppComponent
                .builder()
                .appModule(new AppModule(this)).build();
    }

    public static StartApplication get(Context context) {
        return (StartApplication) context.getApplicationContext();
    }
}
