package com.chinese_checkers.comms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;
import java.util.function.Consumer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.chinese_checkers.comms.Message.Message;

public class CommandParserTest {
    private CommandParser commandParser;
    private Message mockMessage;
    private Consumer<Message> mockConsumer;

    @BeforeEach
    public void setUp() {
        commandParser = new CommandParser();
        mockMessage = mock(Message.class);
        mockConsumer = mock(Consumer.class);
    }

    @Test
    public void testParseCommandWithExistingCommand() {
        when(mockMessage.getType()).thenReturn("testType");
        commandParser.addCommand("testType", mockConsumer);
        commandParser.parseCommand(mockMessage);
        verify(mockConsumer, times(1)).accept(mockMessage);
    }

    @Test
    public void testParseCommandWithNonExistingCommand() {
        when(mockMessage.getType()).thenReturn("nonExistingType");
        commandParser.parseCommand(mockMessage);
        verify(mockConsumer, never()).accept(mockMessage);
    }
    @Test
    public void testAddCommand() {
        commandParser.addCommand("testType", mockConsumer);
        assertTrue(commandParser.getCommands().containsKey("testType"));
        assertEquals(1, commandParser.getCommands().get("testType").size());
    }

    @Test
    public void testAddMultipleCommands() {
        Consumer<Message> anotherMockConsumer = mock(Consumer.class);
        commandParser.addCommand("testType", mockConsumer);
        commandParser.addCommand("testType", anotherMockConsumer);
        assertEquals(2, commandParser.getCommands().get("testType").size());
    }

    @Test
    public void testClearCommands() {
        commandParser.addCommand("testType", mockConsumer);
        commandParser.clearCommands();
        assertTrue(commandParser.getCommands().isEmpty());
    }
}
