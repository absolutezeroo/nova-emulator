package com.nova.infra.adapter.in.network.packets.parsers.user;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.user.RoomUsersClassificationMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses RoomUsersClassification packet from client.
 */
@ParsesPacket(Incoming.USER_CLASSIFICATION)
public class RoomUsersClassificationParser extends PacketParser<RoomUsersClassificationMessageEvent> {
@Override
    public RoomUsersClassificationMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomUsersClassificationMessageEvent();
    }
}
