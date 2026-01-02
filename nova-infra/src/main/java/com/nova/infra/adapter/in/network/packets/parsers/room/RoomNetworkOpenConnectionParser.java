package com.nova.infra.adapter.in.network.packets.parsers.room;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.room.RoomNetworkOpenConnectionMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses RoomNetworkOpenConnection packet from client.
 */
@ParsesPacket(Incoming.ROOM_DIRECTORY_ROOM_NETWORK_OPEN_CONNECTION)
public class RoomNetworkOpenConnectionParser extends PacketParser<RoomNetworkOpenConnectionMessageEvent> {
@Override
    public RoomNetworkOpenConnectionMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomNetworkOpenConnectionMessageEvent();
    }
}
