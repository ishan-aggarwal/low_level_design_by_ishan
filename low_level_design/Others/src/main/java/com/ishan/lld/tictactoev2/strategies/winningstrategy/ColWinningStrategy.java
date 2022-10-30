package com.ishan.lld.tictactoev2.strategies.winningstrategy;


import com.ishan.lld.tictactoev2.models.Board;
import com.ishan.lld.tictactoev2.models.Move;

public class ColWinningStrategy implements GameWinningStrategy {
    @Override
    public boolean checkVictory(Board board, Move lastMove) {
        //return checkVictoryInON(board, lastMove);
        return checkVictoryInO1(board, lastMove);
    }

    public boolean checkVictoryInON(Board board, Move lastMove) {
        for (int row = 0; row < board.getDimension(); ++row) {
            //should work for null i.e. empty cell as well
            if (board.getCell(row, lastMove.getColumn()).getPlayer() != lastMove.getPlayer()) {
                return false;
            }
        }
        return true;
    }

    public boolean checkVictoryInO1(Board board, Move lastMove) {
        return board.getPlayerToColCountMap().get(lastMove.getPlayer()).get(lastMove.getColumn()) == board.getDimension();
    }
}