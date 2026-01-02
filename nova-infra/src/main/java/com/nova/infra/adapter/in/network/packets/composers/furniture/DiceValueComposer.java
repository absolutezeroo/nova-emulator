package com.nova.infra.adapter.in.network.packets.composers.furniture;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.furniture.DiceValueMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes DiceValue packet for client.
 */
@ComposesPacket(Outgoing.FURNITURE_STATE_2)
public class DiceValueComposer extends PacketComposer<DiceValueMessage> {
@Override
    protected void write(PacketBuffer packet, DiceValueMessage message) {
        packet.appendInt(message.itemId());
        packet.appendInt(message.value());
    }
}
