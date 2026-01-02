package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.PetRemovedFromInventoryMessage;

/**
 * Composes PetRemovedFromInventory packet for client.
 */
public class PetRemovedFromInventoryComposer extends PacketComposer<PetRemovedFromInventoryMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.USER_PET_REMOVE;
    }

    @Override
    protected void write(PacketBuffer packet, PetRemovedFromInventoryMessage message) {
        packet.appendInt(message.petId());
    }
}
