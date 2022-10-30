package com.ishan.lld.tictactoev2.models;

import com.ishan.lld.tictactoev2.exceptions.DuplicateSymbolException;
import com.ishan.lld.tictactoev2.factories.GameWinningStrategyFactory;
import com.ishan.lld.tictactoev2.strategies.winningstrategy.GameWinningStrategy;

import java.util.*;

public class Game {
    private List<Player> players;
    private Board board;
    private List<Move> moves;
    private List<GameWinningStrategy> gameWinningStrategies;
    private int lastMovedPlayerIndex;
    private GameStatus gameStatus;
    private Player winner;
    private int filledCells = 0;

    private Game() {
    }

    public static Builder getBuilder() {
        return new Builder();
    }

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

    public void makeMove() {
        board.display();

        this.lastMovedPlayerIndex += 1;
        this.lastMovedPlayerIndex %= players.size();
        System.out.println(this.players.get(lastMovedPlayerIndex).getName() + "'s turn");
        Move potentialMove = this.players.get(this.lastMovedPlayerIndex).makeMove(this.board);

        if (this.board.getCell(potentialMove.getRow(), potentialMove.getColumn()).getPlayer() != null) {
            this.lastMovedPlayerIndex -= 1;
            this.lastMovedPlayerIndex %= players.size();
            System.out.println("Bad Move Try Again!");
            return;
        }

        this.moves.add(potentialMove);
        this.board.getCell(potentialMove.getRow(), potentialMove.getColumn()).setPlayer(
                this.players.get(lastMovedPlayerIndex)
        );

        populatePlayersData(potentialMove);

        filledCells += 1;

        for (GameWinningStrategy gameWinningStrategy : gameWinningStrategies) {
            if (gameWinningStrategy.checkVictory(board, potentialMove)) {
                gameStatus = GameStatus.ENDED;
                winner = this.players.get(lastMovedPlayerIndex);
                return;
            }
        }

        if (filledCells == (this.players.size() + 1) * (this.players.size() + 1)) {
            gameStatus = GameStatus.DRAW;
        }
    }

    private void populatePlayersData(Move potentialMove) {
        int r = potentialMove.getRow();
        int c = potentialMove.getColumn();
        Player player = potentialMove.getPlayer();
        Map<Integer, Integer> dataMap = this.board.getPlayerToRowCountMap().get(player);
        if (dataMap == null) {
            dataMap = new HashMap<>();
            this.board.getPlayerToRowCountMap().put(player, dataMap);
        }
        dataMap.put(r, dataMap.getOrDefault(r, 0) + 1);

        dataMap = this.board.getPlayerToColCountMap().get(player);
        if (dataMap == null) {
            dataMap = new HashMap<>();
            this.board.getPlayerToColCountMap().put(player, dataMap);
        }
        dataMap.put(c, dataMap.getOrDefault(c, 0) + 1);

        if (r == c) {
            dataMap = this.board.getPlayerToDiagonalCountMap().get(player);
            if (dataMap == null) {
                dataMap = new HashMap<>();
                this.board.getPlayerToDiagonalCountMap().put(player, dataMap);
            }
            dataMap.put(0, dataMap.getOrDefault(0, 0) + 1);
        }

        if (r + c == board.getDimension() - 1) {
            dataMap = this.board.getPlayerToDiagonalCountMap().get(player);
            if (dataMap == null) {
                dataMap = new HashMap<>();
                this.board.getPlayerToDiagonalCountMap().put(player, dataMap);
            }
            dataMap.put(1, dataMap.getOrDefault(1, 0) + 1);
        }
    }

    public static class Builder {
        private List<Player> players;
        private List<GameWinningStrategy> gameWinningStrategies;

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setGameWinningStrategies(List<GameWinningStrategyName> gameWinningStrategiesNames) {
            this.gameWinningStrategies = new ArrayList<>();

            for (GameWinningStrategyName gameWinningStrategyName : gameWinningStrategiesNames) {
                this.gameWinningStrategies.add(GameWinningStrategyFactory.getGameWinningStrategyByName(gameWinningStrategyName));
            }
            return this;
        }

        public Game build() {
            Set<Character> alreadyExistingCharacters = new HashSet<>();

            for (Player player : players) {
                if (alreadyExistingCharacters.contains(
                        player.getSymbol().getCharacter())) {
                    throw new DuplicateSymbolException(player.getSymbol().getCharacter());
                }
                alreadyExistingCharacters.add(player.getSymbol().getCharacter());
            }

            Game game = new Game();
            game.gameStatus = GameStatus.IN_PROGRESS;
            game.gameWinningStrategies = gameWinningStrategies;
            game.players = players;
            game.moves = new ArrayList<>();
            game.board = new Board(players.size() + 1);
            game.lastMovedPlayerIndex = -1;

            return game;
        }
    }

}

// Game class:
// i. Lots of attributes
// ii. Need validation (every player must have a different symbol