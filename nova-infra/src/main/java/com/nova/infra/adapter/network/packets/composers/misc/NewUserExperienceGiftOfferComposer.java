package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.NewUserExperienceGiftOfferMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes NewUserExperienceGiftOffer packet for client.
 */
@ComposesPacket(Outgoing.NEW_USER_EXPERIENCE_GIFT_OFFER)
public class NewUserExperienceGiftOfferComposer extends PacketComposer<NewUserExperienceGiftOfferMessage> {
@Override
    protected void write(PacketBuffer packet, NewUserExperienceGiftOfferMessage message) {
        // No fields to write
    }
}
