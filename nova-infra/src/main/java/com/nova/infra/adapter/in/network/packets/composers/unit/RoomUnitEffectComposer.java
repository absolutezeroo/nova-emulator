package com.nova.infra.adapter.in.network.packets.composers.unit;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.unit.RoomUnitEffectMessage;

/**
 * Composes RoomUnitEffect packet for client.
 */
public class RoomUnitEffectComposer extends PacketComposer<RoomUnitEffectMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.UNIT_EFFECT;
    }

    @Override
    protected void write(PacketBuffer packet, RoomUnitEffectMessage message) {
        packet.appendInt(message.unitId());
        packet.appendInt(message.effectId());
        packet.appendInt(message.delay());
    }
}
