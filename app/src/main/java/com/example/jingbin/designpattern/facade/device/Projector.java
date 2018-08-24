package com.example.jingbin.designpattern.facade.device;

import android.util.Log;

import com.example.jingbin.designpattern.TagContants;

/**
 * 投影仪
 */

public class Projector {

    public void on() {
        Log.e(TagContants.TAG, "---打开投影仪");
    }

    public void off() {
        Log.e(TagContants.TAG, "---关闭投影仪");
    }

    public void close() {
        Log.e(TagContants.TAG, "---收起投影仪投影区");
    }

    public void open() {
        Log.e(TagContants.TAG, "---放下投影仪投影区");
    }
}
