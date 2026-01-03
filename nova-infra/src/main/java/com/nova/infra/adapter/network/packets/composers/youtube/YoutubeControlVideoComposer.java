package com.nova.infra.adapter.network.packets.composers.youtube;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.youtube.YoutubeControlVideoMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes YoutubeControlVideo packet for client.
 */
@ComposesPacket(Outgoing.YOUTUBE_CONTROL_VIDEO)
public class YoutubeControlVideoComposer extends PacketComposer<YoutubeControlVideoMessage> {
@Override
    protected void write(PacketBuffer packet, YoutubeControlVideoMessage message) {
        packet.appendInt(message.furniId());
        packet.appendInt(message.commandId());
    }
}
