package com.chinese_checkers.comms.Message.FromServer;

import com.chinese_checkers.comms.Message.Message;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AnnounceWinnerMessage extends Message
{
	int player_id;
	int place;

	public AnnounceWinnerMessage()
	{
		this.type = "announce_winner";
		this.player_id = -1;
		this.place = -1;
	}

	public AnnounceWinnerMessage(int player_id, int place)
	{
		this.type = "announce_winner";
		this.player_id = player_id;
		this.place = place;
	}

	@JsonProperty("player_id")
	public int getPlayerID()
	{
		return player_id;
	}

	@JsonProperty("place")
	public int getPlace()
	{
		return place;
	}

	@Override
	public String toString()
	{
		return "GameEndMessage: [player_id: " + player_id + ", place: " + place + "]";
	}
}
