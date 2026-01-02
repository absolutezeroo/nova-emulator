package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.Game2CheckGameDirectoryStatusMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses Game2CheckGameDirectoryStatus packet from client.
 */
@ParsesPacket(Incoming.GAME2CHECKGAMEDIRECTORYSTATUSMESSAGE)
public class Game2CheckGameDirectoryStatusParser extends PacketParser<Game2CheckGameDirectoryStatusMessageEvent> {
@Override
    public Game2CheckGameDirectoryStatusMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new Game2CheckGameDirectoryStatusMessageEvent();
    }
}
