package com.nova.infra.adapter.in.network.packets.composers.catalog;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.catalog.CatalogPublishedMessage;

/**
 * Composes CatalogPublished packet for client.
 */
public class CatalogPublishedComposer extends PacketComposer<CatalogPublishedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.CATALOG_PUBLISHED;
    }

    @Override
    protected void write(PacketBuffer packet, CatalogPublishedMessage message) {
        packet.appendBoolean(message.instantlyRefreshCatalogue());
        packet.appendString(message.newFurniDataHash());
    }
}
