package com.hcl.lld.assignment.snake_and_ladder.commands;

public interface ICommand {
    boolean matches(String input);
    void execute(String command);
}