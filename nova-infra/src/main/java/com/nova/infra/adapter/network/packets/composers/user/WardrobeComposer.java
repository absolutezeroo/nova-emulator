package com.nova.infra.adapter.network.packets.composers.user;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.user.WardrobeMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes Wardrobe packet for client.
 */
@ComposesPacket(Outgoing.USER_OUTFITS)
public class WardrobeComposer extends PacketComposer<WardrobeMessage> {
@Override
    protected void write(PacketBuffer packet, WardrobeMessage message) {
        packet.appendInt(message.state());
    }
}
