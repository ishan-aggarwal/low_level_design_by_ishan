package com.ishan.model;

public class GameResult {
    public enum ResultType {
        WIN, TIE
    }

    private final ResultType resultType;
    private final Player winner;

    // Constructors, getters, and setters
    public GameResult(ResultType resultType, Player winner) {
        this.resultType = resultType;
        this.winner = winner;
    }

    public ResultType getResultType() {
        return resultType;
    }

    public Player getWinner() {
        return winner;
    }
}
