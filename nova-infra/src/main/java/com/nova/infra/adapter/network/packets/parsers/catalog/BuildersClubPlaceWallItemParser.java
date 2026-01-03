package com.nova.infra.adapter.network.packets.parsers.catalog;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.catalog.BuildersClubPlaceWallItemMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses BuildersClubPlaceWallItem packet from client.
 */
@ParsesPacket(Incoming.BUILDERS_CLUB_PLACE_WALL_ITEM)
public class BuildersClubPlaceWallItemParser extends PacketParser<BuildersClubPlaceWallItemMessageEvent> {
@Override
    public BuildersClubPlaceWallItemMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new BuildersClubPlaceWallItemMessageEvent();
    }
}
