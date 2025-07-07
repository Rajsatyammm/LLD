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
            board.add(new ArrayList<>());
            for (int j = 0; j < boardSize; j++) {
                board.get(i).add(new Cell());
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < board.size(); i++) {
            var b = board.get(i);
            for (int j = 0; j < b.size(); j++) {
                System.out.print(b.get(j) + "  ");
            }
            System.out.println();
        }
    }
}