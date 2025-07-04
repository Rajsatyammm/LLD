package com.hcl.lld.assignment.toctactoe.model;

import com.hcl.lld.assignment.toctactoe.startegy.automove.IAutomaticMoveStrategy;

public class Bot extends Player {
    private IAutomaticMoveStrategy automaticMoveStrategy;

    private Bot() {

    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Bot bot;

        private Builder() {
            this.bot = new Bot();
        }

        public Builder setAutomaticMoveStrategy(IAutomaticMoveStrategy automaticMoveStrategy) {
            this.bot.automaticMoveStrategy = automaticMoveStrategy;
            return this;
        }

        public Builder setSymbol(char ch) {
            this.bot.symbol = new Symbol(ch);
            return this;
        }

        public Bot build() {
            return this.bot;
        }
    }
}
