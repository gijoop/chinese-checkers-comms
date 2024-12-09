package com.chinese_checkers.comms.Message.FromClient;

import com.chinese_checkers.comms.Message.Message;

public class DisconnectMessage extends Message
{
	public DisconnectMessage()
	{
		this.type = "disconnect";
	}

	@Override
	public String toString()
	{
		return "";
	}
}
