package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetJukeboxPlayListMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GetJukeboxPlayList packet from client.
 */
@ParsesPacket(Incoming.GET_JUKEBOX_PLAYLIST)
public class GetJukeboxPlayListParser extends PacketParser<GetJukeboxPlayListMessageEvent> {
@Override
    public GetJukeboxPlayListMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetJukeboxPlayListMessageEvent();
    }
}
