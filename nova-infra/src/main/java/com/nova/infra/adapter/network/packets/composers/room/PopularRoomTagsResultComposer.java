package com.nova.infra.adapter.network.packets.composers.room;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.room.PopularRoomTagsResultMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

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
