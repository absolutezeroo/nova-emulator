package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.OfferRewardDeliveredMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes OfferRewardDelivered packet for client.
 */
@ComposesPacket(Outgoing.NOTIFICATION_OFFER_REWARD_DELIVERED)
public class OfferRewardDeliveredComposer extends PacketComposer<OfferRewardDeliveredMessage> {
@Override
    protected void write(PacketBuffer packet, OfferRewardDeliveredMessage message) {
        packet.appendString(message.contentType());
        packet.appendInt(message.classId());
        packet.appendString(message.name());
        packet.appendString(message.description());
    }
}
