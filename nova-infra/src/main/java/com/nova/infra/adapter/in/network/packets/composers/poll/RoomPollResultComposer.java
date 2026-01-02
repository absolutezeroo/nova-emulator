package com.nova.infra.adapter.in.network.packets.composers.poll;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.poll.RoomPollResultMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

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
