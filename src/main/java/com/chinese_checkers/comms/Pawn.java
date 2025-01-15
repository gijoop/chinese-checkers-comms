package com.chinese_checkers.comms;

public class Pawn {
    public static int idCounter = 100;

    private Player owner;
    private Integer id;

    public Pawn() {
        this.owner = null;
        this.id = idCounter++;
    }

    public Pawn(Player owner) {
        this.owner = owner;
        this.id = idCounter++;
    }

    public Player getOwner() {
        return owner;
    }

    public Integer getId() {
        return id;
    }

    public String toString() {
        return "Pawn [id=" + id + ", owner=" + owner.getName() + "]";
    }
}