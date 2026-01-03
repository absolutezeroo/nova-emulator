package com.nova.infra.adapter.network.packets.composers.user;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.user.PetRemovedFromInventoryMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

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
