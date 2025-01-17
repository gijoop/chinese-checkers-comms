package com.chinese_checkers.comms.Message.FromClient;

import com.chinese_checkers.comms.Message.Message;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a message requesting a move in the Chinese Checkers game.
 */
public class MoveRequestMessage extends Message {
    // public members go brrrrrr (viva la c++)
    @JsonProperty("pawnID")
    public int pawnID;
    @JsonProperty("x")
    public int x;
    @JsonProperty("y")
	public int y;
    
    /**
     * Constructs a MoveRequestMessage with default values.
     */
    public MoveRequestMessage() {
        this.type = "move_request";
        this.pawnID = -1;
        this.x = 0;
        this.y = 0;
    }

    /**
     * Constructs a MoveRequestMessage with the specified pawn ID and coordinates.
     *
     * @param pawnID the ID of the pawn to move
     * @param x the x-coordinate of the move
     * @param y the y-coordinate of the move
     */
    public MoveRequestMessage(int pawnID, int x, int y) {
        this.type = "move_request";
        this.pawnID = pawnID;
        this.x = x;
        this.y = y;
    }

    /**
     * Returns a string representation of the MoveRequestMessage.
     *
     * @return a string representation of the MoveRequestMessage
     */
    @Override
    public String toString() {
        return "MoveRequestMessage [pawn=" + pawnID + ": x=" + x + ", y=" + y + "]";
    }
}