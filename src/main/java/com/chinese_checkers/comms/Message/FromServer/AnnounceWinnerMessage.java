package com.chinese_checkers.comms.Message.FromServer;

import com.chinese_checkers.comms.Message.Message;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a message announcing the winner in the Chinese Checkers game.
 */
public class AnnounceWinnerMessage extends Message {
    @JsonProperty
    private int player_id;
    @JsonProperty
    private int place;

    /**
     * Constructs an AnnounceWinnerMessage with default values.
     */
    public AnnounceWinnerMessage() {
        this.type = "announce_winner";
        this.player_id = -1;
        this.place = -1;
    }

    /**
     * Constructs an AnnounceWinnerMessage with the specified player ID and place.
     *
     * @param player_id the ID of the winning player
     * @param place the place of the winning player
     */
    public AnnounceWinnerMessage(int player_id, int place) {
        this.type = "announce_winner";
        this.player_id = player_id;
        this.place = place;
    }

    /**
     * Returns the ID of the winning player.
     *
     * @return the ID of the winning player
     */
    @JsonProperty("player_id")
    public int getPlayerID() {
        return player_id;
    }

    /**
     * Returns the place of the winning player.
     *
     * @return the place of the winning player
     */
    @JsonProperty("place")
    public int getPlace() {
        return place;
    }

    /**
     * Sets the ID of the winning player.
     *
     * @param player_id the ID of the winning player
     */
    public void setPlayerID(int player_id) {
        this.player_id = player_id;
    }

    /**
     * Sets the place of the winning player.
     *
     * @param place the place of the winning player
     */
    public void setPlace(int place) {
        this.place = place;
    }

    /**
     * Returns a string representation of the AnnounceWinnerMessage.
     *
     * @return a string representation of the AnnounceWinnerMessage
     */
    @Override
    public String toString() {
        return "AnnounceWinnerMessage: [player_id: " + player_id + ", place: " + place + "]";
    }
}