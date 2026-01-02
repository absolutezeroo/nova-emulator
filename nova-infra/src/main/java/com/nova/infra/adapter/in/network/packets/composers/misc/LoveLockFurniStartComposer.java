package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.LoveLockFurniStartMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes LoveLockFurniStart packet for client.
 */
@ComposesPacket(Outgoing.LOVELOCK_FURNI_START)
public class LoveLockFurniStartComposer extends PacketComposer<LoveLockFurniStartMessage> {
@Override
    protected void write(PacketBuffer packet, LoveLockFurniStartMessage message) {
        // No fields to write
    }
}
