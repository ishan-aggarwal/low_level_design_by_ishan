package com.ishan.lld.tictactoev2.factories;

import com.ishan.lld.tictactoev2.exceptions.GameWinningStrategyNotSupportedException;
import com.ishan.lld.tictactoev2.models.GameWinningStrategyName;

public class GameWinningStrategyNameEnumFactory {

    public static GameWinningStrategyName getGameWinningStrategyNameFromString(String name) {
        if (name.equalsIgnoreCase("row")) {
            return GameWinningStrategyName.ROW;
        } else if (name.equalsIgnoreCase("column")) {
            return GameWinningStrategyName.COLUMN;
        } else if (name.equalsIgnoreCase("diagonal")) {
            return GameWinningStrategyName.DIAGONAL;
        } else if (name.equalsIgnoreCase("corner")) {
            return GameWinningStrategyName.CORNER;
        }
        throw new GameWinningStrategyNotSupportedException(name);
    }
}
