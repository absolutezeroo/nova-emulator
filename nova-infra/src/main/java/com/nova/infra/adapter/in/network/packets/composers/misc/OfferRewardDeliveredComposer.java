package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.OfferRewardDeliveredMessage;

/**
 * Composes OfferRewardDelivered packet for client.
 */
public class OfferRewardDeliveredComposer extends PacketComposer<OfferRewardDeliveredMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.NOTIFICATION_OFFER_REWARD_DELIVERED;
    }

    @Override
    protected void write(PacketBuffer packet, OfferRewardDeliveredMessage message) {
        packet.appendString(message.contentType());
        packet.appendInt(message.classId());
        packet.appendString(message.name());
        packet.appendString(message.description());
    }
}
