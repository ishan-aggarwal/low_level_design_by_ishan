package com.ishan.tictactoe.models;

public class Cell {
    private int row;
    private int column;
    private Symbol symbol;

    public Cell(int row, int col) {
        this.row = row;
        this.column = col;
    }

    public boolean isEmpty() {
        return (symbol == null);
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public void clearCell() {
        this.symbol = null;
    }
}