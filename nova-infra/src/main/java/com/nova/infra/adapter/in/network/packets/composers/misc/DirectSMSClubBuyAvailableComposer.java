package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.DirectSMSClubBuyAvailableMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes DirectSMSClubBuyAvailable packet for client.
 */
@ComposesPacket(Outgoing.DIRECT_SMS_CLUB_BUY)
public class DirectSMSClubBuyAvailableComposer extends PacketComposer<DirectSMSClubBuyAvailableMessage> {
@Override
    protected void write(PacketBuffer packet, DirectSMSClubBuyAvailableMessage message) {
        packet.appendString(message.pricePointUrl());
        packet.appendString(message.market());
        packet.appendInt(message.lengthInDays());
    }
}
