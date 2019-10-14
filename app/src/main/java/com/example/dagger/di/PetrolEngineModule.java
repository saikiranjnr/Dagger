package com.example.dagger.di;

import com.example.dagger.car.Engine;
import com.example.dagger.car.PetrolEngine;

import dagger.Module;
import dagger.Provides;

@Module
public class PetrolEngineModule {


    @Provides
    public Engine providesEngine(PetrolEngine petrolEngine){
        return petrolEngine;
    }
}
