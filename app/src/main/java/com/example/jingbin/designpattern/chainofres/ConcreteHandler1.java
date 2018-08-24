package com.example.jingbin.designpattern.chainofres;

import android.util.Log;

import com.example.jingbin.designpattern.TagContants;

public class ConcreteHandler1 extends Handler {
    @Override
    public void handleRequest(String condition) {
        if ("ConcreteHandler1".equals(condition)){
            Log.e(TagContants.TAG,"ConcreteHandler1 handled");
            return;
        }else {
            successor.handleRequest(condition);
        }
    }
}
