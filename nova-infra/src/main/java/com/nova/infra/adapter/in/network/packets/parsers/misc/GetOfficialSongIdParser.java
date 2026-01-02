package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetOfficialSongIdMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GetOfficialSongId packet from client.
 */
@ParsesPacket(Incoming.GET_OFFICIAL_SONG_ID)
public class GetOfficialSongIdParser extends PacketParser<GetOfficialSongIdMessageEvent> {
@Override
    public GetOfficialSongIdMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetOfficialSongIdMessageEvent();
    }
}
