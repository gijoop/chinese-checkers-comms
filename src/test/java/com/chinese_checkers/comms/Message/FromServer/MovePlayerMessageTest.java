package com.chinese_checkers.comms.Message.FromServer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MovePlayerMessageTest {

    @Test
    public void testDefaultConstructor() {
        MovePlayerMessage message = new MovePlayerMessage();
        assertEquals("move_player", message.getType());
        assertEquals(-1, message.playerID);
        assertEquals(-1, message.pawnID);
        assertEquals(0, message.x);
        assertEquals(0, message.y);
    }

    @Test
    public void testParameterizedConstructor() {
        int playerID = 1;
        int pawnID = 2;
        int x = 3;
        int y = 4;
        MovePlayerMessage message = new MovePlayerMessage(playerID, pawnID, x, y);
        assertEquals("move_player", message.getType());
        assertEquals(playerID, message.playerID);
        assertEquals(pawnID, message.pawnID);
        assertEquals(x, message.x);
        assertEquals(y, message.y);
    }
}