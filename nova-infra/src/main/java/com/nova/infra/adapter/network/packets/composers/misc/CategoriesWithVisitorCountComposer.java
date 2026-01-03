package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.CategoriesWithVisitorCountMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes CategoriesWithVisitorCount packet for client.
 */
@ComposesPacket(Outgoing.CATEGORIES_WITH_VISITOR_COUNT)
public class CategoriesWithVisitorCountComposer extends PacketComposer<CategoriesWithVisitorCountMessage> {
@Override
    protected void write(PacketBuffer packet, CategoriesWithVisitorCountMessage message) {
        // No fields to write
    }
}
