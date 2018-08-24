/*
 * Copyright (C) 2016 Facishare Technology Co., Ltd. All Rights Reserved.
 */
package com.example.jingbin.designpattern.mediator;

import android.util.Log;

import com.example.jingbin.designpattern.TagContants;

/**
 * Description:
 *
 */
public class ConcreteColleagueA extends Colleague{

    public void notifyColleagueB() {
        mediator.notifyColleagueB();
    }

    @Override
    public void operation() {
        Log.e(TagContants.TAG,"this is ConcreteColleagueA's operation");
    }
}
