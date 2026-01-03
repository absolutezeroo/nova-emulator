package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.GetOfficialSongIdMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

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
