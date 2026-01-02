package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.LimitedEditionSoldOutMessage;

/**
 * Composes LimitedEditionSoldOut packet for client.
 */
public class LimitedEditionSoldOutComposer extends PacketComposer<LimitedEditionSoldOutMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.LIMITED_SOLD_OUT;
    }

    @Override
    protected void write(PacketBuffer packet, LimitedEditionSoldOutMessage message) {
        // No fields to write
    }
}
