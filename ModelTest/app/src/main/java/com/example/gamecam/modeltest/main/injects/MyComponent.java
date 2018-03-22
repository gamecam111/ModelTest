package com.example.gamecam.modeltest.main.injects;

/**
 * Created by gamecam on 13.2.2018.
 */

import com.example.gamecam.modeltest.ApplicationScope;
import com.example.gamecam.modeltest.SecondScreen.Screen2;
import com.example.gamecam.modeltest.main.ui.MainActivity;

import javax.inject.Singleton;
import dagger.Component;
import dagger.Subcomponent;

@ApplicationScope
@Subcomponent(
        modules = {MainPModul.class}
)

public interface MyComponent {
    void inject(MainActivity activity);
    void inject(Screen2 activity);
}
