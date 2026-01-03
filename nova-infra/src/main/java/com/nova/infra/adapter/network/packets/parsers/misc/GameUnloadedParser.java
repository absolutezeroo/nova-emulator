package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.GameUnloadedMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GameUnloaded packet from client.
 */
@ParsesPacket(Incoming.GAMEUNLOADEDMESSAGE)
public class GameUnloadedParser extends PacketParser<GameUnloadedMessageEvent> {
@Override
    public GameUnloadedMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GameUnloadedMessageEvent();
    }
}
