package com.hcl.lld.assignment.toctactoe.startegy.automove;

import com.hcl.lld.assignment.toctactoe.model.Board;
import com.hcl.lld.assignment.toctactoe.model.Cell;
import com.hcl.lld.assignment.toctactoe.model.Move;
import com.hcl.lld.assignment.toctactoe.model.Player;
import com.hcl.lld.assignment.toctactoe.util.RandomNumberGenerator;

import java.util.List;

public class LevelEasyMoveStrategy implements IAutomaticMoveStrategy {
    @Override
    public Move makeMove(Board board, Player player) {
        Move move = new Move();
        List<List<Cell>> grid = board.getBoard();
        int size = grid.size();
        boolean isDecided = false;
        int randomX = 0, randomY = 0;
        while(!isDecided) {
            randomX = RandomNumberGenerator.generateRandomNumber(0, size - 1);
            randomY = RandomNumberGenerator.generateRandomNumber(0, size - 1);

            if(grid.get(randomX).get(randomY).getSymbol().getCh() == '.') {
                move.setX(randomX);
                move.setY(randomY);
                isDecided = true;
            }
        }
        return move;
    }
}
