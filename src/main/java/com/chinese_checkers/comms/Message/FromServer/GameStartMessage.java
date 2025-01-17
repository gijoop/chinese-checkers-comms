package com.chinese_checkers.comms.Message.FromServer;

import java.util.HashMap;

import com.chinese_checkers.comms.Pawn;
import com.chinese_checkers.comms.Position;
import com.chinese_checkers.comms.Message.Message;
import com.chinese_checkers.comms.Message.PositionKeyDeserializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class GameStartMessage extends Message

{	
	@JsonDeserialize(keyUsing = PositionKeyDeserializer.class)
	private HashMap<Position, Pawn> pawns;

	@JsonProperty("board_size")
	private int boardSize;

	@JsonProperty("variant")
	private String variant;

	public GameStartMessage()
	{
		this.type = "game_start";
		this.pawns = new HashMap<Position, Pawn>();
		this.boardSize = 0;
	}

	public GameStartMessage(int boardSize)
	{
		this.type = "game_start";
		this.pawns = new HashMap<Position, Pawn>();
		this.boardSize = boardSize;
	}

	public GameStartMessage(HashMap<Position, Pawn> pawns)
	{
		this.type = "game_start";
		this.pawns = pawns;
	}

	public GameStartMessage(String variant)
	{
		this.type = "game_start";
		this.pawns = new HashMap<Position, Pawn>();
		this.variant = variant;
		this.boardSize = 0;
	}

	public HashMap<Position, Pawn> getPawns()
	{
		return pawns;
	}

	public void addPawn(Position position, Pawn pawn)
	{
		pawns.put(position, pawn);
	}

	@JsonProperty("board_size")
	public int getBoardSize()
	{
		return boardSize;
	}

	@JsonProperty("variant")
	public String getVariant()
	{
		return variant;
	}

	public void setBoardSize(int boardSize)
	{
		this.boardSize = boardSize;
	}

	public void setVariant(String variant)
	{
		this.variant = variant;
	}

	@Override
	public String toString()
	{
		return "GameStartMessage";
	}
	
}
