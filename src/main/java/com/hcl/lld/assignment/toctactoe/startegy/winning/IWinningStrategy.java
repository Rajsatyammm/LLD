package com.hcl.lld.assignment.toctactoe.startegy.winning;

import com.hcl.lld.assignment.toctactoe.model.Board;
import com.hcl.lld.assignment.toctactoe.model.Player;

import java.util.List;

public interface IWinningStrategy {
    Player checkWinner(Board board, List<Player> players);
}