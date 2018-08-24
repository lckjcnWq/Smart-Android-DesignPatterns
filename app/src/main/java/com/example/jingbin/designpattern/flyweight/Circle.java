package com.example.jingbin.designpattern.flyweight;

import android.util.Log;

import com.example.jingbin.designpattern.TagContants;

/**
 * Description: #TODO
 *
 */
public class Circle implements Shape{
    String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        Log.e(TagContants.TAG, "画了一个" + color +"的圆形");
    }
}
