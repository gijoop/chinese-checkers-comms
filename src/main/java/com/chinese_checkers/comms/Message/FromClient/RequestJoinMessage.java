package com.chinese_checkers.comms.Message.FromClient;

import com.chinese_checkers.comms.Message.Message;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestJoinMessage extends Message
{
	private String name;

	public RequestJoinMessage()
	{
		this.type = "request_join";
	}

	public RequestJoinMessage(String name)
	{
		this.type = "request_join";
		this.name = name;
	}

	@JsonProperty("name")
	public String getName()
	{
		return name;
	}

	@JsonProperty("name")
	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		return "RequestJoinMessage";
	}
}
