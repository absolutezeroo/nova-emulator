package com.nova.infra.adapter.in.network.packets.composers.furniture;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.furniture.RequestSpamWallPostItMessage;

/**
 * Composes RequestSpamWallPostIt packet for client.
 */
public class RequestSpamWallPostItComposer extends PacketComposer<RequestSpamWallPostItMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.FURNITURE_POSTIT_STICKY_POLE_OPEN;
    }

    @Override
    protected void write(PacketBuffer packet, RequestSpamWallPostItMessage message) {
        packet.appendInt(message.itemId());
        packet.appendString(message.location());
    }
}
