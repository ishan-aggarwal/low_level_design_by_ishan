package com.ishan.lld.tictactoev2.models;

import java.util.Scanner;

public class Player {
    private Symbol symbol;
    private PlayerType playerType;
    private String name;

    public String getName() {
        return name;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Move makeMove(Board board) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What row (starting from 0)");
        Integer row = scanner.nextInt();

        System.out.println("What col (starting from 0)");
        Integer col = scanner.nextInt();

        Move move = new Move(row, col, this);

        return move;
    }
}
