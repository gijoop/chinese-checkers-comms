package com.chinese_checkers.comms.Message.FromClient;

import com.chinese_checkers.comms.Message.Message;

/**
 * Represents a message indicating a player disconnecting from the Chinese Checkers game.
 */
public class DisconnectMessage extends Message {
    /**
     * Constructs a DisconnectMessage with default values.
     */
    public DisconnectMessage() {
        this.type = "disconnect";
    }

    /**
     * Returns a string representation of the DisconnectMessage.
     *
     * @return a string representation of the DisconnectMessage
     */
    @Override
    public String toString() {
        return "";
    }
}