package com.nova.infra.adapter.in.network.packets.parsers.user;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.user.UserFigureMessageEvent;

/**
 * Parses UserFigure packet from client.
 */
public class UserFigureParser extends PacketParser<UserFigureMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.USER_FIGURE;
    }

    @Override
    public UserFigureMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new UserFigureMessageEvent();
    }
}
