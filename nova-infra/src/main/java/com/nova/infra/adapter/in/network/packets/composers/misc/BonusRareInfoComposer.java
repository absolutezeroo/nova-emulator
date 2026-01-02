package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.BonusRareInfoMessage;

/**
 * Composes BonusRareInfo packet for client.
 */
public class BonusRareInfoComposer extends PacketComposer<BonusRareInfoMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.BONUS_RARE_INFO;
    }

    @Override
    protected void write(PacketBuffer packet, BonusRareInfoMessage message) {
        packet.appendString(message.productType());
        packet.appendInt(message.productClassId());
        packet.appendInt(message.totalCoinsForBonus());
        packet.appendInt(message.coinsStillRequiredToBuy());
    }
}
