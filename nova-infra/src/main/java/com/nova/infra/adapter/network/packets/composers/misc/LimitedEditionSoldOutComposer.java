package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.LimitedEditionSoldOutMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes LimitedEditionSoldOut packet for client.
 */
@ComposesPacket(Outgoing.LIMITED_SOLD_OUT)
public class LimitedEditionSoldOutComposer extends PacketComposer<LimitedEditionSoldOutMessage> {
@Override
    protected void write(PacketBuffer packet, LimitedEditionSoldOutMessage message) {
        // No fields to write
    }
}
