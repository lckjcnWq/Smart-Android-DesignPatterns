package com.example.jingbin.designpattern.composite;

import android.util.Log;

import com.example.jingbin.designpattern.TagContants;

/**
 * Description: #TODO
 *
 */
public class Leaf implements Component {
    @Override
    public void operation() {
        Log.e(TagContants.TAG, "this if leaf " + this);
    }

    @Override
    public void add(Component child) {
        throw new UnsupportedOperationException("leaf can't add child");
    }

    @Override
    public void remove(Component child) {
        throw new UnsupportedOperationException("leaf can't remove child");
    }

    @Override
    public Component getChild(int position) {
        throw new UnsupportedOperationException("leaf doesn't have any child");
    }
}
