package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.UnseenItemsMessage;

/**
 * Composes UnseenItems packet for client.
 */
public class UnseenItemsComposer extends PacketComposer<UnseenItemsMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.UNSEEN_ITEMS;
    }

    @Override
    protected void write(PacketBuffer packet, UnseenItemsMessage message) {
        // No fields to write
    }
}
