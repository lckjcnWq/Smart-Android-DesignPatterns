package com.example.jingbin.designpattern.memento;

/**
 * Description: #TODO
 *
 */
public class Caretaker {
    private Memento memento;

    public Memento restoreMemento() {
        return memento;
    }

    public void storeMemento(Memento memento) {
        this.memento = memento;
    }
}
