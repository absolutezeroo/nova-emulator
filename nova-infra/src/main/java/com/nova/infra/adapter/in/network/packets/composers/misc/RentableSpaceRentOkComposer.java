package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.RentableSpaceRentOkMessage;

/**
 * Composes RentableSpaceRentOk packet for client.
 */
public class RentableSpaceRentOkComposer extends PacketComposer<RentableSpaceRentOkMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.RENTABLE_SPACE_RENT_OK;
    }

    @Override
    protected void write(PacketBuffer packet, RentableSpaceRentOkMessage message) {
        packet.appendInt(message.expiryTime());
    }
}
