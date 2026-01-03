package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.Game2RequestFullStatusUpdateMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses Game2RequestFullStatusUpdate packet from client.
 */
@ParsesPacket(Incoming.GAME2REQUESTFULLSTATUSUPDATEMESSAGE)
public class Game2RequestFullStatusUpdateParser extends PacketParser<Game2RequestFullStatusUpdateMessageEvent> {
@Override
    public Game2RequestFullStatusUpdateMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new Game2RequestFullStatusUpdateMessageEvent();
    }
}
