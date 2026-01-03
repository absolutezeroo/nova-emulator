package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.RentableSpaceRentFailedMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

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
