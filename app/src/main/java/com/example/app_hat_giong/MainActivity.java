package com.example.app_hat_giong;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Engine engine= new Engine("Dong co 4 ma luc");
        Wheel wheel= new Wheel(4);
        Car  car= new Car(engine, wheel );
        car.showCarInfo();
    }
}