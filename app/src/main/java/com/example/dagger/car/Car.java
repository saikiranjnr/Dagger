package com.example.dagger.car;

import android.util.Log;

import com.example.dagger.di.PerActivity;

import javax.inject.Inject;

@PerActivity
public class Car {


    public static final String TAG="car";
    Engine engine;
    Wheels wheels;
    Driver driver;

    @Inject
     Car(Engine engine, Wheels wheels,Driver driver){
         this.engine=engine;
         this.driver=driver;
         this.wheels=wheels;
    }

    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }

    public void doWork(){
        engine.startEngine();
        Log.d(TAG,driver+" driving.. "+this);
    }
}
