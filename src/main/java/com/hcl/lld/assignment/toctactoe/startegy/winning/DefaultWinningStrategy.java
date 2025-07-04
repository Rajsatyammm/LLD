package com.hcl.lld.assignment.toctactoe.startegy.winning;

import com.hcl.lld.assignment.toctactoe.model.Board;
import com.hcl.lld.assignment.toctactoe.model.Player;
import com.hcl.lld.assignment.toctactoe.startegy.rules.IGameWinningRules;

import java.util.List;

public class DefaultWinningStrategy implements IWinningStrategy {
    private IGameWinningRules winningRules;

    public DefaultWinningStrategy(IGameWinningRules winningRules) {
        this.winningRules = winningRules;
    }

    @Override
    public Player checkWinner(Board board, List<Player> players) {
        return winningRules.gameRules(board, players);
    }


}
