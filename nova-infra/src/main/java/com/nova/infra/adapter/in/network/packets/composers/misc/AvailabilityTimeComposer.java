package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.AvailabilityTimeMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes AvailabilityTime packet for client.
 */
@ComposesPacket(Outgoing.AVAILABILITY_TIME)
public class AvailabilityTimeComposer extends PacketComposer<AvailabilityTimeMessage> {
@Override
    protected void write(PacketBuffer packet, AvailabilityTimeMessage message) {
        packet.appendInt(message.minutesUntilChange());
    }
}
