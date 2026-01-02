package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetGameListMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GetGameList packet from client.
 */
@ParsesPacket(Incoming.GAMES_LIST)
public class GetGameListParser extends PacketParser<GetGameListMessageEvent> {
@Override
    public GetGameListMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetGameListMessageEvent();
    }
}
