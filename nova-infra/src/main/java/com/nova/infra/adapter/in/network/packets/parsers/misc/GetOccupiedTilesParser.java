package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetOccupiedTilesMessageEvent;

/**
 * Parses GetOccupiedTiles packet from client.
 */
public class GetOccupiedTilesParser extends PacketParser<GetOccupiedTilesMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GET_OCCUPIED_TILES;
    }

    @Override
    public GetOccupiedTilesMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetOccupiedTilesMessageEvent();
    }
}
