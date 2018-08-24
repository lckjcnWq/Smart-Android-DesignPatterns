package com.example.jingbin.designpattern.command;

import android.util.Log;

import com.example.jingbin.designpattern.TagContants;

/**
 * 电灯
 */

public class Light {

    public void on() {
        Log.e(TagContants.TAG, "---打开灯");
    }

    public void off() {
        Log.e(TagContants.TAG, "---关闭灯");
    }


}
