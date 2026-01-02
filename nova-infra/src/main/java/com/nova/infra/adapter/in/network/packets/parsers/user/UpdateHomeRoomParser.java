package com.nova.infra.adapter.in.network.packets.parsers.user;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.user.UpdateHomeRoomMessageEvent;

/**
 * Parses UpdateHomeRoom packet from client.
 */
public class UpdateHomeRoomParser extends PacketParser<UpdateHomeRoomMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.USER_HOME_ROOM;
    }

    @Override
    public UpdateHomeRoomMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new UpdateHomeRoomMessageEvent();
    }
}
