package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.GiftReceiverNotFoundMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes GiftReceiverNotFound packet for client.
 */
@ComposesPacket(Outgoing.GIFT_RECEIVER_NOT_FOUND)
public class GiftReceiverNotFoundComposer extends PacketComposer<GiftReceiverNotFoundMessage> {
@Override
    protected void write(PacketBuffer packet, GiftReceiverNotFoundMessage message) {
        // No fields to write
    }
}
