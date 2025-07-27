package com.example.controller;

import com.example.designPatterns.creational.Prototype.Employees;
import com.example.designPatterns.creational.builder.Computer;
import com.example.designPatterns.creational.factory.VehicleFactory;
import com.example.designPatterns.creational.singleton.Singleton;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@Controller("/design-patterns")
public class DesignPatternController {
    private static final Logger log = LoggerFactory.getLogger(DesignPatternController.class);

    @Get("/singleton")
    public String getSingleton() {
        log.info("getSingleton");
        return "This is a singleton instance: " + Singleton.getInstance();
    }

    @Get("/factory/{type}")
    public String getFactory(@PathVariable String type) {
        log.info("getFactory");
        return VehicleFactory.getVehicle(type).deliver();
    }

    @Get("/builder")
    public String getBuilder() {
        log.info("getBuilder");
        return new Computer.ComputerBuilder("5GB", "Gigabyte")
                .wifi(true)
                .bluetooth(false)
                .build()
                .toString();
    }

    @Get("/prototype")
    public String getPrototype() throws CloneNotSupportedException {
        log.info("getPrototype");
        Employees emps = new Employees();
        emps.loadData();

        Employees empsNew = (Employees) emps.clone();
        List<String> list = empsNew.getEmpList();
        list.add("John");

        return(list.toString());
    }
}
