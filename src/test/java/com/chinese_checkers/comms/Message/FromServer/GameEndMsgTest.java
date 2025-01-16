package com.chinese_checkers.comms.Message.FromServer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GameEndMsgTest {

	private GameEndMessage gameEndMessage;

	@BeforeEach
	public void setUp() {
		gameEndMessage = new GameEndMessage();
	}

	@Test
	public void testDefaultConstructor() {
		assertEquals("game_end", gameEndMessage.getType());
		assertEquals("", gameEndMessage.getReason());
	}

	@Test
	public void testParameterizedConstructor() {
		gameEndMessage = new GameEndMessage("Game Over");
		assertEquals("game_end", gameEndMessage.getType());
		assertEquals("Game Over", gameEndMessage.getReason());
	}

	@Test
	public void testSetReason() {
		gameEndMessage.setReason("Game Over");
		assertEquals("Game Over", gameEndMessage.getReason());
	}
}