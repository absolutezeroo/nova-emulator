package com.nova.infra.adapter.network.packets.composers.catalog;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.catalog.PurchaseErrorMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes PurchaseError packet for client.
 */
@ComposesPacket(Outgoing.CATALOG_PURCHASE_ERROR)
public class PurchaseErrorComposer extends PacketComposer<PurchaseErrorMessage> {
@Override
    protected void write(PacketBuffer packet, PurchaseErrorMessage message) {
        packet.appendInt(message.code());
    }
}
