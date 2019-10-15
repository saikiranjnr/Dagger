package com.example.dagger;

import android.app.Activity;
import android.os.Bundle;

import com.example.dagger.car.Car;
import com.example.dagger.car.ExampleApp;
import com.example.dagger.di.ActivityComponent;
/*import com.example.dagger.di.DaggerActivityComponent;*/
import com.example.dagger.di.DieselEngineModule;

import javax.inject.Inject;


public class MainActivity extends Activity {
    @Inject
    Car car1,car2;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //When you are not passing the values at runtime
/* ActivityComponent carComponent= DaggerActivityComponent.create();*/
         //If u are going to initailise the values at runtime we use builder, to inject at runtime

//                .dieselEngineModule(new DieselEngineModule(1000)).build();

     /*   car1.doWork();
        car2.doWork();*/
/*
        ActivityComponent carComponent= ((ExampleApp)getApplication()).getCarComponent();
*/
/*
        ActivityComponent carComponent= DaggerActivityComponent.builder().engineCapacity(1500).horsePower(140).appComponent(((ExampleApp)getApplication()).getAppComponent()).build();
*/


        ActivityComponent carComponent= (((ExampleApp)getApplication()).getAppComponent()).activityComponent().create(1500,5000);
        carComponent.inject(this);


        car1.doWork();
        car2.doWork();
    }
}
