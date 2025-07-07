package com.hcl.lld.assignment.toctactoe.model;

//@Getter
public class Symbol {
    private char ch = '.';

    public Symbol(char symbol) {
        this.ch = symbol;
    }

    public char getCh() {
        return ch;
    }

    public String toString() {
        return ch + "";
    }
}