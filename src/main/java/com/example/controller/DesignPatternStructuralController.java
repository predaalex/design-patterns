package com.example.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/design-patterns/structural")
public class DesignPatternStructuralController {

    @Get("/adater")
    public String getAdapter() {
        return "";
    }
}
