package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetUserSongDisksMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GetUserSongDisks packet from client.
 */
@ParsesPacket(Incoming.GET_USER_SONG_DISKS)
public class GetUserSongDisksParser extends PacketParser<GetUserSongDisksMessageEvent> {
@Override
    public GetUserSongDisksMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetUserSongDisksMessageEvent();
    }
}
