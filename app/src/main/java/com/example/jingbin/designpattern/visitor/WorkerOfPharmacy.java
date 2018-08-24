package com.example.jingbin.designpattern.visitor;

import android.util.Log;

import com.example.jingbin.designpattern.TagContants;

public class WorkerOfPharmacy extends Visitor{

    public void visitor(MedicineA a) {
        Log.e(TagContants.TAG,"药房工作者：" + name + "拿药 ：" + a.getName());
    }

    public void visitor(MedicineB b) {
        Log.e(TagContants.TAG,"药房工作者：" + name + "拿药 ：" + b.getName());
    }

}