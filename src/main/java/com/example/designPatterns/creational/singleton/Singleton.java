package com.example.designPatterns.creational.singleton;

/**
 * Singleton is a design pattern that lets you ensure that a class has only one instance while providing a global access point to this instance
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
