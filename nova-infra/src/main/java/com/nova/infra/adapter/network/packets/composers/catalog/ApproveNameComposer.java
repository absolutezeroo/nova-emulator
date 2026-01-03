package com.nova.infra.adapter.network.packets.composers.catalog;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.catalog.ApproveNameMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes ApproveName packet for client.
 */
@ComposesPacket(Outgoing.CATALOG_APPROVE_NAME_RESULT)
public class ApproveNameComposer extends PacketComposer<ApproveNameMessage> {
@Override
    protected void write(PacketBuffer packet, ApproveNameMessage message) {
        packet.appendInt(message.result());
        packet.appendString(message.validationInfo());
    }
}
