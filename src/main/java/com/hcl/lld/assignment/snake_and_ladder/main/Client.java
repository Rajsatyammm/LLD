package com.hcl.lld.assignment.snake_and_ladder.main;

import com.hcl.lld.assignment.snake_and_ladder.commands.CommandRegistry;
import com.hcl.lld.assignment.snake_and_ladder.commands.RegisterUserCommand;
import com.hcl.lld.assignment.snake_and_ladder.commands.StartGameCommand;
import com.hcl.lld.assignment.snake_and_ladder.exceptions.IllegalCommandException;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        CommandRegistry registry = new CommandRegistry();
        registry.registerCommand(new RegisterUserCommand());
        registry.registerCommand(new StartGameCommand());

        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        do {
            System.out.println("Menu");
            System.out.print("> ");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("EXIT"))
                loop = false;
            else {
                try {
                    registry.execute(input);
                } catch (IllegalCommandException ex) {
                    System.out.println("Invalid Command ");
                }
            }
        } while (loop);
    }
}
