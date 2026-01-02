package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.Game2PlayAgainMessageEvent;

/**
 * Parses Game2PlayAgain packet from client.
 */
public class Game2PlayAgainParser extends PacketParser<Game2PlayAgainMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GAME2PLAYAGAINMESSAGE;
    }

    @Override
    public Game2PlayAgainMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new Game2PlayAgainMessageEvent();
    }
}
