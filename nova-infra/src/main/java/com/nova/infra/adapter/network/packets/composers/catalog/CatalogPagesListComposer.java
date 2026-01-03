package com.nova.infra.adapter.network.packets.composers.catalog;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.catalog.CatalogPagesListMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes CatalogPagesList packet for client.
 */
@ComposesPacket(Outgoing.CATALOG_PAGE_LIST)
public class CatalogPagesListComposer extends PacketComposer<CatalogPagesListMessage> {
@Override
    protected void write(PacketBuffer packet, CatalogPagesListMessage message) {
        // No fields to write
    }
}
