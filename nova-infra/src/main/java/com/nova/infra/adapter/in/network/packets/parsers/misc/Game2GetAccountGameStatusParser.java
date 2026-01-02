package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.Game2GetAccountGameStatusMessageEvent;

/**
 * Parses Game2GetAccountGameStatus packet from client.
 */
public class Game2GetAccountGameStatusParser extends PacketParser<Game2GetAccountGameStatusMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GAME2GETACCOUNTGAMESTATUSMESSAGE;
    }

    @Override
    public Game2GetAccountGameStatusMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new Game2GetAccountGameStatusMessageEvent();
    }
}
