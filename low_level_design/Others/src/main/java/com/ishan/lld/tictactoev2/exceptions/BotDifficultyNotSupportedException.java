package com.ishan.lld.tictactoev2.exceptions;

public class BotDifficultyNotSupportedException extends RuntimeException {

    public BotDifficultyNotSupportedException(String name) {
        System.out.println("Invalid difficulty [" + name + "] provided as input.");
    }
}
