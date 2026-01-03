package com.nova.infra.adapter.network.packets.parsers.catalog;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.catalog.BuildersClubQueryFurniCountMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses BuildersClubQueryFurniCount packet from client.
 */
@ParsesPacket(Incoming.BUILDERS_CLUB_QUERY_FURNI_COUNT)
public class BuildersClubQueryFurniCountParser extends PacketParser<BuildersClubQueryFurniCountMessageEvent> {
@Override
    public BuildersClubQueryFurniCountMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new BuildersClubQueryFurniCountMessageEvent();
    }
}
