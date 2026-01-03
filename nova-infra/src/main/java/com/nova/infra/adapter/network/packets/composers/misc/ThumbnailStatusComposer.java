package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.ThumbnailStatusMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes ThumbnailStatus packet for client.
 */
@ComposesPacket(Outgoing.THUMBNAIL_STATUS)
public class ThumbnailStatusComposer extends PacketComposer<ThumbnailStatusMessage> {
@Override
    protected void write(PacketBuffer packet, ThumbnailStatusMessage message) {
        packet.appendBoolean(message.ok());
        packet.appendBoolean(message.renderLimitHit());
    }
}
