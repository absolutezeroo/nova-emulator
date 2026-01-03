package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.ControlYoutubeDisplayPlaybackMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses ControlYoutubeDisplayPlayback packet from client.
 */
@ParsesPacket(Incoming.CONTROL_YOUTUBE_DISPLAY_PLAYBACK)
public class ControlYoutubeDisplayPlaybackParser extends PacketParser<ControlYoutubeDisplayPlaybackMessageEvent> {
@Override
    public ControlYoutubeDisplayPlaybackMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ControlYoutubeDisplayPlaybackMessageEvent();
    }
}
