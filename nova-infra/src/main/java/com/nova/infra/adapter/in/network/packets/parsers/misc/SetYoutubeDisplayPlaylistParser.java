package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.SetYoutubeDisplayPlaylistMessageEvent;

/**
 * Parses SetYoutubeDisplayPlaylist packet from client.
 */
public class SetYoutubeDisplayPlaylistParser extends PacketParser<SetYoutubeDisplayPlaylistMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.SET_YOUTUBE_DISPLAY_PLAYLIST;
    }

    @Override
    public SetYoutubeDisplayPlaylistMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new SetYoutubeDisplayPlaylistMessageEvent();
    }
}
