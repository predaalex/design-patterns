package com.example.designPatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;


/**
 * Composes objects into tree structures to represent part-whole hierarchies.
 * Clients can treat individual objects and compositions of objects uniformly, simplifying client code.
 */
public class Drawing implements Shape {
    private List<Shape> shapes = new ArrayList<>();

    @Override
    public void draw(String fillColor) {
        for(Shape shape : shapes) {
            shape.draw(fillColor);
        }
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void removeShape(Shape shape) {
        shapes.remove(shape);
    }

    public void clear() {
        System.out.println("Clearing all shapes from drawing");

        this.shapes.clear();
    }
}
