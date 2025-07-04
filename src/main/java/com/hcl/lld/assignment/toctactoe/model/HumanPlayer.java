package com.hcl.lld.assignment.toctactoe.model;

import lombok.Getter;

@Getter
public class HumanPlayer extends Player {
    private User user;

    private HumanPlayer() {

    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private HumanPlayer humanPlayer;

        private Builder() {
            this.humanPlayer = new HumanPlayer();
        }

        public Builder setUser(User user) {
            this.humanPlayer.user = user;
            return this;
        }

        public Builder setSymbol(char ch) {
            this.humanPlayer.symbol = new Symbol(ch);
            return this;
        }

        public HumanPlayer build() {
            return this.humanPlayer;
        }
    }
}
