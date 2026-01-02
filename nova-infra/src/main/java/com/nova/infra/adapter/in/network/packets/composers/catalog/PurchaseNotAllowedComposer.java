package com.nova.infra.adapter.in.network.packets.composers.catalog;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.catalog.PurchaseNotAllowedMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

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
