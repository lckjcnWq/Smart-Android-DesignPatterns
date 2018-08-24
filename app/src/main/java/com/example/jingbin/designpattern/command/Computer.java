package com.example.jingbin.designpattern.command;

import android.util.Log;

import com.example.jingbin.designpattern.TagContants;

/**
 * 电脑
 */

public class Computer {

    public void on() {
        Log.e(TagContants.TAG, "---打开电脑");
    }

    public void off() {
        Log.e(TagContants.TAG, "---关闭电脑");
    }

}
