package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.PetInventoryMessage;

/**
 * Composes PetInventory packet for client.
 */
public class PetInventoryComposer extends PacketComposer<PetInventoryMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.USER_PETS;
    }

    @Override
    protected void write(PacketBuffer packet, PetInventoryMessage message) {
        packet.appendInt(message.totalFragments());
        packet.appendInt(message.fragmentNumber());
    }
}
