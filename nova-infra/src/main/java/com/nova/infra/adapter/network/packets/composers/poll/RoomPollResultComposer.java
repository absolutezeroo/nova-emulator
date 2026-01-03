package com.nova.infra.adapter.network.packets.composers.poll;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.poll.RoomPollResultMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes RoomPollResult packet for client.
 */
@ComposesPacket(Outgoing.POLL_ROOM_RESULT)
public class RoomPollResultComposer extends PacketComposer<RoomPollResultMessage> {
@Override
    protected void write(PacketBuffer packet, RoomPollResultMessage message) {
        // No fields to write
    }
}
