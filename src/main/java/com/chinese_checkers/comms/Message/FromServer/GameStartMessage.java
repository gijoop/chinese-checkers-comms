package com.chinese_checkers.comms.Message.FromServer;

import com.chinese_checkers.comms.Message.Message;



public class GameStartMessage extends Message
{
	public GameStartMessage()
	{
		type = "game_start";
	}

	@Override
	public String toString()
	{
		return "GameStartMessage";
	}
}
