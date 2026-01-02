package com.nova.infra.adapter.in.network.packets.composers.youtube;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.youtube.YoutubeDisplayPlaylistsMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes YoutubeDisplayPlaylists packet for client.
 */
@ComposesPacket(Outgoing.YOUTUBE_DISPLAY_PLAYLISTS)
public class YoutubeDisplayPlaylistsComposer extends PacketComposer<YoutubeDisplayPlaylistsMessage> {
@Override
    protected void write(PacketBuffer packet, YoutubeDisplayPlaylistsMessage message) {
        // No fields to write
    }
}
