package com.chinese_checkers.comms.Message.FromServer;

import com.chinese_checkers.comms.Message.Message;
import com.fasterxml.jackson.annotation.JsonProperty;



public class ResponseMessage extends Message
{
	public enum Status
	{
		SUCCESS, FAILURE, ERROR, GAME_OVER
	}

	@JsonProperty
	String toWhatAction;

	String message;
	Status status;

	public ResponseMessage()
	{
		this.type = "response";
		this.toWhatAction = "";
		this.message = "";
	}

	public ResponseMessage(String toWhatAction, Status status, String message)
	{
		this.type = "response";
		this.toWhatAction = toWhatAction; // TODO: replace with enum in the future
		this.message = message;
		this.status = status;
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

	@JsonProperty("status")
	public Status getStatus()
	{
		return status;
	}

	@JsonProperty("status")
	public void setStatus(Status status)
	{
		this.status = status;
	}

	@Override
	public String toString()
	{
		return "ResponseMessage: " + toWhatAction + ": \"" + message + "\"";
	}
}
