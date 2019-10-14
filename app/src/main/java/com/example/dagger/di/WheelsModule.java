package com.example.dagger.di;



import com.example.dagger.car.Rims;
import com.example.dagger.car.Tires;
import com.example.dagger.car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {

    @Provides
    Rims provideRims(){
        return new Rims();

    }


    @Provides
    Tires provideTires(){
        Tires tires=new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    Wheels createWheels(){
        return new Wheels(provideRims(),provideTires());
    }


}
