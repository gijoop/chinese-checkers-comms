package com.chinese_checkers.comms;

public class Player {
    public enum Corner {
        UPPER,
        UPPER_RIGHT,
        LOWER_RIGHT,
        LOWER,
        UPPER_LEFT,
        LOWER_LEFT,
        NONE;
        
        // Method to get the opposite corner
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

    public Player(String name, int id, Corner corner) {
        this.name = name;
        this.id = id;
        this.corner = corner;
    }

    public Player(String name, int id) {
        this(name, id, null);
    }

    public Player(int id) {
        this(null, id, null);
    }

    public Player() {
        this(null, -1, null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCorner(Corner corner) {
        this.corner = corner;
    }

    public Corner getCorner() {
        return corner;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
