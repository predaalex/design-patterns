package com.example.controller;

import com.example.designPatterns.creational.singleton.Singleton;
import io.micronaut.http.annotation.Get;

@io.micronaut.http.annotation.Controller("/design-patterns")
public class DesignPatternController {

    @Get("/singleton")
    public String getSingleton() {
        return "This is a singleton instance: " + Singleton.getInstance();
    }
}
