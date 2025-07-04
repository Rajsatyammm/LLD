package com.hcl.lld.assignment.toctactoe.controllers;

import com.hcl.lld.assignment.toctactoe.model.Board;
import com.hcl.lld.assignment.toctactoe.model.Game;
import com.hcl.lld.assignment.toctactoe.model.Move;

public class GameController {
    public static void run(Game game) {
        game.getBoard().printBoard();
    }

    static Move humanTurn(Board board) {
        return null;
    }

    static Move botTurn() {
        return null;
    }
}
