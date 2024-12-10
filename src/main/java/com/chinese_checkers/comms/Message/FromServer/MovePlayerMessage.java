package com.chinese_checkers.comms.Message.FromServer;

import com.chinese_checkers.comms.Message.Message;
import com.chinese_checkers.comms.Message.MoveMessage;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PlayerMoveMessage extends Message
{
	// public members go brrrrrr (viva la c++)
	@JsonProperty("playerID")
	public int playerID;
	@JsonProperty("pawnID")
	public int pawnID;
	@JsonProperty("s")
	public int s;
	@JsonProperty("q")
	public int q;
	@JsonProperty("r")
	public int r;

	public PlayerMoveMessage()
	{
		this.type = "move_player";
		this.playerID = -1;
		this.pawnID = -1;
		this.s = 0;
		this.q = 0;
		this.r = 0;
	}

	public PlayerMoveMessage(int playerID, int pawnID, int s, int q, int r)
	{
		this.type = "player_move";
		this.playerID = playerID;
		this.pawnID = pawnID;
		this.s = s;
		this.q = q;
		this.r = r;
	}

	@Override
	public String toString()
	{
		return "";
	}
}