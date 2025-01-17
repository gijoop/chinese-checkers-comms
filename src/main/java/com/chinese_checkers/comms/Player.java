package com.chinese_checkers.comms;

/**
 * Represents a player in the Chinese Checkers game.
 */
public class Player {
    /**
     * Enum representing the corners of the game board.
     */
    public enum Corner {
        UPPER,
        UPPER_RIGHT,
        LOWER_RIGHT,
        LOWER,
        UPPER_LEFT,
        LOWER_LEFT,
        NONE;
        
        /**
         * Gets the opposite corner.
         *
         * @return the opposite corner
         */
        public Corner getOpposite() {
            switch (this) {
                case UPPER:
                    return LOWER;
                case UPPER_LEFT:
                    return LOWER_RIGHT;
                case LOWER_LEFT:
                    return UPPER_RIGHT;
                case LOWER:
                    return UPPER;
                case LOWER_RIGHT:
                    return UPPER_LEFT;
                case UPPER_RIGHT:
                    return LOWER_LEFT;
                case NONE:
                    return NONE;
                default:
                    throw new IllegalStateException("Unexpected value: " + this);
            }
        }
    }

    private String name;
    private Corner corner;
    private int id;

    /**
     * Constructs a Player with the specified name, id, and corner.
     *
     * @param name the name of the player
     * @param id the id of the player
     * @param corner the corner assigned to the player
     */
    public Player(String name, int id, Corner corner) {
        this.name = name;
        this.id = id;
        this.corner = corner;
    }

    /**
     * Constructs a Player with the specified name and id.
     *
     * @param name the name of the player
     * @param id the id of the player
     */
    public Player(String name, int id) {
        this(name, id, null);
    }

    /**
     * Constructs a Player with the specified id.
     *
     * @param id the id of the player
     */
    public Player(int id) {
        this(null, id, null);
    }

    /**
     * Constructs a Player with default values.
     */
    public Player() {
        this(null, -1, null);
    }

    /**
     * Returns the name of the player.
     *
     * @return the name of the player
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the player.
     *
     * @param name the new name of the player
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the corner assigned to the player.
     *
     * @param corner the new corner assigned to the player
     */
    public void setCorner(Corner corner) {
        this.corner = corner;
    }

    /**
     * Returns the corner assigned to the player.
     *
     * @return the corner assigned to the player
     */
    public Corner getCorner() {
        return corner;
    }

    /**
     * Sets the id of the player.
     *
     * @param id the new id of the player
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Returns the id of the player.
     *
     * @return the id of the player
     */
    public int getId() {
        return id;
    }
}