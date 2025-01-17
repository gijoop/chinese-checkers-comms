package com.chinese_checkers.comms.Message.FromClient;

import com.chinese_checkers.comms.Message.Message;

/**
 * Represents a message indicating the end of a player's turn in the Chinese Checkers game.
 */
public class EndTurnMessage extends Message {
    /**
     * Constructs an EndTurnMessage with default values.
     */
    public EndTurnMessage() {
        this.type = "end_turn";
    }

    /**
     * Returns a string representation of the EndTurnMessage.
     *
     * @return a string representation of the EndTurnMessage
     */
    @Override
    public String toString() {
        return "EndTurnMessage";
    }
}