package com.nova.infra.adapter.in.network.packets.composers.poll;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.poll.RoomPollResultMessage;

/**
 * Composes RoomPollResult packet for client.
 */
public class RoomPollResultComposer extends PacketComposer<RoomPollResultMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.POLL_ROOM_RESULT;
    }

    @Override
    protected void write(PacketBuffer packet, RoomPollResultMessage message) {
        // No fields to write
    }
}
