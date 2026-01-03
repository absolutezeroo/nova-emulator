package com.nova.infra.adapter.network.packets.parsers.catalog;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.catalog.BuildersClubPlaceRoomItemMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses BuildersClubPlaceRoomItem packet from client.
 */
@ParsesPacket(Incoming.BUILDERS_CLUB_PLACE_ROOM_ITEM)
public class BuildersClubPlaceRoomItemParser extends PacketParser<BuildersClubPlaceRoomItemMessageEvent> {
@Override
    public BuildersClubPlaceRoomItemMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new BuildersClubPlaceRoomItemMessageEvent();
    }
}
