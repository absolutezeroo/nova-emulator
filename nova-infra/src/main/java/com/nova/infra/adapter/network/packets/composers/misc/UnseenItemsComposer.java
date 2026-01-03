package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.UnseenItemsMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes UnseenItems packet for client.
 */
@ComposesPacket(Outgoing.UNSEEN_ITEMS)
public class UnseenItemsComposer extends PacketComposer<UnseenItemsMessage> {
@Override
    protected void write(PacketBuffer packet, UnseenItemsMessage message) {
        // No fields to write
    }
}
