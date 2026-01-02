package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.PetInventoryMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes PetInventory packet for client.
 */
@ComposesPacket(Outgoing.USER_PETS)
public class PetInventoryComposer extends PacketComposer<PetInventoryMessage> {
@Override
    protected void write(PacketBuffer packet, PetInventoryMessage message) {
        packet.appendInt(message.totalFragments());
        packet.appendInt(message.fragmentNumber());
    }
}
