package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.GiftReceiverNotFoundMessage;

/**
 * Composes GiftReceiverNotFound packet for client.
 */
public class GiftReceiverNotFoundComposer extends PacketComposer<GiftReceiverNotFoundMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.GIFT_RECEIVER_NOT_FOUND;
    }

    @Override
    protected void write(PacketBuffer packet, GiftReceiverNotFoundMessage message) {
        // No fields to write
    }
}
