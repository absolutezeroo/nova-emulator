package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.NowPlayingMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes NowPlaying packet for client.
 */
@ComposesPacket(Outgoing.NOW_PLAYING)
public class NowPlayingComposer extends PacketComposer<NowPlayingMessage> {
@Override
    protected void write(PacketBuffer packet, NowPlayingMessage message) {
        // No fields to write
    }
}
