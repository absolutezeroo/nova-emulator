package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.WardrobeMessage;

/**
 * Composes Wardrobe packet for client.
 */
public class WardrobeComposer extends PacketComposer<WardrobeMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.USER_OUTFITS;
    }

    @Override
    protected void write(PacketBuffer packet, WardrobeMessage message) {
        packet.appendInt(message.state());
    }
}
