package com.example.jingbin.designpattern.strategy.better;

import android.util.Log;

/**
 *
 */

public class DisplayYZ implements IDisplayBehavior {

    @Override
    public void display() {
        Log.e("---", "样子2");
    }
}
