package com.nova.infra.adapter.in.network.packets.composers.unit;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.unit.RoomUnitEffectMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes RoomUnitEffect packet for client.
 */
@ComposesPacket(Outgoing.UNIT_EFFECT)
public class RoomUnitEffectComposer extends PacketComposer<RoomUnitEffectMessage> {
@Override
    protected void write(PacketBuffer packet, RoomUnitEffectMessage message) {
        packet.appendInt(message.unitId());
        packet.appendInt(message.effectId());
        packet.appendInt(message.delay());
    }
}
