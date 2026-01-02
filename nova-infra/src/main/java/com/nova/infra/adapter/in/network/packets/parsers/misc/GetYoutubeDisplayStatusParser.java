package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetYoutubeDisplayStatusMessageEvent;

/**
 * Parses GetYoutubeDisplayStatus packet from client.
 */
public class GetYoutubeDisplayStatusParser extends PacketParser<GetYoutubeDisplayStatusMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GET_YOUTUBE_DISPLAY_STATUS;
    }

    @Override
    public GetYoutubeDisplayStatusMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetYoutubeDisplayStatusMessageEvent();
    }
}
