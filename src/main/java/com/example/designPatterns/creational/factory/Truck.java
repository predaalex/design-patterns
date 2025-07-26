package com.example.designPatterns.creational.factory;

public class Truck implements Vehicle {
    @Override
    public String deliver() {
        return "Delivering by land in a Truck";
    }
}
