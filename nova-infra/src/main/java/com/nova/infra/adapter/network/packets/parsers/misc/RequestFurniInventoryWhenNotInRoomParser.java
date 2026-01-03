package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.RequestFurniInventoryWhenNotInRoomMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses RequestFurniInventoryWhenNotInRoom packet from client.
 */
@ParsesPacket(Incoming.REQUESTFURNIINVENTORYWHENNOTINROOM)
public class RequestFurniInventoryWhenNotInRoomParser extends PacketParser<RequestFurniInventoryWhenNotInRoomMessageEvent> {
@Override
    public RequestFurniInventoryWhenNotInRoomMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RequestFurniInventoryWhenNotInRoomMessageEvent();
    }
}
