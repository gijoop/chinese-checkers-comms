package com.chinese_checkers.comms.Message;

import java.io.IOException;

import com.chinese_checkers.comms.Position;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.KeyDeserializer;

public class PositionKeyDeserializer extends KeyDeserializer {
    @Override
    public Position deserializeKey(String key, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        //Use the string key here to return a real map key object
        return Position.fromString(key);
    }
}
