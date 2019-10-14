package com.example.dagger.car;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine {

    int horsePower;
@Inject
    public DieselEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void startEngine() {

        Log.d("car", "diesel engine started with horse poweer " + horsePower);
    }
}
