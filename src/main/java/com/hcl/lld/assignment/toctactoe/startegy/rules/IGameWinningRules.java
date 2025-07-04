package com.hcl.lld.assignment.toctactoe.startegy.rules;

import com.hcl.lld.assignment.toctactoe.model.Board;
import com.hcl.lld.assignment.toctactoe.model.Player;

import java.util.List;

public interface IGameWinningRules {
    Player gameRules(Board board, List<Player> players);
}
