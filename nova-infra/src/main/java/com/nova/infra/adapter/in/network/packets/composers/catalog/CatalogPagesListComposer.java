package com.nova.infra.adapter.in.network.packets.composers.catalog;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.catalog.CatalogPagesListMessage;

/**
 * Composes CatalogPagesList packet for client.
 */
public class CatalogPagesListComposer extends PacketComposer<CatalogPagesListMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.CATALOG_PAGE_LIST;
    }

    @Override
    protected void write(PacketBuffer packet, CatalogPagesListMessage message) {
        // No fields to write
    }
}
