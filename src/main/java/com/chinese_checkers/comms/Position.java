package com.chinese_checkers.comms;

/**
 * Represents a position in a 2D grid using axial coordinates.
 */
public class Position {
    private int x; // Axial column
    private int y; // Axial row

    /**
     * Constructs a Position with the specified coordinates.
     *
     * @param x the x-coordinate (axial column)
     * @param y the y-coordinate (axial row)
     */
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Constructs a Position by copying another Position.
     *
     * @param position the Position to copy
     */
    public Position(Position position) {
        this.x = position.x;
        this.y = position.y;
    }

    /**
     * Constructs a Position at the origin (0, 0).
     */
    public Position() {
        this(0, 0);
    }

    /**
     * Sets the x-coordinate (axial column).
     *
     * @param x the new x-coordinate
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Sets the y-coordinate (axial row).
     *
     * @param y the new y-coordinate
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Returns the x-coordinate (axial column).
     *
     * @return the x-coordinate
     */
    public int getX() {
        return x;
    }

    /**
     * Returns the y-coordinate (axial row).
     *
     * @return the y-coordinate
     */
    public int getY() {
        return y;
    }

    /**
     * Adds the coordinates of another Position to this Position.
     *
     * @param position the Position to add
     * @return a new Position representing the sum of the coordinates
     */
    public Position add(Position position) {
        return new Position(x + position.x, y + position.y);
    }

    /**
     * Compares this Position to the specified object. The result is true if and only if the argument is not null and is a Position object that has the same coordinates as this object.
     *
     * @param obj the object to compare this Position against
     * @return true if the given object represents a Position equivalent to this Position, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Position position = (Position) obj;
        return x == position.x && y == position.y;
    }

    /**
     * Returns a hash code value for this Position.
     *
     * @return a hash code value for this Position
     */
    @Override
    public int hashCode() {
        return 31 * x + y;
    }

    /**
     * Returns a string representation of this Position.
     *
     * @return a string representation of this Position in the format "(x, y)"
     */
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    /**
     * Creates a Position from a string representation.
     *
     * @param str the string representation of the Position in the format "(x, y)"
     * @return a new Position object with the coordinates parsed from the string
     * @throws NumberFormatException if the string does not contain a parsable integer
     */
    public static Position fromString(String str) {
        str = str.substring(1, str.length() - 1).strip();
        String[] parts = str.split(",");
        for (int i = 0; i < parts.length; i++) {
            parts[i] = parts[i].strip();
        }
        return new Position(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]));
    }
}