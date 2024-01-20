package com.ishan;

import com.ishan.model.GameResult;

public abstract class Game {
    public final void play() {
        initialize();
        GameResult result = start();
        end(result);
    }

    public abstract void initialize();

    public abstract GameResult start();

    private void end(GameResult result) {
        if (result.getResultType() == GameResult.ResultType.TIE) {
            System.out.println("Game is a tie");
        } else {
            System.out.println("Game winner is: " + result.getWinner().name + " with piece: " + result.getWinner().playingPiece.pieceType);
        }
    }
}
