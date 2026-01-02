package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetNowPlayingMessageEvent;

/**
 * Parses GetNowPlaying packet from client.
 */
public class GetNowPlayingParser extends PacketParser<GetNowPlayingMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GET_NOW_PLAYING;
    }

    @Override
    public GetNowPlayingMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetNowPlayingMessageEvent();
    }
}
