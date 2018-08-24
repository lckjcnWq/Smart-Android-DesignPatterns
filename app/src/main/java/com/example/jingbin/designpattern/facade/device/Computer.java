package com.example.jingbin.designpattern.facade.device;

import android.util.Log;

import com.example.jingbin.designpattern.TagContants;

/**
 */

public class Computer {

    public void on() {
        Log.e(TagContants.TAG, "---打开电脑");
    }

    public void off() {
        Log.e(TagContants.TAG, "---关闭电脑");
    }
}
