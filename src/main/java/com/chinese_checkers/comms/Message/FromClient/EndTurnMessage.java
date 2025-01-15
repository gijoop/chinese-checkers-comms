package com.chinese_checkers.comms.Message.FromClient;

import com.chinese_checkers.comms.Message.Message;

public class EndTurnMessage extends Message
{
    public EndTurnMessage()
    {
        this.type = "end_turn";
    }

    @Override
    public String toString()
    {
        return "EndTurnMessage";
    }

}
