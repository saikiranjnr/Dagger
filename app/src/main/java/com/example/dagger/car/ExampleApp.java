package com.example.dagger.car;

import android.app.Application;

import com.example.dagger.di.ActivityComponent;
import com.example.dagger.di.DaggerActivityComponent;

public class ExampleApp extends Application {
private ActivityComponent carComponent;

    @Override
    public void onCreate() {
        super.onCreate();
         carComponent= DaggerActivityComponent.builder().horsePower(150).engineCapacity(1500).build();

    }


    public ActivityComponent getCarComponent(){
        return carComponent;
    }
}
