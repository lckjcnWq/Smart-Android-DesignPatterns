package com.example.jingbin.designpattern.strategy.better;

import android.util.Log;

/**
 */

public class DefendTMS implements IDefendBehavior {

    @Override
    public void defend() {
        Log.e("---", "铁布衫");
    }
}
