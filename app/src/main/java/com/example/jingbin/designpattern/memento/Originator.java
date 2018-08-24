package com.example.jingbin.designpattern.memento;

/**
 * Description: #TODO
 *
 */
public class Originator {
    private int state = 0;

    public void setState(int state) {
        this.state = state;
    }

    public void print() {
        System.out.print("state = " + state + "\n");
    }

    public void restore(Memento memento) {
        setState(memento.getState());
    }

    public Memento createMemoto() {
        Memento memento = new Memento();
        memento.setState(state);
        return memento;
    }
}
