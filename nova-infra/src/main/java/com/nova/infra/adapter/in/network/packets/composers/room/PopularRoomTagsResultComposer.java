package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.PopularRoomTagsResultMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes PopularRoomTagsResult packet for client.
 */
@ComposesPacket(Outgoing.ROOM_POPULAR_TAGS_RESULT)
public class PopularRoomTagsResultComposer extends PacketComposer<PopularRoomTagsResultMessage> {
@Override
    protected void write(PacketBuffer packet, PopularRoomTagsResultMessage message) {
        // No fields to write
    }
}
