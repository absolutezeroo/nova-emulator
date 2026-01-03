package com.nova.infra.adapter.network.packets.composers.catalog;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.catalog.CatalogPageWithEarliestExpiryMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes CatalogPageWithEarliestExpiry packet for client.
 */
@ComposesPacket(Outgoing.CATALOG_EARLIEST_EXPIRY)
public class CatalogPageWithEarliestExpiryComposer extends PacketComposer<CatalogPageWithEarliestExpiryMessage> {
@Override
    protected void write(PacketBuffer packet, CatalogPageWithEarliestExpiryMessage message) {
        packet.appendString(message.pageName());
        packet.appendInt(message.secondsToExpiry());
        packet.appendString(message.image());
    }
}
