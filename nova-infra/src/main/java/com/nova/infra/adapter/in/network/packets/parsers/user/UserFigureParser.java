package com.nova.infra.adapter.in.network.packets.parsers.user;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.user.UserFigureMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

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
