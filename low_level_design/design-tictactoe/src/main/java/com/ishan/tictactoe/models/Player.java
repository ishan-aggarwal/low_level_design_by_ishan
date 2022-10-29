package com.ishan.tictactoe.models;

public abstract class Player {
    private Symbol symbol;
    private PlayerType playerType;

    private String name;
    Player(PlayerType type, Symbol symbol) {
        this.playerType = type;
        this.symbol = symbol;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public abstract Move makeMove(Board board);
}

// StartGame
// NumberOfPlayers
// Human email name phone_number symbol
// Bot strategyType
// DimensionOfBoard (n)
// WinningStrategies
// This will lead to creation of Game object
// => Builder to be used for game
// Game(int n, List<Player>, Strategy, int dimension,)