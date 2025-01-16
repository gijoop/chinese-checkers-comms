package com.chinese_checkers.comms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PositionTest {

    @Test
    public void testDefaultConstructor() {
        Position position = new Position();
        assertEquals(0, position.getX());
        assertEquals(0, position.getY());
    }

    @Test
    public void testSetX() {
        Position position = new Position();
        position.setX(5);
        assertEquals(5, position.getX());
    }

    @Test
    public void testSetXNegativeValue() {
        Position position = new Position();
        position.setX(-3);
        assertEquals(-3, position.getX());
    }

    @Test
    public void testSetXZero() {
        Position position = new Position();
        position.setX(0);
        assertEquals(0, position.getX());
    }
}