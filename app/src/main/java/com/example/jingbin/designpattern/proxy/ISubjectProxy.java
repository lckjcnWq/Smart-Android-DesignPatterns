package com.example.jingbin.designpattern.proxy;

import java.lang.reflect.InvocationHandler;

/**
 * Description: #TODO
 */
public abstract class ISubjectProxy implements InvocationHandler {

    protected Subject subject;

    public ISubjectProxy(Subject subject) {
        this.subject = subject;
    }

}
