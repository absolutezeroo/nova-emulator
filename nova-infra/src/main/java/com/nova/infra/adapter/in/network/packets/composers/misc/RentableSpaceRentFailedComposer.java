package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.RentableSpaceRentFailedMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes RentableSpaceRentFailed packet for client.
 */
@ComposesPacket(Outgoing.RENTABLE_SPACE_RENT_FAILED)
public class RentableSpaceRentFailedComposer extends PacketComposer<RentableSpaceRentFailedMessage> {
@Override
    protected void write(PacketBuffer packet, RentableSpaceRentFailedMessage message) {
        packet.appendInt(message.reason());
    }
}
