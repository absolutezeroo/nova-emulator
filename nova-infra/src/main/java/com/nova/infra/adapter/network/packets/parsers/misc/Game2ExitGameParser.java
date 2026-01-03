package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.Game2ExitGameMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses Game2ExitGame packet from client.
 */
@ParsesPacket(Incoming.GAME2EXITGAMEMESSAGE)
public class Game2ExitGameParser extends PacketParser<Game2ExitGameMessageEvent> {
@Override
    public Game2ExitGameMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new Game2ExitGameMessageEvent();
    }
}
