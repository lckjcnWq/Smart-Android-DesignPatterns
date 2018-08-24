package com.example.jingbin.designpattern.templatemethod.worker;

import android.util.Log;

import com.example.jingbin.designpattern.templatemethod.Worker;

/**
 * HR
 */

public class HRWorker extends Worker {

    public HRWorker(String name) {
        super(name);
    }

    @Override
    public void work() {
        Log.e("--work", "---" + name + ", 看简历 - 打电话 - 接电话");
    }
}
