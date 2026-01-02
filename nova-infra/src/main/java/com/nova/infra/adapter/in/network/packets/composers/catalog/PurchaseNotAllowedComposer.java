package com.nova.infra.adapter.in.network.packets.composers.catalog;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.catalog.PurchaseNotAllowedMessage;

/**
 * Composes PurchaseNotAllowed packet for client.
 */
public class PurchaseNotAllowedComposer extends PacketComposer<PurchaseNotAllowedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.CATALOG_PURCHASE_NOT_ALLOWED;
    }

    @Override
    protected void write(PacketBuffer packet, PurchaseNotAllowedMessage message) {
        packet.appendInt(message.code());
    }
}
