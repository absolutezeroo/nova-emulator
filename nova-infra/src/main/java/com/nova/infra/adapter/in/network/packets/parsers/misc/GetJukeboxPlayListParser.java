package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetJukeboxPlayListMessageEvent;

/**
 * Parses GetJukeboxPlayList packet from client.
 */
public class GetJukeboxPlayListParser extends PacketParser<GetJukeboxPlayListMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GET_JUKEBOX_PLAYLIST;
    }

    @Override
    public GetJukeboxPlayListMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetJukeboxPlayListMessageEvent();
    }
}
