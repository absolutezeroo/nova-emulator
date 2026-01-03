package com.nova.infra.adapter.network.packets.parsers.user;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.user.UserFigureMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses UserFigure packet from client.
 */
@ParsesPacket(Incoming.USER_FIGURE)
public class UserFigureParser extends PacketParser<UserFigureMessageEvent> {
@Override
    public UserFigureMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new UserFigureMessageEvent();
    }
}
