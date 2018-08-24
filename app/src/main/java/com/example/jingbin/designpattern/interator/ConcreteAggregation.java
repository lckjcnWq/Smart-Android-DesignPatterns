package com.example.jingbin.designpattern.interator;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: #TODO
 *
 */
public class ConcreteAggregation<T> implements Aggregation<T>{
    private List<T> list = new ArrayList<>();

    @Override
    public void add(T obj) {
        list.add(obj);
    }

    @Override
    public void remove(T obj) {
        list.remove(obj);
    }

    @Override
    public Iterator<T> iterator() {
        return new ConcreteIterator<>(list);
    }
}
