package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.RoomThumbnailUpdateResultMessage;

/**
 * Composes RoomThumbnailUpdateResult packet for client.
 */
public class RoomThumbnailUpdateResultComposer extends PacketComposer<RoomThumbnailUpdateResultMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.THUMBNAIL_UPDATE_RESULT;
    }

    @Override
    protected void write(PacketBuffer packet, RoomThumbnailUpdateResultMessage message) {
        // No fields to write
    }
}
