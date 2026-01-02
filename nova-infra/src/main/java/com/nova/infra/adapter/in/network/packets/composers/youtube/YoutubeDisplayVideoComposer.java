package com.nova.infra.adapter.in.network.packets.composers.youtube;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.youtube.YoutubeDisplayVideoMessage;

/**
 * Composes YoutubeDisplayVideo packet for client.
 */
public class YoutubeDisplayVideoComposer extends PacketComposer<YoutubeDisplayVideoMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.YOUTUBE_DISPLAY_VIDEO;
    }

    @Override
    protected void write(PacketBuffer packet, YoutubeDisplayVideoMessage message) {
        // No fields to write
    }
}
