package com.chinese_checkers.comms.Message.FromServer;

import java.util.HashMap;

import com.chinese_checkers.comms.Pawn;
import com.chinese_checkers.comms.Position;
import com.chinese_checkers.comms.Message.Message;

public class GameStartMessage extends Message
{
	private HashMap<Position, Pawn> pawns;

	public GameStartMessage()
	{
		this.type = "game_start";
		this.pawns = new HashMap<>();
	}

	public GameStartMessage(HashMap<Position, Pawn> pawns)
	{
		this.type = "game_start";
		this.pawns = pawns;
	}

	public HashMap<Position, Pawn> getPawns()
	{
		return pawns;
	}

	public void addPawn(Position position, Pawn pawn)
	{
		pawns.put(position, pawn);
	}

	@Override
	public String toString()
	{
		return "GameStartMessage";
	}
	
}
