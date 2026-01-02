package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.Game2CheckGameDirectoryStatusMessageEvent;

/**
 * Parses Game2CheckGameDirectoryStatus packet from client.
 */
public class Game2CheckGameDirectoryStatusParser extends PacketParser<Game2CheckGameDirectoryStatusMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GAME2CHECKGAMEDIRECTORYSTATUSMESSAGE;
    }

    @Override
    public Game2CheckGameDirectoryStatusMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new Game2CheckGameDirectoryStatusMessageEvent();
    }
}
