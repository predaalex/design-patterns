package com.example.designPatterns.creational.factory;

public class Ship implements Vehicle {
    @Override
    public String deliver() {
        return "Delivering by water in a ship";
    }
}
