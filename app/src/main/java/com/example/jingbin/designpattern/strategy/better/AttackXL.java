package com.example.jingbin.designpattern.strategy.better;

import android.util.Log;

/**
 */

public class AttackXL implements IAttackBehavior {
    @Override
    public void attack() {
        Log.e("---", "降龙十八掌");
    }
}
