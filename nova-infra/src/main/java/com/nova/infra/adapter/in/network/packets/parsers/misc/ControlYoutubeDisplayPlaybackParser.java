package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.ControlYoutubeDisplayPlaybackMessageEvent;

/**
 * Parses ControlYoutubeDisplayPlayback packet from client.
 */
public class ControlYoutubeDisplayPlaybackParser extends PacketParser<ControlYoutubeDisplayPlaybackMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.CONTROL_YOUTUBE_DISPLAY_PLAYBACK;
    }

    @Override
    public ControlYoutubeDisplayPlaybackMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ControlYoutubeDisplayPlaybackMessageEvent();
    }
}
