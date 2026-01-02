package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.RentableSpaceRentFailedMessage;

/**
 * Composes RentableSpaceRentFailed packet for client.
 */
public class RentableSpaceRentFailedComposer extends PacketComposer<RentableSpaceRentFailedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.RENTABLE_SPACE_RENT_FAILED;
    }

    @Override
    protected void write(PacketBuffer packet, RentableSpaceRentFailedMessage message) {
        packet.appendInt(message.reason());
    }
}
