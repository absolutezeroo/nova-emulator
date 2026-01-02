package com.nova.infra.adapter.in.network.packets.parsers.group;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.group.CatalogGroupsMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses CatalogGroups packet from client.
 */
@ParsesPacket(Incoming.GROUP_MEMBERSHIPS)
public class CatalogGroupsParser extends PacketParser<CatalogGroupsMessageEvent> {
@Override
    public CatalogGroupsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new CatalogGroupsMessageEvent();
    }
}
