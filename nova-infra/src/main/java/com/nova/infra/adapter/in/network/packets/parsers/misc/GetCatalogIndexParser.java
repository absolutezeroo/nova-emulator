package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetCatalogIndexMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GetCatalogIndex packet from client.
 */
@ParsesPacket(Incoming.GET_CATALOG_INDEX)
public class GetCatalogIndexParser extends PacketParser<GetCatalogIndexMessageEvent> {
@Override
    public GetCatalogIndexMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetCatalogIndexMessageEvent();
    }
}
