package com.chinese_checkers.comms.Message.FromServer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.HashMap;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.chinese_checkers.comms.Pawn;
import com.chinese_checkers.comms.Position;

public class GameStartMessageTest {

    private GameStartMessage gameStartMessage;

    @BeforeEach
    public void setUp() {
        gameStartMessage = new GameStartMessage();
    }

    @Test
    public void testDefaultConstructor() {
        assertEquals("game_start", gameStartMessage.getType());
        assertNotNull(gameStartMessage.getPawns());
        assertEquals(0, gameStartMessage.getBoardSize());
    }

    @Test
    public void testConstructorWithBoardSize() {
        gameStartMessage = new GameStartMessage(10);
        assertEquals("game_start", gameStartMessage.getType());
        assertNotNull(gameStartMessage.getPawns());
        assertEquals(10, gameStartMessage.getBoardSize());
    }

    @Test
    public void testConstructorWithPawns() {
        HashMap<Position, Pawn> pawns = new HashMap<>();
        pawns.put(new Position(0, 0), new Pawn(null));
        gameStartMessage = new GameStartMessage(pawns);
        assertEquals("game_start", gameStartMessage.getType());
        assertEquals(pawns, gameStartMessage.getPawns());
    }

    @Test
    public void testAddPawn() {
        Position position = new Position(1, 1);
        Pawn pawn = new Pawn(null);
        gameStartMessage.addPawn(position, pawn);
        assertEquals(pawn, gameStartMessage.getPawns().get(position));
    }

    @Test
    public void testSetBoardSize() {
        gameStartMessage.setBoardSize(15);
        assertEquals(15, gameStartMessage.getBoardSize());
    }
}