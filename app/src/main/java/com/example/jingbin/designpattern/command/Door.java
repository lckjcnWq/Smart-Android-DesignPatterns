package com.example.jingbin.designpattern.command;

import android.util.Log;

import com.example.jingbin.designpattern.TagContants;

/**
 *
 * 门
 */

public class Door {

    public void open() {
        Log.e(TagContants.TAG, "---打开门");
    }

    public void close() {
        Log.e(TagContants.TAG, "---关闭门");
    }
}
