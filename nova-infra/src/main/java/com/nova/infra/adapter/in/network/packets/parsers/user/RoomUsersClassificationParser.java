package com.nova.infra.adapter.in.network.packets.parsers.user;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.user.RoomUsersClassificationMessageEvent;

/**
 * Parses RoomUsersClassification packet from client.
 */
public class RoomUsersClassificationParser extends PacketParser<RoomUsersClassificationMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.USER_CLASSIFICATION;
    }

    @Override
    public RoomUsersClassificationMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomUsersClassificationMessageEvent();
    }
}
