package com.nova.infra.adapter.in.network.packets.composers.catalog;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.catalog.PurchaseErrorMessage;

/**
 * Composes PurchaseError packet for client.
 */
public class PurchaseErrorComposer extends PacketComposer<PurchaseErrorMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.CATALOG_PURCHASE_ERROR;
    }

    @Override
    protected void write(PacketBuffer packet, PurchaseErrorMessage message) {
        packet.appendInt(message.code());
    }
}
