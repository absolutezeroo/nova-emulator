package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.HotelMergeNameChangeMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes HotelMergeNameChange packet for client.
 */
@ComposesPacket(Outgoing.HOTEL_MERGE_NAME_CHANGE)
public class HotelMergeNameChangeComposer extends PacketComposer<HotelMergeNameChangeMessage> {
@Override
    protected void write(PacketBuffer packet, HotelMergeNameChangeMessage message) {
        // No fields to write
    }
}
