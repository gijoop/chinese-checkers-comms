package com.chinese_checkers.comms;

import com.chinese_checkers.comms.Message.Message;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;

/**
 * Parses and executes commands based on message types.
 */
public class CommandParser {

    private final ConcurrentHashMap<String, List<Consumer<Message>>> commands = new ConcurrentHashMap<>();

    /**
     * Constructs a CommandParser.
     */
    public CommandParser() {}

    /**
     * Parses and executes the command associated with the given message.
     *
     * @param msg the message containing the command to be executed
     */
    public void parseCommand(Message msg) {
        if (commands.containsKey(msg.getType())) {
            for (Consumer<Message> action : commands.get(msg.getType())) {
                action.accept(msg);
            }
        } else {
            System.out.println("Command not found for type: " + msg.getType());
        }
    }

    /**
     * Adds a command to be executed for a specific message type.
     *
     * @param msgType the type of the message
     * @param action the action to be executed for the message type
     */
    public void addCommand(String msgType, Consumer<Message> action) {
        if (!commands.containsKey(msgType)) {
            commands.put(msgType, new java.util.ArrayList<>());
        }

        commands.get(msgType).add(action);
    }

    /**
     * Returns the map of commands.
     *
     * @return the map of commands
     */
    public ConcurrentHashMap<String, List<Consumer<Message>>> getCommands() {
        return commands;
    }

    /**
     * Clears all commands from the parser.
     */
    public void clearCommands() {
        commands.clear();
    }
}