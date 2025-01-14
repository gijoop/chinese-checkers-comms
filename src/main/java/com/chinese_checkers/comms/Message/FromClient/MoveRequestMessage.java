package com.chinese_checkers.comms.Message.FromClient;

import com.chinese_checkers.comms.Message.Message;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MoveRequestMessage extends Message
{
	// public members go brrrrrr (viva la c++)
	@JsonProperty("pawnID")
	public int pawnID;
	@JsonProperty("x")
	public int x;
	@JsonProperty("y")
	public int y;

	public MoveRequestMessage()
	{
		this.type = "move_request";
		this.pawnID = -1;
		this.x = 0;
		this.y = 0;
	}

	public MoveRequestMessage(int pawnID, int x, int y)
	{
		this.type = "move_request";
		this.pawnID = pawnID;
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString()
	{
		return "MoveRequestMessage [pawn=" + pawnID + ": x=" + x + ", y=" + y + "]";
	}
}
