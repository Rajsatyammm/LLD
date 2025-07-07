package com.hcl.lld.assignment.snake_and_ladder.model;

import lombok.Getter;

import java.util.List;

@Getter
public abstract class Cell {
    private int index;
    private CellType cellType;
    private List<Piece> pieces;

    Cell(CellType cellType) {
        this.cellType = cellType;
    }

    public abstract int getNextCell();
}
