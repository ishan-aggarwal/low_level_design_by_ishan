package com.ishan.lld.tictactoev2.strategies.winningstrategy;

import com.ishan.lld.tictactoev2.models.Board;
import com.ishan.lld.tictactoev2.models.Move;

public class NotGonnaWinGameWinningStrategy implements GameWinningStrategy {

    @Override
    public boolean checkVictory(Board board, Move lastMove) {
        return false;
    }
}
