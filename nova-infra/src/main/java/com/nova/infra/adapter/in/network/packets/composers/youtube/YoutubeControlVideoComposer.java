package com.nova.infra.adapter.in.network.packets.composers.youtube;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.youtube.YoutubeControlVideoMessage;

/**
 * Composes YoutubeControlVideo packet for client.
 */
public class YoutubeControlVideoComposer extends PacketComposer<YoutubeControlVideoMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.YOUTUBE_CONTROL_VIDEO;
    }

    @Override
    protected void write(PacketBuffer packet, YoutubeControlVideoMessage message) {
        packet.appendInt(message.furniId());
        packet.appendInt(message.commandId());
    }
}
