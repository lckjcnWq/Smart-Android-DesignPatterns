package com.example.jingbin.designpattern.templatemethod.worker;

import android.util.Log;

import com.example.jingbin.designpattern.templatemethod.Worker;

/**
 * 一些自由人员
 */

public class OtherWorker extends Worker {

    public OtherWorker(String name) {
        super(name);
    }

    @Override
    public void work() {
        Log.e("--work", "---" + name + ",打LOL...");
    }
}
