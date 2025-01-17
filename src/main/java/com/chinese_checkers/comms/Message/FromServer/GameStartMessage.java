package com.chinese_checkers.comms.Message.FromServer;

import java.util.HashMap;

import com.chinese_checkers.comms.Pawn;
import com.chinese_checkers.comms.Position;
import com.chinese_checkers.comms.Message.Message;
import com.chinese_checkers.comms.Message.PositionKeyDeserializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Represents a message indicating the start of the game in the Chinese Checkers game.
 */
public class GameStartMessage extends Message {

    @JsonDeserialize(keyUsing = PositionKeyDeserializer.class)
    private HashMap<Position, Pawn> pawns;

    @JsonProperty("board_size")
    private int boardSize;

    @JsonProperty("variant")
    private String variant;

    /**
     * Constructs a GameStartMessage with default values.
     */
    public GameStartMessage() {
        this.type = "game_start";
        this.pawns = new HashMap<Position, Pawn>();
        this.boardSize = 0;
    }

    /**
     * Constructs a GameStartMessage with the specified board size.
     *
     * @param boardSize the size of the board
     */
    public GameStartMessage(int boardSize) {
        this.type = "game_start";
        this.pawns = new HashMap<Position, Pawn>();
        this.boardSize = boardSize;
    }

    /**
     * Constructs a GameStartMessage with the specified pawns.
     *
     * @param pawns the pawns on the board
     */
    public GameStartMessage(HashMap<Position, Pawn> pawns) {
        this.type = "game_start";
        this.pawns = pawns;
    }

    /**
     * Constructs a GameStartMessage with the specified variant.
     *
     * @param variant the variant of the game
     */
    public GameStartMessage(String variant) {
        this.type = "game_start";
        this.pawns = new HashMap<Position, Pawn>();
        this.variant = variant;
        this.boardSize = 0;
    }

    /**
     * Returns the pawns on the board.
     *
     * @return the pawns on the board
     */
    public HashMap<Position, Pawn> getPawns() {
        return pawns;
    }

    /**
     * Adds a pawn to the board.
     *
     * @param position the position of the pawn
     * @param pawn the pawn to add
     */
    public void addPawn(Position position, Pawn pawn) {
        pawns.put(position, pawn);
    }

    /**
     * Returns the size of the board.
     *
     * @return the size of the board
     */
    @JsonProperty("board_size")
    public int getBoardSize() {
        return boardSize;
    }

    /**
     * Returns the variant of the game.
     *
     * @return the variant of the game
     */
    @JsonProperty("variant")
    public String getVariant() {
        return variant;
    }

    /**
     * Sets the size of the board.
     *
     * @param boardSize the size of the board
     */
    public void setBoardSize(int boardSize) {
        this.boardSize = boardSize;
    }

    /**
     * Sets the variant of the game.
     *
     * @param variant the variant of the game
     */
    public void setVariant(String variant) {
        this.variant = variant;
    }

    /**
     * Returns a string representation of the GameStartMessage.
     *
     * @return a string representation of the GameStartMessage
     */
    @Override
    public String toString() {
        return "GameStartMessage";
    }
}