package com.chinese_checkers.comms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test; 

public class PawnTest {

    private Player mockPlayer;

    @BeforeEach
    public void setUp() {
        mockPlayer = mock(Player.class);
        when(mockPlayer.getName()).thenReturn("Player1");
    }

    @Test
    public void testPawnConstructorWithOwner() {
        Pawn pawn = new Pawn(mockPlayer);
        assertEquals(mockPlayer, pawn.getOwner());
        // assertEquals(100, pawn.getId());
    }

    @Test
    public void testPawnConstructorWithoutOwner() {
        Pawn pawn = new Pawn();
        assertEquals(null, pawn.getOwner());
        // assertEquals(101, pawn.getId());
    }
}