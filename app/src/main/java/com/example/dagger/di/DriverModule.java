package com.example.dagger.di;

import com.example.dagger.car.Driver;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DriverModule {

    @Provides
    @Singleton
    static Driver provideDriver() {

        return new Driver();
    }

}
