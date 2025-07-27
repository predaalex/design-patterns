package com.example.controller;

import com.example.designPatterns.structural.adapter.SocketAdapter;
import com.example.designPatterns.structural.adapter.SocketObjectAdapterImpl;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/design-patterns/structural")
public class DesignPatternStructuralController {

    @Get("/adater")
    public String getAdapter() {
        SocketAdapter socketAdapter = new SocketObjectAdapterImpl();

        return socketAdapter.get3Volt().toString();
    }
}
