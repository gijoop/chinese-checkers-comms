package com.chinese_checkers.comms.Message.FromServer;

import com.chinese_checkers.comms.Message.Message;
import com.fasterxml.jackson.annotation.JsonProperty;



public class ResponseMessage extends Message
{
	String toWhatAction;

	// TODO: replace with enum in the future
	// message can be:
	// - "success"
	// - "failure"
	// - "error"
	String message;

	public ResponseMessage()
	{
		this.type = "response";
		this.toWhatAction = "";
		this.message = "";
	}

	public ResponseMessage(String toWhatAction, String message)
	{
		this.type = "response";
		this.toWhatAction = toWhatAction; // TODO: replace with enum in the future
		this.message = message;
	}

	@JsonProperty("toWhatAction")
	public String getToWhatAction()
	{
		return toWhatAction;
	}

	@JsonProperty("toWhatAction")
	public void setToWhatAction(String toWhatAction)
	{
		this.toWhatAction = toWhatAction;
	}

	@JsonProperty("message")
	public String getMessage()
	{
		return message;
	}

	@JsonProperty("message")
	public void setMessage(String message)
	{
		this.message = message;
	}

	@Override
	public String toString()
	{
		return "ResponseMessage: " + toWhatAction + ": \"" + message + "\"";
	}
}
