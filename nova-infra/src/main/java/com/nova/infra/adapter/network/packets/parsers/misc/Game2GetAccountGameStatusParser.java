package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.Game2GetAccountGameStatusMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses Game2GetAccountGameStatus packet from client.
 */
@ParsesPacket(Incoming.GAME2GETACCOUNTGAMESTATUSMESSAGE)
public class Game2GetAccountGameStatusParser extends PacketParser<Game2GetAccountGameStatusMessageEvent> {
@Override
    public Game2GetAccountGameStatusMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new Game2GetAccountGameStatusMessageEvent();
    }
}
