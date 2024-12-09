package com.chinese_checkers.comms.Message;

import com.chinese_checkers.comms.Message.FromClient.DisconnectMessage;
import com.chinese_checkers.comms.Message.FromClient.RequestJoinMessage;
import com.chinese_checkers.comms.Message.FromClient.RequestRefreshMessage;
import com.chinese_checkers.comms.Message.FromServer.GameEndMessage;
import com.chinese_checkers.comms.Message.FromServer.GameStartMessage;
import com.chinese_checkers.comms.Message.FromServer.NextRoundMessage;
import com.chinese_checkers.comms.Message.FromServer.ResponseMessage;
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
    @JsonSubTypes.Type(value = MoveMessage.class, name = "move"),
    @JsonSubTypes.Type(value = JoinMessage.class, name = "join"),
    @JsonSubTypes.Type(value = AcknowledgeMessage.class, name = "acknowledge"),

    // FromServer messages
    @JsonSubTypes.Type(value = GameStartMessage.class, name = "game_start"),
    @JsonSubTypes.Type(value = GameEndMessage.class, name = "game_end"),
    @JsonSubTypes.Type(value = NextRoundMessage.class, name = "next_round"),
    @JsonSubTypes.Type(value = ResponseMessage.class, name = "response"),

    // FromClient messages
    @JsonSubTypes.Type(value = DisconnectMessage.class, name = "disconnect"),
    @JsonSubTypes.Type(value = RequestJoinMessage.class, name = "request_join"),
    @JsonSubTypes.Type(value = RequestRefreshMessage.class, name = "request_refresh")

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
