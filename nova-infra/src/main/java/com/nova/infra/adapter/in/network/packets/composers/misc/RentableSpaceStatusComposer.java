package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.RentableSpaceStatusMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes RentableSpaceStatus packet for client.
 */
@ComposesPacket(Outgoing.RENTABLE_SPACE_STATUS)
public class RentableSpaceStatusComposer extends PacketComposer<RentableSpaceStatusMessage> {
@Override
    protected void write(PacketBuffer packet, RentableSpaceStatusMessage message) {
        packet.appendBoolean(message.rented());
        packet.appendInt(message.canRentErrorCode());
        packet.appendInt(message.renterId());
        packet.appendString(message.renterName());
        packet.appendInt(message.timeRemaining());
        packet.appendInt(message.price());
    }
}
