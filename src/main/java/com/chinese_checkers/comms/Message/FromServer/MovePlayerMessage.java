package com.chinese_checkers.comms.Message.FromServer;

import com.chinese_checkers.comms.Message.Message;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a message indicating a player's move in the Chinese Checkers game.
 */
public class MovePlayerMessage extends Message {
    // public members go brrrrrr (viva la c++)
    @JsonProperty("playerID")
    public int playerID;
    @JsonProperty("pawnID")
    public int pawnID;
    @JsonProperty("x")
    public int x;
    @JsonProperty("y")
    public int y;

    /**
     * Constructs a MovePlayerMessage with default values.
     */
    public MovePlayerMessage() {
        this.type = "move_player";
        this.playerID = -1;
        this.pawnID = -1;
        this.x = 0;
        this.y = 0;
    }

    /**
     * Constructs a MovePlayerMessage with the specified player ID, pawn ID, and coordinates.
     *
     * @param playerID the ID of the player
     * @param pawnID the ID of the pawn
     * @param x the x-coordinate of the move
     * @param y the y-coordinate of the move
     */
    public MovePlayerMessage(int playerID, int pawnID, int x, int y) {
        this.type = "move_player";
        this.playerID = playerID;
        this.pawnID = pawnID;
        this.x = x;
        this.y = y;
    }

    /**
     * Returns a string representation of the MovePlayerMessage.
     *
     * @return a string representation of the MovePlayerMessage
     */
    @Override
    public String toString() {
        return "MovePlayerMessage [playerID=" + playerID + ", pawnID=" + pawnID + ", x=" + x + ", y=" + y + "]";
    }
}