package com.example.jingbin.designpattern.composite;

/**
 * Description: #TODO
 *
 */
public interface Component {
    void operation();

    void add(Component child);

    void remove(Component child);

    Component getChild(int position);
}
