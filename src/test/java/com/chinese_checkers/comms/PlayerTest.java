package com.chinese_checkers.comms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    @Test
    public void testPlayerDefaultConstructor() {
        Player player = new Player();
        assertNull(player.getName());
        assertEquals(-1, player.getId());
        assertNull(player.getCorner());
    }

    @Test
    public void testPlayerConstructorWithId() {
        Player player = new Player(1);
        assertNull(player.getName());
        assertEquals(1, player.getId());
        assertNull(player.getCorner());
    }

    @Test
    public void testPlayerConstructorWithNameAndId() {
        Player player = new Player("Alice", 2);
        assertEquals("Alice", player.getName());
        assertEquals(2, player.getId());
        assertNull(player.getCorner());
    }

    @Test
    public void testPlayerConstructorWithNameIdAndCorner() {
        Player player = new Player("Bob", 3, Player.Corner.UPPER);
        assertEquals("Bob", player.getName());
        assertEquals(3, player.getId());
        assertEquals(Player.Corner.UPPER, player.getCorner());
    }

    @Test
    public void testSetName() {
        Player player = new Player();
        player.setName("Charlie");
        assertEquals("Charlie", player.getName());
    }

    @Test
    public void testSetId() {
        Player player = new Player();
        player.setId(4);
        assertEquals(4, player.getId());
    }

    @Test
    public void testSetCorner() {
        Player player = new Player();
        player.setCorner(Player.Corner.LOWER);
        assertEquals(Player.Corner.LOWER, player.getCorner());
    }

    @Test
    public void testCornerGetOpposite() {
        assertEquals(Player.Corner.LOWER, Player.Corner.UPPER.getOpposite());
        assertEquals(Player.Corner.UPPER, Player.Corner.LOWER.getOpposite());
        assertEquals(Player.Corner.LOWER_RIGHT, Player.Corner.UPPER_LEFT.getOpposite());
        assertEquals(Player.Corner.UPPER_LEFT, Player.Corner.LOWER_RIGHT.getOpposite());
        assertEquals(Player.Corner.UPPER_RIGHT, Player.Corner.LOWER_LEFT.getOpposite());
        assertEquals(Player.Corner.LOWER_LEFT, Player.Corner.UPPER_RIGHT.getOpposite());
        assertEquals(Player.Corner.NONE, Player.Corner.NONE.getOpposite());
    }
}