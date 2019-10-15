package com.example.dagger.di;


import com.example.dagger.MainActivity;
import com.example.dagger.car.Car;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

/*
@PerActivity
@Component(modules = {WheelsModule.class,PetrolEngineModule.class})
public interface ActivityComponent {

     Car getCar();

     void inject(MainActivity mainActivity);

     @Component.Builder
     interface Builder{

          ActivityComponent build();

          @BindsInstance
          Builder horsePower(@Named("horse power") int horsePower);

          @BindsInstance
          Builder engineCapacity(@Named("engine capacity") int engineCapacity);
     }
}
*/

@PerActivity
@Component(dependencies = AppComponent.class,modules = {WheelsModule.class,PetrolEngineModule.class})
public interface ActivityComponent {
     Car getCar();

     void inject(MainActivity mainActivity);

     @Component.Builder
     interface Builder{

          ActivityComponent build();

          @BindsInstance
          Builder horsePower(@Named("horse power") int horsePower);

          Builder appComponent(AppComponent appComponent);

          @BindsInstance
          Builder engineCapacity(@Named("engine capacity") int engineCapacity);
     }
}
