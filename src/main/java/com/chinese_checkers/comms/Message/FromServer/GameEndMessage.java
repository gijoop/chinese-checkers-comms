package com.chinese_checkers.comms.Message.FromServer;

import com.chinese_checkers.comms.Message.Message;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GameEndMessage extends Message
{
	String reason;

	public GameEndMessage()
	{
		this.type = "game_end";
		this.reason = "";
	}

	public GameEndMessage(String reason)
	{
		this.type = "game_end";
		this.reason = reason;
	}

	@JsonProperty("reason")
	public String getReason()
	{
		return reason;
	}

	@JsonProperty("reason")
	public void setReason(String reason)
	{
		this.reason = reason;
	}

	@Override
	public String toString()
	{
		return "GameEndMessage: (reason: " + reason + ")";
	}
}
