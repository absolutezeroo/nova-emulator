package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.SetYoutubeDisplayPlaylistMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses SetYoutubeDisplayPlaylist packet from client.
 */
@ParsesPacket(Incoming.SET_YOUTUBE_DISPLAY_PLAYLIST)
public class SetYoutubeDisplayPlaylistParser extends PacketParser<SetYoutubeDisplayPlaylistMessageEvent> {
@Override
    public SetYoutubeDisplayPlaylistMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new SetYoutubeDisplayPlaylistMessageEvent();
    }
}
