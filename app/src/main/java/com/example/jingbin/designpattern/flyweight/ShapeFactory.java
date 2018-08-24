package com.example.jingbin.designpattern.flyweight;

import java.util.HashMap;

/**
 * Description: #TODO
 *
 */
public class ShapeFactory {
    private HashMap<String, Shape> shapes = new HashMap<>();

    public Shape getShape(String color) {
        Shape shape = shapes.get(color);
        if (shape == null) {
            shape = new Circle(color);
            shapes.put(color, shape);
        }
        return shape;
    }

    public int getSize() {
        return shapes.size();
    }
}
