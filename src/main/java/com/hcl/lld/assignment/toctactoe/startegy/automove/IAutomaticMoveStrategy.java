package com.hcl.lld.assignment.toctactoe.startegy.automove;

import com.hcl.lld.assignment.toctactoe.model.Board;
import com.hcl.lld.assignment.toctactoe.model.Move;
import com.hcl.lld.assignment.toctactoe.model.Player;

public interface IAutomaticMoveStrategy {
    Move makeMove(Board board, Player player);
}
