package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.LimitedEditionSoldOutMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

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
