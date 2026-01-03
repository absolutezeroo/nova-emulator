package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.GetNowPlayingMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GetNowPlaying packet from client.
 */
@ParsesPacket(Incoming.GET_NOW_PLAYING)
public class GetNowPlayingParser extends PacketParser<GetNowPlayingMessageEvent> {
@Override
    public GetNowPlayingMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetNowPlayingMessageEvent();
    }
}
