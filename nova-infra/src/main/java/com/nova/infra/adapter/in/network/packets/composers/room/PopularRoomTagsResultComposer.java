package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.PopularRoomTagsResultMessage;

/**
 * Composes PopularRoomTagsResult packet for client.
 */
public class PopularRoomTagsResultComposer extends PacketComposer<PopularRoomTagsResultMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ROOM_POPULAR_TAGS_RESULT;
    }

    @Override
    protected void write(PacketBuffer packet, PopularRoomTagsResultMessage message) {
        // No fields to write
    }
}
