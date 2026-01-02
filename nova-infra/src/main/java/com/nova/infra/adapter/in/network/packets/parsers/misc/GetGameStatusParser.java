package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetGameStatusMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GetGameStatus packet from client.
 */
@ParsesPacket(Incoming.GETGAMESTATUSMESSAGE)
public class GetGameStatusParser extends PacketParser<GetGameStatusMessageEvent> {
@Override
    public GetGameStatusMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetGameStatusMessageEvent();
    }
}
