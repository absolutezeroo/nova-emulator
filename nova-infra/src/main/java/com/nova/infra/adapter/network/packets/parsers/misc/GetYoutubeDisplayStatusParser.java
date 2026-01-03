package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.GetYoutubeDisplayStatusMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GetYoutubeDisplayStatus packet from client.
 */
@ParsesPacket(Incoming.GET_YOUTUBE_DISPLAY_STATUS)
public class GetYoutubeDisplayStatusParser extends PacketParser<GetYoutubeDisplayStatusMessageEvent> {
@Override
    public GetYoutubeDisplayStatusMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetYoutubeDisplayStatusMessageEvent();
    }
}
