package com.chinese_checkers.comms.Message.FromServer;

import com.chinese_checkers.comms.Message.Message;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a message indicating the end of the game in the Chinese Checkers game.
 */
public class GameEndMessage extends Message {
    String reason;

    /**
     * Constructs a GameEndMessage with default values.
     */
    public GameEndMessage() {
        this.type = "game_end";
        this.reason = "";
    }

    /**
     * Constructs a GameEndMessage with the specified reason.
     *
     * @param reason the reason for the game end
     */
    public GameEndMessage(String reason) {
        this.type = "game_end";
        this.reason = reason;
    }

    /**
     * Returns the reason for the game end.
     *
     * @return the reason for the game end
     */
    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }

    /**
     * Sets the reason for the game end.
     *
     * @param reason the reason for the game end
     */
    @JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * Returns a string representation of the GameEndMessage.
     *
     * @return a string representation of the GameEndMessage
     */
    @Override
    public String toString() {
        return "GameEndMessage: [reason: " + reason + "]";
    }
}