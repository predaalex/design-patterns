package com.example.designPatterns.structural.adapter;

/**
 * 	Allows two incompatible interfaces to work together by wrapping one around the other.
 * 	It acts as a bridge between disparate systems.
 */
public interface SocketAdapter {

    public Volt get120Volt();

    public Volt get12Volt();

    public Volt get3Volt();
}
