package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.Game2PlayAgainMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses Game2PlayAgain packet from client.
 */
@ParsesPacket(Incoming.GAME2PLAYAGAINMESSAGE)
public class Game2PlayAgainParser extends PacketParser<Game2PlayAgainMessageEvent> {
@Override
    public Game2PlayAgainMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new Game2PlayAgainMessageEvent();
    }
}
