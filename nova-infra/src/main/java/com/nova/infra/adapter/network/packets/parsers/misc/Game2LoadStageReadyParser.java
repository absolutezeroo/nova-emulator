package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.Game2LoadStageReadyMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses Game2LoadStageReady packet from client.
 */
@ParsesPacket(Incoming.GAME2LOADSTAGEREADYMESSAGE)
public class Game2LoadStageReadyParser extends PacketParser<Game2LoadStageReadyMessageEvent> {
@Override
    public Game2LoadStageReadyMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new Game2LoadStageReadyMessageEvent();
    }
}
