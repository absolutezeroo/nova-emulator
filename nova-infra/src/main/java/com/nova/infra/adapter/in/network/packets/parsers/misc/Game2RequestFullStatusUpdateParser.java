package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.Game2RequestFullStatusUpdateMessageEvent;

/**
 * Parses Game2RequestFullStatusUpdate packet from client.
 */
public class Game2RequestFullStatusUpdateParser extends PacketParser<Game2RequestFullStatusUpdateMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GAME2REQUESTFULLSTATUSUPDATEMESSAGE;
    }

    @Override
    public Game2RequestFullStatusUpdateMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new Game2RequestFullStatusUpdateMessageEvent();
    }
}
