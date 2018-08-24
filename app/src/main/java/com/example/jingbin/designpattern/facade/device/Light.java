package com.example.jingbin.designpattern.facade.device;

import android.util.Log;

import com.example.jingbin.designpattern.TagContants;

/**
 * 灯光
 */

public class Light {

    public void down() {
        Log.e(TagContants.TAG, "---将灯光调暗");
    }

    public void up() {
        Log.e(TagContants.TAG, "---将灯光调亮");
    }
}
