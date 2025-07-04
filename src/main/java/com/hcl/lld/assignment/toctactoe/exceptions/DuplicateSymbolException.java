package com.hcl.lld.assignment.toctactoe.exceptions;

public class DuplicateSymbolException extends RuntimeException {
    private String message;

    public DuplicateSymbolException() {

    }

    public DuplicateSymbolException(String message) {
        super(message);
        this.message = message;
    }
}
