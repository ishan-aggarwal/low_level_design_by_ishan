package com.ishan.lld.tictactoev2.models;

public class Cell {
    private int row;
    private int column;
    private Player player;

    public Cell(int row, int column) {
        this.row = row;
        this.column = column;
    }


    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
