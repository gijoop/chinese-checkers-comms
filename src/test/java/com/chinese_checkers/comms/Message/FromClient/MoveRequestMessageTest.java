package com.chinese_checkers.comms.Message.FromClient;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MoveRequestMessageTest {

    @Test
    public void testDefaultConstructor() {
        MoveRequestMessage message = new MoveRequestMessage();
        assertEquals("move_request", message.getType());
        assertEquals(-1, message.pawnID);
        assertEquals(0, message.x);
        assertEquals(0, message.y);
    }

    @Test
    public void testParameterizedConstructor() {
        int pawnID = 5;
        int x = 10;
        int y = 15;
        MoveRequestMessage message = new MoveRequestMessage(pawnID, x, y);
        assertEquals("move_request", message.getType());
        assertEquals(pawnID, message.pawnID);
        assertEquals(x, message.x);
        assertEquals(y, message.y);
    }
}