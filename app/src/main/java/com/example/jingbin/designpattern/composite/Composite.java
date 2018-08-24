package com.example.jingbin.designpattern.composite;

import android.util.Log;

import com.example.jingbin.designpattern.TagContants;

import java.util.ArrayList;

/**
 * Description: #TODO
 *
 */
public class Composite implements Component{

    private ArrayList<Component> componentList = new ArrayList<>();

    @Override
    public void operation() {
        Log.e(TagContants.TAG, "this is composite " + this + " -------start");
        for (Component component : componentList) {
            component.operation();
        }
        Log.e(TagContants.TAG, "this is composite " + this + " -------end");
    }

    @Override
    public void add(Component child) {
        componentList.add(child);
    }

    @Override
    public void remove(Component child) {
        componentList.remove(child);
    }

    @Override
    public Component getChild(int position) {
        return componentList.get(position);
    }
}
