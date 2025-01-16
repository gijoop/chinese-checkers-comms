package com.chinese_checkers.comms.Message.FromServer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class NextRoundMessageTest {

    @Test
    public void testConstructorWithCurrentPlayerID() {
        int currentPlayerID = 5;
        NextRoundMessage message = new NextRoundMessage(currentPlayerID);
        
        assertEquals("next_round", message.getType());
        assertEquals(currentPlayerID, message.getCurrentPlayerID());
    }

    @Test
    public void testDefaultConstructor() {
        NextRoundMessage message = new NextRoundMessage();
        
        assertEquals("next_round", message.getType());
        assertEquals(-1, message.getCurrentPlayerID());
    }

    @Test
    public void testSetCurrentPlayerID() {
        NextRoundMessage message = new NextRoundMessage();
        int newPlayerID = 10;
        message.setCurrentPlayerID(newPlayerID);
        
        assertEquals(newPlayerID, message.getCurrentPlayerID());
    }
}