package com.chinese_checkers.comms.Message.FromServer;

import com.chinese_checkers.comms.Message.Message;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MovePlayerMessage extends Message
{
	// public members go brrrrrr (viva la c++)
	@JsonProperty("playerID")
	public int playerID;
	@JsonProperty("pawnID")
	public int pawnID;
	@JsonProperty("x")
	public int x;
	@JsonProperty("y")
	public int y;

	public MovePlayerMessage()
	{
		this.type = "move_player";
		this.playerID = -1;
		this.pawnID = -1;
		this.x = 0;
		this.y = 0;
	}

	public MovePlayerMessage(int playerID, int pawnID, int x, int y)
	{
		this.type = "move_player";
		this.playerID = playerID;
		this.pawnID = pawnID;
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString()
	{
		return "";
	}
}
