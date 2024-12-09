package com.chinese_checkers.comms.Message.FromServer;

import com.chinese_checkers.comms.Message.Message;
import com.fasterxml.jackson.annotation.JsonProperty;



public class NextRoundMessage extends Message
{
	int currentPlayerID;

	public NextRoundMessage()
	{
		this.type = "next_round";
		this.currentPlayerID = -1;
	}

	public NextRoundMessage(int currentPlayerID)
	{
		this.type = "next_round";
		this.currentPlayerID = currentPlayerID;
	}

	@JsonProperty("currentPlayerID")
	public int getCurrentPlayerID()
	{
		return currentPlayerID;
	}

	@JsonProperty("currentPlayerID")
	public void setCurrentPlayerID(int currentPlayerID)
	{
		this.currentPlayerID = currentPlayerID;
	}

	@Override
	public String toString()
	{
		return "NextRoundMessage [currentPlayerID=" + currentPlayerID + "]";
	}
}
