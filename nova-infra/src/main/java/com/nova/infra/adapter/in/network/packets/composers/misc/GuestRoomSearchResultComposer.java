package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.GuestRoomSearchResultMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes GuestRoomSearchResult packet for client.
 */
@ComposesPacket(Outgoing.GUEST_ROOM_SEARCH_RESULT)
public class GuestRoomSearchResultComposer extends PacketComposer<GuestRoomSearchResultMessage> {
@Override
    protected void write(PacketBuffer packet, GuestRoomSearchResultMessage message) {
        // No fields to write
    }
}
