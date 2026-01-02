package com.nova.infra.adapter.in.network.packets.composers.crafting;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.crafting.CraftingResultMessage;

/**
 * Composes CraftingResult packet for client.
 */
public class CraftingResultComposer extends PacketComposer<CraftingResultMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.CRAFTING_RESULT;
    }

    @Override
    protected void write(PacketBuffer packet, CraftingResultMessage message) {
        packet.appendBoolean(message.success());
    }
}
