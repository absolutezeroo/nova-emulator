package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.Game2GameChatMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses Game2GameChat packet from client.
 */
@ParsesPacket(Incoming.GAME2GAMECHATMESSAGE)
public class Game2GameChatParser extends PacketParser<Game2GameChatMessageEvent> {
@Override
    public Game2GameChatMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new Game2GameChatMessageEvent();
    }
}
