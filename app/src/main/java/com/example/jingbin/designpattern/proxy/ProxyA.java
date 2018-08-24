package com.example.jingbin.designpattern.proxy;

import java.lang.reflect.Method;

/**
 * Description: #TODO
 */
public class ProxyA extends ISubjectProxy{
    public ProxyA(Subject subject) {
        super(subject);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("operationB")){
            throw new UnsupportedOperationException("ProxyA can't invoke operationB");
        }else if (method.getName().equals("operationA")) {
            return method.invoke(subject, args);
        }
        return null;
    }
}
