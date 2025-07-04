package com.hcl.lld.assignment.toctactoe.model;

import com.hcl.lld.assignment.toctactoe.exceptions.DuplicateSymbolException;
import com.hcl.lld.assignment.toctactoe.exceptions.InvalidPlayerQuantityException;
import com.hcl.lld.assignment.toctactoe.startegy.winning.IWinningStrategy;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
public class Game {
    private List<Player> players = new ArrayList<>();
    private Board board;
    private List<IWinningStrategy> winningStrategies = new ArrayList<>();

    private Game() {

    }

    public void printBoard() {
        board.printBoard();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Game game;
        Set<Character> set = new HashSet<>();
        int boardSize;

        private Builder() {
            this.game = new Game();
        }

        public Builder addPlayer(Player player) {
            if(player == null)
                throw new IllegalArgumentException("player can not be null");
            game.players.add(player);
            return this;
        }

        public Builder addWinningStrategy(IWinningStrategy winningStrategy) {
            if(winningStrategy == null)
                throw new IllegalArgumentException("winningStrategy can not be null");
            game.winningStrategies.add(winningStrategy);
            return this;
        }

        public Builder setBoardSize(int boardSize) {
            if(boardSize <= 0)
                throw new IllegalArgumentException("rows can not be less than or equal to zero");
            this.boardSize = boardSize;
            return this;
        }

        public Game build() {
            if (game.players.size() < 2) throw new InvalidPlayerQuantityException("Player must be at least two");
            game.board = new Board(boardSize);
            for(var player : game.players) {
                if(set.contains(player.symbol.getCh()))
                    throw new DuplicateSymbolException();
                set.add(player.symbol.getCh());
            }
            return game;
        }
    }
}
