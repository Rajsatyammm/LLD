package com.hcl.lld.assignment.toctactoe.startegy.rules;

import com.hcl.lld.assignment.toctactoe.model.Board;
import com.hcl.lld.assignment.toctactoe.model.Cell;
import com.hcl.lld.assignment.toctactoe.model.Player;
import com.hcl.lld.assignment.toctactoe.model.Symbol;

import java.util.Arrays;
import java.util.List;

public class TicTacToeWinningRules implements IGameWinningRules {
    @Override
    public Player gameRules(Board board, List<Player> players) {
        Player player1 = players.get(0);
        Player player2 = players.get(1);

        boolean result = checkBoard(board, player1.getSymbol());
        if (result)
            return player1;
        result = checkBoard(board, player2.getSymbol());
        if (result)
            return player2;
        return null;
    }

    private Boolean checkBoard(Board board, Symbol symbol) {
        boolean result = checkXAxis(board, symbol);
        if (result)
            return result;
        result = checkYAxis(board, symbol);
        if (result)
            return result;
        result = checkDiagonally(board, symbol);
        return result;
    }

    private Boolean checkXAxis(Board board, Symbol symbol) {
        List<List<Cell>> grid = board.getBoard();
        int size = grid.size();
        for (int i = 0; i < size; i++) {
            List<Cell> list = board.getBoard().get(i);
            for (int j = 0; j < list.size(); j++) {
                if (!checkSameSymbol(list.get(0), symbol))
                    return false;
            }
        }
        return true;
    }

    private Boolean checkYAxis(Board board, Symbol symbol) {
        List<List<Cell>> grid = board.getBoard();
        int size = grid.size();
        boolean[] result = new boolean[size];
        Arrays.fill(result, true);
        for (int i = 0; i < size; i++) {
            List<Cell> list = grid.get(i);
            for (int j = 0; j < size; j++) {
                if (!checkSameSymbol(list.get(j), symbol))
                    result[j] = false;
            }
        }
        for (boolean res : result) {
            if (res) return true;
        }
        return false;
    }

    private Boolean checkDiagonally(Board board, Symbol symbol) {
        List<List<Cell>> grid = board.getBoard();
        int size = grid.size();
        boolean result = true;
        // first diagonal
        for (int i = 0; i < size; i++) {
            if (!checkSameSymbol(grid.get(i).get(i), symbol))
                result = false;
        }
        if (result) return result;
        // second diagonal
        for (int i = 0; i < size; i++) {
            if (!checkSameSymbol(grid.get(i).get(size - i - 1), symbol))
                result = false;
        }
        return result;
    }

    Boolean checkSameSymbol(Cell cell, Symbol symbol) {
        return cell.getSymbol().getCh() == symbol.getCh();
    }
}
