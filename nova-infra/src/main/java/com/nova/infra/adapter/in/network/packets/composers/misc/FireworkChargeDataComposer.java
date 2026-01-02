package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.FireworkChargeDataMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes FireworkChargeData packet for client.
 */
@ComposesPacket(Outgoing.FIREWORK_CHARGE_DATA)
public class FireworkChargeDataComposer extends PacketComposer<FireworkChargeDataMessage> {
@Override
    protected void write(PacketBuffer packet, FireworkChargeDataMessage message) {
        // No fields to write
    }
}
