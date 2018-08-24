package com.example.jingbin.designpattern.visitor;

import android.util.Log;

import com.example.jingbin.designpattern.TagContants;

public class Charger extends Visitor{

    public void visitor(MedicineA a) {
        Log.e(TagContants.TAG,"划价员：" + name +"给药" + a.getName() +"划价:" + a.getPrice());
    }

    public void visitor(MedicineB b) {
        Log.e(TagContants.TAG,"划价员：" + name +"给药" + b.getName() +"划价:" + b.getPrice());
    }

}