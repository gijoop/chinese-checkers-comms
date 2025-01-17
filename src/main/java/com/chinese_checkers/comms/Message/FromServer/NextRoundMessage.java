package com.chinese_checkers.comms.Message.FromServer;

import com.chinese_checkers.comms.Message.Message;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a message indicating the start of the next round in the Chinese Checkers game.
 */
public class NextRoundMessage extends Message {
    int currentPlayerID;

    /**
     * Constructs a NextRoundMessage with default values.
     */
    public NextRoundMessage() {
        this.type = "next_round";
        this.currentPlayerID = -1;
    }

    /**
     * Constructs a NextRoundMessage with the next turn player ID.
     *
     * @param currentPlayerID the ID of the current player
     */
    public NextRoundMessage(int currentPlayerID) {
        this.type = "next_round";
        this.currentPlayerID = currentPlayerID;
    }

    /**
     * Returns the ID of the next turn player.
     *
     * @return the ID of the next turn player
     */
    @JsonProperty("currentPlayerID")
    public int getCurrentPlayerID() {
        return currentPlayerID;
    }

    /**
     * Sets the ID of the next turn player.
     *
     * @param currentPlayerID the ID of the next turn player
     */
    @JsonProperty("currentPlayerID")
    public void setCurrentPlayerID(int currentPlayerID) {
        this.currentPlayerID = currentPlayerID;
    }

    /**
     * Returns a string representation of the NextRoundMessage.
     *
     * @return a string representation of the NextRoundMessage
     */
    @Override
    public String toString() {
        return "NextRoundMessage [currentPlayerID=" + currentPlayerID + "]";
    }
}