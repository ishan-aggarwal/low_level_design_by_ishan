package com.ishan.tictactoe.exceptions;

public class MultipleBotsException extends Exception {

    public MultipleBotsException() {
        super("A game cannot have more than one bot players.");
    }
}
