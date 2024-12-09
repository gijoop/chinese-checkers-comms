package com.chinese_checkers.comms.Message.FromClient;

import com.chinese_checkers.comms.Message.Message;

public class RequestRefreshMessage extends Message
{
	public RequestRefreshMessage()
	{
		this.type = "request_refresh";
	}

	@Override
	public String toString()
	{
		return "";
	}
}
