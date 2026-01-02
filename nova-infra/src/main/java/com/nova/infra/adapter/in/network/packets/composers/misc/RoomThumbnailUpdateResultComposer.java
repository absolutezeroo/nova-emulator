package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.RoomThumbnailUpdateResultMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes RoomThumbnailUpdateResult packet for client.
 */
@ComposesPacket(Outgoing.THUMBNAIL_UPDATE_RESULT)
public class RoomThumbnailUpdateResultComposer extends PacketComposer<RoomThumbnailUpdateResultMessage> {
@Override
    protected void write(PacketBuffer packet, RoomThumbnailUpdateResultMessage message) {
        // No fields to write
    }
}
