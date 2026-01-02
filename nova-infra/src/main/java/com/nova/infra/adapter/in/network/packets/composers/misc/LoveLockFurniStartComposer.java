package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.LoveLockFurniStartMessage;

/**
 * Composes LoveLockFurniStart packet for client.
 */
public class LoveLockFurniStartComposer extends PacketComposer<LoveLockFurniStartMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.LOVELOCK_FURNI_START;
    }

    @Override
    protected void write(PacketBuffer packet, LoveLockFurniStartMessage message) {
        // No fields to write
    }
}
