package com.nova.infra.adapter.in.network.packets.composers.catalog;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.catalog.ApproveNameMessage;

/**
 * Composes ApproveName packet for client.
 */
public class ApproveNameComposer extends PacketComposer<ApproveNameMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.CATALOG_APPROVE_NAME_RESULT;
    }

    @Override
    protected void write(PacketBuffer packet, ApproveNameMessage message) {
        packet.appendInt(message.result());
        packet.appendString(message.validationInfo());
    }
}
