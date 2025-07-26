package com.example.designPatterns.creational.factory;

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
