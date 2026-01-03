package com.nova.infra.adapter.network.packets.composers.crafting;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.crafting.CraftingResultMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes CraftingResult packet for client.
 */
@ComposesPacket(Outgoing.CRAFTING_RESULT)
public class CraftingResultComposer extends PacketComposer<CraftingResultMessage> {
@Override
    protected void write(PacketBuffer packet, CraftingResultMessage message) {
        packet.appendBoolean(message.success());
    }
}
