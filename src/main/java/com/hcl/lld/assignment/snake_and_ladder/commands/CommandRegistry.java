package com.hcl.lld.assignment.snake_and_ladder.commands;

import com.hcl.lld.assignment.snake_and_ladder.exceptions.IllegalCommandException;

import java.util.ArrayList;
import java.util.List;

public class CommandRegistry {
    private List<ICommand> commands = new ArrayList<>();

    public void registerCommand(ICommand command) {
        commands.add(command);
    }

    public void execute(String command) {
        for(ICommand cmd : commands) {
            if(cmd.matches(command))
                cmd.execute(command);
        }
        throw new IllegalCommandException();
    }
}
