package com.hcl.lld.assignment.toctactoe.exceptions;

public class InvalidPlayerQuantityException extends RuntimeException {
    private String message;

    public InvalidPlayerQuantityException() {

    }

    public InvalidPlayerQuantityException(String message) {
        super(message);
        this.message = message;
    }
}
