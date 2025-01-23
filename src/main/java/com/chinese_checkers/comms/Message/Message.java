package com.chinese_checkers.comms.Message;

import com.chinese_checkers.comms.Message.FromClient.*;
import com.chinese_checkers.comms.Message.FromServer.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Abstract class representing a message in the Chinese Checkers game.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "type"
)
@JsonSubTypes({
    // FromServer messages
    @JsonSubTypes.Type(value = GameStartMessage.class, name = "game_start"),
    @JsonSubTypes.Type(value = GameEndMessage.class, name = "game_end"),
    @JsonSubTypes.Type(value = NextRoundMessage.class, name = "next_round"),
    @JsonSubTypes.Type(value = ResponseMessage.class, name = "response"),
    @JsonSubTypes.Type(value = MovePlayerMessage.class, name = "move_player"),
    @JsonSubTypes.Type(value = SelfDataMessage.class, name = "self_data"),
    @JsonSubTypes.Type(value = AnnounceWinnerMessage.class, name = "announce_winner"),

    // FromClient messages
    @JsonSubTypes.Type(value = DisconnectMessage.class, name = "disconnect"),
    @JsonSubTypes.Type(value = RequestJoinMessage.class, name = "request_join"),
    @JsonSubTypes.Type(value = MoveRequestMessage.class, name = "move_request"),
    @JsonSubTypes.Type(value = EndTurnMessage.class, name = "end_turn")

    // Add more message types as needed
})
public abstract class Message {
    @JsonProperty("type")
    protected String type;

    /**
     * Returns the type of the message.
     *
     * @return the type of the message
     */
    public String getType() {
        return type;
    }

    /**
     * Converts the message to a JSON string.
     *
     * @return the JSON string representation of the message
     */
    public String toJson() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String json = objectMapper.writeValueAsString(this);
            return json;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Creates a message object from a JSON string.
     *
     * @param json the JSON string representation of the message
     * @return the message object
     */
    public static Message fromJson(String json) {
        System.out.println(json);
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(json, Message.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Returns a string representation of the message.
     *
     * @return a string representation of the message
     */
    @Override
    public abstract String toString();
}