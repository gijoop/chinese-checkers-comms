package com.chinese_checkers.comms;

public class Pawn {
    public static int idCounter = 100;

    private Player.PawnColor color;
    private Player owner;
    private Integer id;

    public Pawn(Player owner) {
        this.color = owner.getPawnColor();
        this.owner = owner;
        this.id = idCounter++;
    }

    public Player.PawnColor getColor() {
        return color;
    }

    public Player getOwner() {
        return owner;
    }

    public Integer getId() {
        return id;
    }
}