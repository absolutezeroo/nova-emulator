package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.PetAddedToInventoryMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes PetAddedToInventory packet for client.
 */
@ComposesPacket(Outgoing.USER_PET_ADD)
public class PetAddedToInventoryComposer extends PacketComposer<PetAddedToInventoryMessage> {
@Override
    protected void write(PacketBuffer packet, PetAddedToInventoryMessage message) {
        packet.appendBoolean(message.boughtAsGift());
    }
}
