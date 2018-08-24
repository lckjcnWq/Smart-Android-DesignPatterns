package com.example.jingbin.designpattern.chainofres;

import android.util.Log;

import com.example.jingbin.designpattern.TagContants;

public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(String condition) {
        if ("ConcreteHandler2".equals(condition)) {
            Log.e(TagContants.TAG,"ConcreteHandler2 handled");
            return;
        } else {
            successor.handleRequest(condition);
        }
    }
}
