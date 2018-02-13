package com.example.gamecam.modeltest.main.injects;

/**
 * Created by gamecam on 13.2.2018.
 */

import com.example.gamecam.modeltest.main.ui.MainActivity;

import javax.inject.Singleton;
import dagger.Component;

@Singleton
@Component(modules = {MainPModul.class})
public interface MyComponent {
    void inject(MainActivity activity);
}
