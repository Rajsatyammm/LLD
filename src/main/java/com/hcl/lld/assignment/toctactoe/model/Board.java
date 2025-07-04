package com.hcl.lld.assignment.toctactoe.model;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Board {
    private List<List<Cell>> board = new ArrayList<>();

    Board(int boardSize) {
        board = new ArrayList<>(boardSize);
        for (int i = 0; i < boardSize; i++) {
            board.add(i, new ArrayList<>(boardSize));
        }
    }

    public void printBoard() {
        for (int i = 0; i < board.size(); i++) {
            var b = board.get(i);
            for (int j = 0; j < b.size(); i++) {
                System.out.print("M ");
            }
            System.out.println();
        }
    }
}