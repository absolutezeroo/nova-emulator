package com.nova.infra.adapter.network.packets.composers.furniture;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.furniture.RequestSpamWallPostItMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes RequestSpamWallPostIt packet for client.
 */
@ComposesPacket(Outgoing.FURNITURE_POSTIT_STICKY_POLE_OPEN)
public class RequestSpamWallPostItComposer extends PacketComposer<RequestSpamWallPostItMessage> {
@Override
    protected void write(PacketBuffer packet, RequestSpamWallPostItMessage message) {
        packet.appendInt(message.itemId());
        packet.appendString(message.location());
    }
}
