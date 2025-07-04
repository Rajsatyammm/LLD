package com.hcl.lld.assignment.toctactoe;

import com.hcl.lld.assignment.toctactoe.controllers.GameController;
import com.hcl.lld.assignment.toctactoe.factories.PlayerFactory;
import com.hcl.lld.assignment.toctactoe.model.Game;
import com.hcl.lld.assignment.toctactoe.model.User;
import com.hcl.lld.assignment.toctactoe.startegy.automove.LevelEasyMoveStrategy;
import com.hcl.lld.assignment.toctactoe.startegy.rules.TicTacToeWinningRules;
import com.hcl.lld.assignment.toctactoe.startegy.winning.DefaultWinningStrategy;

public class Client {
    public static void main(String[] args) {
        Game game = Game.builder()
            .addPlayer(PlayerFactory.createBot()
                .setAutomaticMoveStrategy(new LevelEasyMoveStrategy())
                .setSymbol('O')
                .build()
            )
            .addPlayer(PlayerFactory.createHumanPlayer()
                .setUser(User.builder()
                    .withName("Raj")
                    .withEmail("raj@gmail.com")
                    .build()
                )
                .setSymbol('X')
                .build()
            )
            .addWinningStrategy(new DefaultWinningStrategy(new TicTacToeWinningRules()))
            .setBoardSize(3)
            .build();

        GameController.run(game);
    }
}
