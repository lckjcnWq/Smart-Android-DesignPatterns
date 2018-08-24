package com.example.jingbin.designpattern.bridge;

import android.util.Log;

import com.example.jingbin.designpattern.TagContants;

/**
 * Description: #TODO
 *
 */
public class SedanCar extends Car{
    public SedanCar(ITire tire) {
        super(tire);
    }

    @Override
    public void run() {
        Log.e(TagContants.TAG, "sedan car " + getTire().run());
    }
}
