package com.example.jingbin.designpattern.proxy;

/**
 * Description: #TODO
 *
 */
public class RealSubject implements Subject{
    @Override
    public String operationA() {
        return "this is operationA";
    }

    @Override
    public String operationB() {
        return "this is operationB";
    }
}
