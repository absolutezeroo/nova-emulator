package com.nova.infra.adapter.network.packets.composers.poll;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.poll.StartRoomPollMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes StartRoomPoll packet for client.
 */
@ComposesPacket(Outgoing.POLL_START_ROOM)
public class StartRoomPollComposer extends PacketComposer<StartRoomPollMessage> {
@Override
    protected void write(PacketBuffer packet, StartRoomPollMessage message) {
        // No fields to write
    }
}
