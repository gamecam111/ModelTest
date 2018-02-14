package com.example.gamecam.modeltest;

/**
 * Created by gamecam on 14.2.2018.
 */

import com.example.gamecam.modeltest.main.injects.MainPModul;
import com.example.gamecam.modeltest.main.injects.MyComponent;

import javax.inject.Singleton;

import dagger.Component;

@ApplicationScope
@Component(modules = { AppModule.class})
public interface AppComponent {
    MyComponent plus(MainPModul module);

}

