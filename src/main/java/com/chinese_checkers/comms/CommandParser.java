package com.chinese_checkers.comms;

import com.chinese_checkers.comms.Message.Message;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;

public class CommandParser {

	private final ConcurrentHashMap<String, List<Consumer<Message>>> commands = new ConcurrentHashMap<>();

	public CommandParser() {}

	public void parseCommand(Message msg) {
		if (commands.containsKey(msg.getType())) {
			for (Consumer<Message> action : commands.get(msg.getType())) {
				action.accept(msg);
			}
		} else {
			System.out.println("Command not found for type: " + msg.getType());
		}
	}

	public void addCommand(String msgType, Consumer<Message> action) {
		if (!commands.containsKey(msgType)) {
			commands.put(msgType, new java.util.ArrayList<>());
		}

		commands.get(msgType).add(action);
	}

	public ConcurrentHashMap<String, List<Consumer<Message>>> getCommands() {
		return commands;
	}

	public void clearCommands() {
		commands.clear();
	}
}


