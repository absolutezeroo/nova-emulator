package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.RoomDimmerPresetsMessage;

/**
 * Composes RoomDimmerPresets packet for client.
 */
public class RoomDimmerPresetsComposer extends PacketComposer<RoomDimmerPresetsMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ITEM_DIMMER_SETTINGS;
    }

    @Override
    protected void write(PacketBuffer packet, RoomDimmerPresetsMessage message) {
        packet.appendInt(message.selectedPresetId());
    }
}
