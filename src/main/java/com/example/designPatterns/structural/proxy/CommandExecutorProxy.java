package com.example.designPatterns.structural.proxy;

import io.micronaut.http.server.exceptions.NotAllowedException;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashSet;
import java.util.List;

public class CommandExecutorProxy implements CommandExecutor {

    private boolean isAdmin;
    private CommandExecutor commandExecutor;

    public CommandExecutorProxy(String user) {
        if(user.equals("admin")) {
            isAdmin = true;
        }
        commandExecutor = new CommandExecutorImpl();
    }

    @Override
    public void runCommand(String cmd) throws URISyntaxException {
        if(isAdmin) {
            commandExecutor.runCommand(cmd);
        } else {
            if(cmd.trim().startsWith("pwd")) {
                commandExecutor.runCommand(cmd);
            } else {
                throw new NotAllowedException("GET", new URI("/design-patterns/structural/proxy/"), new HashSet<>(List.of(new String[]{"pwd"})));
            }
        }
    }
}
