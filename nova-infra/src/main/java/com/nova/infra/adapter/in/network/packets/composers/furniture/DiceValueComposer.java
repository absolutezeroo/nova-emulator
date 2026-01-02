package com.nova.infra.adapter.in.network.packets.composers.furniture;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.furniture.DiceValueMessage;

/**
 * Composes DiceValue packet for client.
 */
public class DiceValueComposer extends PacketComposer<DiceValueMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.FURNITURE_STATE_2;
    }

    @Override
    protected void write(PacketBuffer packet, DiceValueMessage message) {
        packet.appendInt(message.itemId());
        packet.appendInt(message.value());
    }
}
