package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.PetAddedToInventoryMessage;

/**
 * Composes PetAddedToInventory packet for client.
 */
public class PetAddedToInventoryComposer extends PacketComposer<PetAddedToInventoryMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.USER_PET_ADD;
    }

    @Override
    protected void write(PacketBuffer packet, PetAddedToInventoryMessage message) {
        packet.appendBoolean(message.boughtAsGift());
    }
}
