package com.chinese_checkers.comms.Message.FromServer;

import com.chinese_checkers.comms.Message.Message;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SelfDataMessage extends Message
{
	@JsonProperty("playerID")
	private int playerID;

	public SelfDataMessage()
	{
		this.type = "self_data";
		this.playerID = -1;
	}

	public SelfDataMessage(int playerID)
	{
		this.type = "self_data";
		this.playerID = playerID;
	}

	@JsonProperty("playerID")
	public int getPlayerID()
	{
		return playerID;
	}

	@JsonProperty("playerID")
	public void setPlayerID(int playerID)
	{
		this.playerID = playerID;
	}

	@Override
	public String toString()
	{
		return "";
	}
}
