package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.GetOccupiedTilesMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GetOccupiedTiles packet from client.
 */
@ParsesPacket(Incoming.GET_OCCUPIED_TILES)
public class GetOccupiedTilesParser extends PacketParser<GetOccupiedTilesMessageEvent> {
@Override
    public GetOccupiedTilesMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetOccupiedTilesMessageEvent();
    }
}
