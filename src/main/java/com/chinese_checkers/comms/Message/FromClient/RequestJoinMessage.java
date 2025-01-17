package com.chinese_checkers.comms.Message.FromClient;

import com.chinese_checkers.comms.Message.Message;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a message requesting to join the Chinese Checkers game.
 */
public class RequestJoinMessage extends Message {
    private String name;

    /**
     * Constructs a RequestJoinMessage with default values.
     */
    public RequestJoinMessage() {
        this.type = "request_join";
    }

    /**
     * Constructs a RequestJoinMessage with the specified name.
     *
     * @param name the name of the player requesting to join
     */
    public RequestJoinMessage(String name) {
        this.type = "request_join";
        this.name = name;
    }

    /**
     * Returns the name of the player requesting to join.
     *
     * @return the name of the player requesting to join
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the player requesting to join.
     *
     * @param name the name of the player requesting to join
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns a string representation of the RequestJoinMessage.
     *
     * @return a string representation of the RequestJoinMessage
     */
    @Override
    public String toString() {
        return "RequestJoinMessage";
    }
}