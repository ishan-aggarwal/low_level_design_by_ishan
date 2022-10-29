package com.ishan.tictactoe.models;

import com.ishan.tictactoe.exceptions.EmptyMovesUndoOperationException;
import com.ishan.tictactoe.exceptions.MultipleBotsException;
import com.ishan.tictactoe.strategies.gamewinningstrategies.GameWinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> players;
    private Board board;
    private List<Move> moves;
    private List<GameWinningStrategy> gameWinningStrategies;
    private int lastMovedPlayerIndex;
    private GameStatus gameStatus;
    private Player winner;

    public List<Player> getPlayers() {
        return players;
    }

    public Board getBoard() {
        return board;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public List<GameWinningStrategy> getGameWinningStrategies() {
        return gameWinningStrategies;
    }

    public int getLastMovedPlayerIndex() {
        return lastMovedPlayerIndex;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public Player getWinner() {
        return winner;
    }

    private Game() {
        this.players = new ArrayList<>();
        this.moves = new ArrayList<>();
        this.gameWinningStrategies = new ArrayList<>();
        this.lastMovedPlayerIndex = -1;
        this.gameStatus = GameStatus.IN_PROGRESS;
    }

    public void makeMove() {
        this.lastMovedPlayerIndex += 1;
        this.lastMovedPlayerIndex %= this.players.size();

        Move move = this.players.get(this.lastMovedPlayerIndex)
                .makeMove(this.board);

        this.moves.add(move);

        move.getCell().setSymbol(move.getSymbol());

        for (GameWinningStrategy strategy : gameWinningStrategies) {
            if (strategy.checkIfWon(this.board, this.players.get(lastMovedPlayerIndex), move.getCell())) {
                gameStatus = GameStatus.ENDED;
                winner = this.players.get(lastMovedPlayerIndex);
                return;
            }
        }

        if (moves.size() == this.board.getDimension() * this.board.getDimension()) {
            gameStatus = GameStatus.DRAW;
            return;
        }
    }

    //  A B C D
    //  0 1 2 3 4
    //  0

    public static Builder create() {
        return new Builder();
    }

    public boolean undo() throws EmptyMovesUndoOperationException {
        if (this.moves.size() == 0) {
            // Handle Edge Case
            throw new EmptyMovesUndoOperationException();
        }

        Move lastMove = this.moves.get(this.moves.size() - 1);
        Cell relevantCell = lastMove.getCell();
        relevantCell.clearCell();
        this.lastMovedPlayerIndex -= 1;
        this.lastMovedPlayerIndex = (this.lastMovedPlayerIndex + this.players.size()) % this.players.size();
        this.moves.remove(lastMove);
        return true;
    }

    //  0      1      2     3
    // [Cell1 Cell2 Cell3 Cell4]
    //  0      1      2
    // [Cell1 Cell2 Cell3]

    // 0
    // [Cell1]
    // 0 - 1 = -1 % M
    // (A - B) % M = ((A % M - B %M) + M) % M

    public static class Builder {
        private List<Player> players;
        private List<GameWinningStrategy> gameWinningStrategies;
        private int dimension;

        Builder() {
            this.players = new ArrayList<>();
            this.gameWinningStrategies = new ArrayList<>();
        }


        // Game.BUilder.setPlayers({})
        // Game game = Game.Builder.addPlayer(new HumanPlayer())
        //                         .addPlayer(new Bot())
        //                         .build();
//        public Builder addPlayer(Player player) {
//            this.players.add(player);
//            return this;
//        }

        public Builder addPlayers(List<Player> players) {
            this.players.addAll(players);
            return this;
        }

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }


        public Builder addGameWinningStrategy(GameWinningStrategy strategy) {
            this.gameWinningStrategies.add(strategy);
            return this;
        }

        public Builder addGameWinningStrategies(List<GameWinningStrategy> strategies) {
            this.gameWinningStrategies.addAll(strategies);
            return this;
        }

        private boolean checkIfSingleBotMax() {
            int count = 0;
            for (Player player : players) {
                if (player.getPlayerType().equals(PlayerType.BOT)) {
                    count += 1;
                }
            }
            return count <= 1;
        }

        public Game build() throws MultipleBotsException {
            if (!checkIfSingleBotMax()) {
                throw new MultipleBotsException();
            }

//            if (players.size() < 2) {
//                //
//            }
//
//            if (gameWinningStrategies.size() < 1) {
//                //
//            }
//
//            if (dimension < 3) {
//
//            }

            Game game = new Game();
            game.players.addAll(this.players);
            game.gameWinningStrategies.addAll(this.gameWinningStrategies);
            game.board = new Board(dimension);
            return game;
        }
    }
}