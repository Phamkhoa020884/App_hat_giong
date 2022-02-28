package com.example.app_hat_giong;

import android.util.Log;

public class Car {
    Engine engine;
    Wheel wheel;

    public Car(Engine engine, Wheel wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }
    void showCarInfo(){
        Log.d("BBB", "Engine: " + engine.name);
        Log.d("BBB", "Wheel : " + wheel.quantily);
    }
}
