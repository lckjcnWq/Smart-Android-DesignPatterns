package com.example.jingbin.designpattern.app;

import android.app.Application;

import com.example.jingbin.designpattern.singleton.lanhan.SingletonLanHan;

/**
 */

public class PatternApplication extends Application {

    private static PatternApplication patternApplication;

    public static PatternApplication getInstance() {
        if (patternApplication == null) {
            synchronized (PatternApplication.class) {
                if (patternApplication == null) {
                    patternApplication = new PatternApplication();
                }
            }
        }
        return patternApplication;
    }

    @SuppressWarnings({"unused"})
    @Override
    public void onCreate() {
        super.onCreate();
        patternApplication = this;
    }
}
