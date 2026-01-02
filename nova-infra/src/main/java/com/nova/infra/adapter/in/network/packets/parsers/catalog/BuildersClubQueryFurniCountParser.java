package com.nova.infra.adapter.in.network.packets.parsers.catalog;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.catalog.BuildersClubQueryFurniCountMessageEvent;

/**
 * Parses BuildersClubQueryFurniCount packet from client.
 */
public class BuildersClubQueryFurniCountParser extends PacketParser<BuildersClubQueryFurniCountMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.BUILDERS_CLUB_QUERY_FURNI_COUNT;
    }

    @Override
    public BuildersClubQueryFurniCountMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new BuildersClubQueryFurniCountMessageEvent();
    }
}
