package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.RoomDimmerPresetsMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes RoomDimmerPresets packet for client.
 */
@ComposesPacket(Outgoing.ITEM_DIMMER_SETTINGS)
public class RoomDimmerPresetsComposer extends PacketComposer<RoomDimmerPresetsMessage> {
@Override
    protected void write(PacketBuffer packet, RoomDimmerPresetsMessage message) {
        packet.appendInt(message.selectedPresetId());
    }
}
