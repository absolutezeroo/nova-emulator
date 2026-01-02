package com.nova.infra.adapter.in.network.packets.parsers.room;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.room.RoomNetworkOpenConnectionMessageEvent;

/**
 * Parses RoomNetworkOpenConnection packet from client.
 */
public class RoomNetworkOpenConnectionParser extends PacketParser<RoomNetworkOpenConnectionMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.ROOM_DIRECTORY_ROOM_NETWORK_OPEN_CONNECTION;
    }

    @Override
    public RoomNetworkOpenConnectionMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomNetworkOpenConnectionMessageEvent();
    }
}
