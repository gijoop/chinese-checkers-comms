package com.chinese_checkers.comms.Message.FromServer;

import com.chinese_checkers.comms.Message.Message;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a response message in the Chinese Checkers game.
 */
public class ResponseMessage extends Message {
    /**
     * Enum representing the status of the response.
     */
    public enum Status {
        SUCCESS, FAILURE, ERROR, GAME_OVER
    }

    @JsonProperty
    String toWhatAction;

    String message;
    Status status;

    /**
     * Constructs a ResponseMessage with default values.
     */
    public ResponseMessage() {
        this.type = "response";
        this.toWhatAction = "";
        this.message = "";
    }

    /**
     * Constructs a ResponseMessage with the specified action, status, and message.
     *
     * @param toWhatAction the action to which this response corresponds
     * @param status the status of the response
     * @param message the message content
     */
    public ResponseMessage(String toWhatAction, Status status, String message) {
        this.type = "response";
        this.toWhatAction = toWhatAction;
        this.message = message;
        this.status = status;
    }

    /**
     * Returns the action to which this response corresponds.
     *
     * @return the action to which this response corresponds
     */
    @JsonProperty("toWhatAction")
    public String getToWhatAction() {
        return toWhatAction;
    }

    /**
     * Sets the action to which this response corresponds.
     *
     * @param toWhatAction the action to which this response corresponds
     */
    @JsonProperty("toWhatAction")
    public void setToWhatAction(String toWhatAction) {
        this.toWhatAction = toWhatAction;
    }

    /**
     * Returns the message content.
     *
     * @return the message content
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * Sets the message content.
     *
     * @param message the message content
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Returns the status of the response.
     *
     * @return the status of the response
     */
    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the status of the response.
     *
     * @param status the status of the response
     */
    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * Returns a string representation of the response message.
     *
     * @return a string representation of the response message
     */
    @Override
    public String toString() {
        return "ResponseMessage: " + toWhatAction + ": \"" + message + "\"";
    }
}