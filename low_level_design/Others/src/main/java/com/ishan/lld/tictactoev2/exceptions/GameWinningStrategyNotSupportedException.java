package com.ishan.lld.tictactoev2.exceptions;

public class GameWinningStrategyNotSupportedException extends RuntimeException {

    public GameWinningStrategyNotSupportedException(String name) {
        System.out.println("Invalid Game Winning Strategy [" + name + "] provided as input.");
    }
}
