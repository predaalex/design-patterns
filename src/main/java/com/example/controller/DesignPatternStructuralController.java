package com.example.controller;

import com.example.designPatterns.structural.adapter.SocketAdapter;
import com.example.designPatterns.structural.adapter.SocketObjectAdapterImpl;
import com.example.designPatterns.structural.composite.Circle;
import com.example.designPatterns.structural.composite.Drawing;
import com.example.designPatterns.structural.composite.Shape;
import com.example.designPatterns.structural.composite.Triagle;
import com.example.designPatterns.structural.proxy.CommandExecutor;
import com.example.designPatterns.structural.proxy.CommandExecutorProxy;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;

import java.net.URISyntaxException;

@Controller("/design-patterns/structural")
public class DesignPatternStructuralController {

    @Get("/adater")
    public String getAdapter() {
        SocketAdapter socketAdapter = new SocketObjectAdapterImpl();

        return socketAdapter.get3Volt().toString();
    }

    @Get("/composite")
    public void getComposite() {
        Shape tri = new Triagle();
        Shape tri2 = new Triagle();
        Shape cir = new Circle();

        Drawing drawing = new Drawing();

        drawing.addShape(tri);
        drawing.addShape(tri2);
        drawing.addShape(cir);

        drawing.draw("Red");

        drawing.clear();

        drawing.addShape(tri);
        drawing.addShape(cir);
        drawing.draw("Blue");
    }

    @Get("/proxy/{user}/{cmd}")
    public void getProxy(@PathVariable String user, @PathVariable String cmd) throws URISyntaxException {
        CommandExecutor commandExecutor = new CommandExecutorProxy(user);
        commandExecutor.runCommand(cmd);
    }
}
