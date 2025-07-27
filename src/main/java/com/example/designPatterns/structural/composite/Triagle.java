package com.example.designPatterns.structural.composite;

public class Triagle implements Shape {
    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Triangle with color: " + fillColor);
    }
}
