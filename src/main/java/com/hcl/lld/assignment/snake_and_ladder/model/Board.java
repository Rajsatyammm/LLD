package com.hcl.lld.assignment.snake_and_ladder.model;

import lombok.Setter;

import java.util.List;

@Setter
public class Board {
    private List<Cell> cells;
    private Integer size;
    private List<Snake> snakes;
    private List<Ladder> ladders;
//    private Map<CellType, List<Cell>> specialCells;
}
