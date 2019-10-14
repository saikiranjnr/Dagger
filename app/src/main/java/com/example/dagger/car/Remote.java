package com.example.dagger.car;

import android.util.Log;

import javax.inject.Inject;

class Remote {
    @Inject
    Remote(){

    }

    public void setListener(Car car){
        Log.d("car","Remote connected to the car");
    }
}
