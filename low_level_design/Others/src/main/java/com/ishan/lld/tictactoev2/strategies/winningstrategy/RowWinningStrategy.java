package com.ishan.lld.tictactoev2.strategies.winningstrategy;

import com.ishan.lld.tictactoev2.models.Board;
import com.ishan.lld.tictactoev2.models.Move;

public class RowWinningStrategy implements GameWinningStrategy {

    @Override
    public boolean checkVictory(Board board, Move lastMove) {
        //return checkVictoryInON(board, lastMove);
        return checkVictoryInO1(board, lastMove);
    }

    public boolean checkVictoryInON(Board board, Move lastMove) {
        for (int col = 0; col < board.getDimension(); ++col) {
            //should work for null i.e. empty cell as well
            if (board.getCell(lastMove.getRow(), col).getPlayer() != lastMove.getPlayer()) {
                return false;
            }
        }
        return true;
    }


    public boolean checkVictoryInO1(Board board, Move lastMove) {
        return board.getPlayerToRowCountMap().get(lastMove.getPlayer()).get(lastMove.getRow()) == board.getDimension();
    }
}