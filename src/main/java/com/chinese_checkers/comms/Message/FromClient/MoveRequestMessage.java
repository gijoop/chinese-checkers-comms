package com.chinese_checkers.comms.Message.FromClient;

import com.chinese_checkers.comms.Message.Message;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MoveRequestMessage extends Message
{
	// public members go brrrrrr (viva la c++)
	@JsonProperty("pawnID")
	public int pawnID;
	@JsonProperty("s")
	public int s;
	@JsonProperty("q")
	public int q;
	@JsonProperty("r")
	public int r;

	public MoveRequestMessage()
	{
		this.type = "move_request";
		this.pawnID = -1;
		this.s = 0;
		this.q = 0;
		this.r = 0;
	}

	public MoveRequestMessage(int pawnID, int s, int q, int r)
	{
		this.type = "move_request";
		this.pawnID = pawnID;
		this.s = s;
		this.q = q;
		this.r = r;
	}

	@Override
	public String toString()
	{
		return "MoveRequestMessage [pawn=" + pawnID + ": s=" + s + ", q=" + q + ", r=" + r + "]";
	}
}
