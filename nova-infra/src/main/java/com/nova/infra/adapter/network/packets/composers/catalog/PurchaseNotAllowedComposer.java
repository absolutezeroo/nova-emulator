package com.nova.infra.adapter.network.packets.composers.catalog;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.catalog.PurchaseNotAllowedMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes PurchaseNotAllowed packet for client.
 */
@ComposesPacket(Outgoing.CATALOG_PURCHASE_NOT_ALLOWED)
public class PurchaseNotAllowedComposer extends PacketComposer<PurchaseNotAllowedMessage> {
@Override
    protected void write(PacketBuffer packet, PurchaseNotAllowedMessage message) {
        packet.appendInt(message.code());
    }
}
