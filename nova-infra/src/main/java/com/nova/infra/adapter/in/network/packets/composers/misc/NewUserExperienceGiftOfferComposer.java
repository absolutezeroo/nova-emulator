package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.NewUserExperienceGiftOfferMessage;

/**
 * Composes NewUserExperienceGiftOffer packet for client.
 */
public class NewUserExperienceGiftOfferComposer extends PacketComposer<NewUserExperienceGiftOfferMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.NEW_USER_EXPERIENCE_GIFT_OFFER;
    }

    @Override
    protected void write(PacketBuffer packet, NewUserExperienceGiftOfferMessage message) {
        // No fields to write
    }
}
