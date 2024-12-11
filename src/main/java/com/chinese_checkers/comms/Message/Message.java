package com.chinese_checkers.comms.Message;

import com.chinese_checkers.comms.Message.FromClient.DisconnectMessage;
import com.chinese_checkers.comms.Message.FromClient.MoveRequestMessage;
import com.chinese_checkers.comms.Message.FromClient.RequestJoinMessage;
import com.chinese_checkers.comms.Message.FromClient.RequestRefreshMessage;
import com.chinese_checkers.comms.Message.FromServer.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.ObjectMapper;


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

    // FromClient messages
    @JsonSubTypes.Type(value = DisconnectMessage.class, name = "disconnect"),
    @JsonSubTypes.Type(value = RequestJoinMessage.class, name = "request_join"),
    @JsonSubTypes.Type(value = RequestRefreshMessage.class, name = "request_refresh"),
    @JsonSubTypes.Type(value = MoveRequestMessage.class, name = "move_request")

    // Add more message types as needed
})
public abstract class Message {
    @JsonProperty("type")
    protected String type;

    public abstract String toString();

    public String getType() {
        return type;
    }

    public static Message fromJson(String json){
        System.out.println(json);
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(json, Message.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String toJson() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String json = objectMapper.writeValueAsString(this);
            // System.out.println("[DEBUG:Message] " + json);
            return json;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
