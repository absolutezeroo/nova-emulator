package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.PetRemovedFromInventoryMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes PetRemovedFromInventory packet for client.
 */
@ComposesPacket(Outgoing.USER_PET_REMOVE)
public class PetRemovedFromInventoryComposer extends PacketComposer<PetRemovedFromInventoryMessage> {
@Override
    protected void write(PacketBuffer packet, PetRemovedFromInventoryMessage message) {
        packet.appendInt(message.petId());
    }
}
