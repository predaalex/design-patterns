package com.example.designPatterns.structural.proxy;

public class CommandExecutorImpl implements CommandExecutor {
    @Override
    public void runCommand(String cmd) {
        System.out.println("Command executed: '" + cmd + "'");
    }
}
