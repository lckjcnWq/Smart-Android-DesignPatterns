package com.example.jingbin.designpattern.chainofres;

public abstract class Handler {
    protected Handler successor;
    public abstract void handleRequest(String condition);
}