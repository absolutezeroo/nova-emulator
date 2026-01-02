package com.nova.infra.adapter.in.network.packets.parsers.room;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.room.RemoveAllRightsMessageEvent;

/**
 * Parses RemoveAllRights packet from client.
 */
public class RemoveAllRightsParser extends PacketParser<RemoveAllRightsMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.ROOM_RIGHTS_REMOVE_ALL;
    }

    @Override
    public RemoveAllRightsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RemoveAllRightsMessageEvent();
    }
}
