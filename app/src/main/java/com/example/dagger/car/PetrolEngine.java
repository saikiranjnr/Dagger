package com.example.dagger.car;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class PetrolEngine implements Engine {

    private int horsePower,engineCapacity;

@Inject
    public PetrolEngine(@Named("horse power") int horsePower,@Named("engine capacity") int engineCapacity) {
        this.horsePower = horsePower;
        this.engineCapacity=engineCapacity;
    }

   /* @Inject
    public PetrolEngine(){

    }*/


    @Override
    public void startEngine() {
        Log.d("car","petrol engine started. Horse power "+horsePower+" "+engineCapacity);
    }
}
