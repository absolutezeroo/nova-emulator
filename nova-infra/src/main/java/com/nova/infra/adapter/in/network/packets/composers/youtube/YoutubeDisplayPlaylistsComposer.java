package com.nova.infra.adapter.in.network.packets.composers.youtube;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.youtube.YoutubeDisplayPlaylistsMessage;

/**
 * Composes YoutubeDisplayPlaylists packet for client.
 */
public class YoutubeDisplayPlaylistsComposer extends PacketComposer<YoutubeDisplayPlaylistsMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.YOUTUBE_DISPLAY_PLAYLISTS;
    }

    @Override
    protected void write(PacketBuffer packet, YoutubeDisplayPlaylistsMessage message) {
        // No fields to write
    }
}
