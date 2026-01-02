package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.ThumbnailStatusMessage;

/**
 * Composes ThumbnailStatus packet for client.
 */
public class ThumbnailStatusComposer extends PacketComposer<ThumbnailStatusMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.THUMBNAIL_STATUS;
    }

    @Override
    protected void write(PacketBuffer packet, ThumbnailStatusMessage message) {
        packet.appendBoolean(message.ok());
        packet.appendBoolean(message.renderLimitHit());
    }
}
