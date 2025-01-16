package com.chinese_checkers.comms.Message.FromClient;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RequestJoinMessageTest {

    @Test
    public void testConstructorWithName() {
        String testName = "Player1";
        RequestJoinMessage message = new RequestJoinMessage(testName);

        assertEquals("request_join", message.getType());
        assertEquals(testName, message.getName());
    }

    @Test
    public void testSetName() {
        String testName = "Player1";
        RequestJoinMessage message = new RequestJoinMessage();
        message.setName(testName);

        assertEquals(testName, message.getName());
    }

    @Test
    public void testToString() {
        RequestJoinMessage message = new RequestJoinMessage();
        assertEquals("RequestJoinMessage", message.toString());
    }
}