package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.BonusRareInfoMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes BonusRareInfo packet for client.
 */
@ComposesPacket(Outgoing.BONUS_RARE_INFO)
public class BonusRareInfoComposer extends PacketComposer<BonusRareInfoMessage> {
@Override
    protected void write(PacketBuffer packet, BonusRareInfoMessage message) {
        packet.appendString(message.productType());
        packet.appendInt(message.productClassId());
        packet.appendInt(message.totalCoinsForBonus());
        packet.appendInt(message.coinsStillRequiredToBuy());
    }
}
