package com.example.dagger.car;


import android.app.Application;

import com.example.dagger.di.AppComponent;
import com.example.dagger.di.DaggerAppComponent;

public class ExampleApp extends Application {
/*private ActivityComponent carComponent;

    @Override
    public void onCreate() {
        super.onCreate();
         carComponent= DaggerActivityComponent.builder().horsePower(150).engineCapacity(1500).build();

    }


    public ActivityComponent getCarComponent(){
        return carComponent;
    }*/

private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
       /* appComponent=Dagg.create();*/
         appComponent= DaggerAppComponent.create();
    }

    public AppComponent getAppComponent(){
        return appComponent;
    }
}

