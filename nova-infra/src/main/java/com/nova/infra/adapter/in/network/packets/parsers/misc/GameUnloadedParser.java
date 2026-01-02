package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GameUnloadedMessageEvent;

/**
 * Parses GameUnloaded packet from client.
 */
public class GameUnloadedParser extends PacketParser<GameUnloadedMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GAMEUNLOADEDMESSAGE;
    }

    @Override
    public GameUnloadedMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GameUnloadedMessageEvent();
    }
}
