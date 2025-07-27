package com.example.designPatterns.structural.proxy;

import java.net.URISyntaxException;

public interface CommandExecutor {
    public void runCommand(String cmd) throws URISyntaxException;
}
