package com.example.dagger.di;

import com.example.dagger.car.Driver;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {DriverModule.class})
@Singleton
public interface AppComponent {

    Driver getDriver();

}
