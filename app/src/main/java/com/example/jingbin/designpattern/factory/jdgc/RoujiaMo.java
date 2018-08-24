package com.example.jingbin.designpattern.factory.jdgc;

import android.util.Log;

import com.example.jingbin.designpattern.TagContants;

/**
 */

public abstract class RoujiaMo {

    protected String name;

    /**
     * 准备工作
     */
    public void prepare() {
        Log.e(TagContants.TAG, name + ": 揉面-剁肉-完成准备工作");
    }

    /**
     * 秘制设备--烘烤2分钟
     */
    public void fire() {
        Log.e(TagContants.TAG, name + ": 肉夹馍-专用设备-烘烤");
    }

    /**
     * 使用你们的专用袋-包装
     */
    public void pack() {
        Log.e(TagContants.TAG, name + ": 肉夹馍-专用袋-包装---end");
    }
}
