package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.Game2GameChatMessageEvent;

/**
 * Parses Game2GameChat packet from client.
 */
public class Game2GameChatParser extends PacketParser<Game2GameChatMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GAME2GAMECHATMESSAGE;
    }

    @Override
    public Game2GameChatMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new Game2GameChatMessageEvent();
    }
}
