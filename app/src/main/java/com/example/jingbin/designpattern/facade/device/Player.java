package com.example.jingbin.designpattern.facade.device;

import android.util.Log;

import com.example.jingbin.designpattern.TagContants;

/**
 * 播放器
 */

public class Player {

    public void on() {
        Log.e(TagContants.TAG, "---打开播放器");
    }

    public void off() {
        Log.e(TagContants.TAG, "---关闭播放器");
    }

    public void make3DListener() {
        Log.e(TagContants.TAG, "---将播放器音调设为环绕立体声 ");
    }
}
