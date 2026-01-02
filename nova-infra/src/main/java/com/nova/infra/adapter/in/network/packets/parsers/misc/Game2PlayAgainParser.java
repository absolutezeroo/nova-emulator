package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.Game2PlayAgainMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

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
