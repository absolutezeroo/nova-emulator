package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.Game2ExitGameMessageEvent;

/**
 * Parses Game2ExitGame packet from client.
 */
public class Game2ExitGameParser extends PacketParser<Game2ExitGameMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GAME2EXITGAMEMESSAGE;
    }

    @Override
    public Game2ExitGameMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new Game2ExitGameMessageEvent();
    }
}
