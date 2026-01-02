package com.nova.infra.adapter.in.network.packets.composers.catalog;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.catalog.CatalogPageWithEarliestExpiryMessage;

/**
 * Composes CatalogPageWithEarliestExpiry packet for client.
 */
public class CatalogPageWithEarliestExpiryComposer extends PacketComposer<CatalogPageWithEarliestExpiryMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.CATALOG_EARLIEST_EXPIRY;
    }

    @Override
    protected void write(PacketBuffer packet, CatalogPageWithEarliestExpiryMessage message) {
        packet.appendString(message.pageName());
        packet.appendInt(message.secondsToExpiry());
        packet.appendString(message.image());
    }
}
