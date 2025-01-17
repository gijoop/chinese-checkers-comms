package com.chinese_checkers.comms;

/**
 * Represents a pawn in the Chinese Checkers game.
 */
public class Pawn {
    public static int idCounter = 100;

    private Player owner;
    private Integer id;

    /**
     * Constructs a Pawn with no owner and a unique id.
     */
    public Pawn() {
        this.owner = null;
        this.id = idCounter++;
    }

    /**
     * Constructs a Pawn with the specified owner and a unique id.
     *
     * @param owner the owner of the pawn
     */
    public Pawn(Player owner) {
        this.owner = owner;
        this.id = idCounter++;
    }

    /**
     * Returns the owner of the pawn.
     *
     * @return the owner of the pawn
     */
    public Player getOwner() {
        return owner;
    }

    /**
     * Returns the id of the pawn.
     *
     * @return the id of the pawn
     */
    public Integer getId() {
        return id;
    }

    /**
     * Returns a string representation of the pawn.
     *
     * @return a string representation of the pawn in the format "Pawn [id=ID, owner=OWNER_NAME]"
     */
    @Override
    public String toString() {
        return "Pawn [id=" + id + ", owner=" + (owner != null ? owner.getName() : "null") + "]";
    }
}