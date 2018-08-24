package com.example.jingbin.designpattern.bridge;

import android.util.Log;

import com.example.jingbin.designpattern.TagContants;

/**
 * Description: #TODO
 *
 */
public class RacingCar extends Car{
    public RacingCar(ITire tire) {
        super(tire);
    }

    @Override
    public void run() {
        Log.e(TagContants.TAG, "racing car " + getTire().run());
    }
}
