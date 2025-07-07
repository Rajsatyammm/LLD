package com.hcl.lld.assignment.snake_and_ladder.commands;

public class StartGameCommand implements ICommand {
    @Override
    public boolean matches(String input) {
        String[] splitArray = input.split(" ");
        return splitArray[0].equalsIgnoreCase("StartGame");
    }

    @Override
    public void execute(String command) {
        System.out.println("Executing StartGameCommand command");
    }
}
