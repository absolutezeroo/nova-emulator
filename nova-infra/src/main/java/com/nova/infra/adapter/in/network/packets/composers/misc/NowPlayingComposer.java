package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.NowPlayingMessage;

/**
 * Composes NowPlaying packet for client.
 */
public class NowPlayingComposer extends PacketComposer<NowPlayingMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.NOW_PLAYING;
    }

    @Override
    protected void write(PacketBuffer packet, NowPlayingMessage message) {
        // No fields to write
    }
}
