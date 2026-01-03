package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.PromoArticlesMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes PromoArticles packet for client.
 */
@ComposesPacket(Outgoing.PROMO_ARTICLES)
public class PromoArticlesComposer extends PacketComposer<PromoArticlesMessage> {
@Override
    protected void write(PacketBuffer packet, PromoArticlesMessage message) {
        // No fields to write
    }
}
