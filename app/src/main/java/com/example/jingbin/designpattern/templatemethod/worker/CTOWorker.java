package com.example.jingbin.designpattern.templatemethod.worker;

import android.util.Log;

import com.example.jingbin.designpattern.templatemethod.Worker;

/**
 * CTO
 */

public class CTOWorker extends Worker {

    public CTOWorker(String name) {
        super(name);
    }

    @Override
    public void work() {
        Log.e("--work", "---" + name + ", 开会 - 出API - 检查进度");
    }
}
