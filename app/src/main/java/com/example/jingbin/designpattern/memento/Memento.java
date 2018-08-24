package com.example.jingbin.designpattern.memento;

/**
 * Description: #TODO
 *
 */
public class Memento {
    private int mState = 0;

    public void setState(int state) {
        this.mState = state;
    }

    public int getState() {
        return mState;
    }
}
