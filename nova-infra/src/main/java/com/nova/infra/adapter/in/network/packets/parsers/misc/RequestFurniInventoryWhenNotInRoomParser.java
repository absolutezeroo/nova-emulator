package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.RequestFurniInventoryWhenNotInRoomMessageEvent;

/**
 * Parses RequestFurniInventoryWhenNotInRoom packet from client.
 */
public class RequestFurniInventoryWhenNotInRoomParser extends PacketParser<RequestFurniInventoryWhenNotInRoomMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.REQUESTFURNIINVENTORYWHENNOTINROOM;
    }

    @Override
    public RequestFurniInventoryWhenNotInRoomMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RequestFurniInventoryWhenNotInRoomMessageEvent();
    }
}
