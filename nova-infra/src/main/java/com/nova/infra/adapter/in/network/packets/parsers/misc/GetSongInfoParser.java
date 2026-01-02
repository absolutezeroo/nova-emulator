package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetSongInfoMessageEvent;

/**
 * Parses GetSongInfo packet from client.
 */
public class GetSongInfoParser extends PacketParser<GetSongInfoMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GET_SONG_INFO;
    }

    @Override
    public GetSongInfoMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetSongInfoMessageEvent();
    }
}
