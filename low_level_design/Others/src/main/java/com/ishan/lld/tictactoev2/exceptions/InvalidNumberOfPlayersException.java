package com.ishan.lld.tictactoev2.exceptions;

public class InvalidNumberOfPlayersException extends RuntimeException {

    public InvalidNumberOfPlayersException(int numberOfPlayers) {
        System.out.println("Invalid Number Of Players [" + numberOfPlayers + "] provided as input.");
    }
}
