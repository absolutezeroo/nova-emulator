package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.HotelMergeNameChangeMessage;

/**
 * Composes HotelMergeNameChange packet for client.
 */
public class HotelMergeNameChangeComposer extends PacketComposer<HotelMergeNameChangeMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.HOTEL_MERGE_NAME_CHANGE;
    }

    @Override
    protected void write(PacketBuffer packet, HotelMergeNameChangeMessage message) {
        // No fields to write
    }
}
