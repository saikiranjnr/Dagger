package com.example.dagger.di;

import com.example.dagger.car.DieselEngine;
import com.example.dagger.car.Engine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;


@Module
public class DieselEngineModule {

    int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    Engine providesEngine(DieselEngine dieselEngine) {
        return dieselEngine;
    }


    @Provides
    int provideHorsePower() {
        return horsePower;
    }


}


//Instead of it we can use abstract class, to reduce boiler plate code, Instead of provides, in abstract class we can use @Binds
/*
@Module
abstract class DieselEngineModule{
    @Binds
    abstract Engine bindEngine(DieselEngine dieselEngine);
}
*/
