package com.example.jingbin.designpattern.interator;

/**
 * Description: #TODO
 *
 */
public interface Aggregation<T> {

    void add(T obj);

    void remove(T obj);

    Iterator<T> iterator();
}
