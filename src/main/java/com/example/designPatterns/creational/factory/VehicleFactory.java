package com.example.designPatterns.creational.factory;

/**
 * 	Defines an interface for creating an object, but lets subclasses decide which class to instantiate.
 * 	It centralizes object creation while allowing flexibility for different product types.
 */
public class VehicleFactory {
    public static Vehicle getVehicle(String type) {
        return switch (type.toLowerCase()) {
            case "truck" -> new Truck();
            case "ship" -> new Ship();
            default ->
                    throw new IllegalArgumentException("Unknown vehicle type: " + type + "\n Please try truck/ship.");
        };
    }
}
