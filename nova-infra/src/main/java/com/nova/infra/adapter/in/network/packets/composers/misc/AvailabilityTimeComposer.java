package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.AvailabilityTimeMessage;

/**
 * Composes AvailabilityTime packet for client.
 */
public class AvailabilityTimeComposer extends PacketComposer<AvailabilityTimeMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.AVAILABILITY_TIME;
    }

    @Override
    protected void write(PacketBuffer packet, AvailabilityTimeMessage message) {
        packet.appendInt(message.minutesUntilChange());
    }
}
