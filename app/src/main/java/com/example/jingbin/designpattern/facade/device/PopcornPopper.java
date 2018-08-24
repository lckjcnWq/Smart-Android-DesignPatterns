package com.example.jingbin.designpattern.facade.device;

import android.util.Log;

import com.example.jingbin.designpattern.TagContants;

/**
 * 爆米花机
 */

public class PopcornPopper {

    public void on() {
        Log.e(TagContants.TAG, "---打开爆米花机");
    }

    public void off() {
        Log.e(TagContants.TAG, "---关闭爆米花机");
    }

    public void makePopcorn() {
        Log.e(TagContants.TAG, "---制作爆米花");
    }
}
