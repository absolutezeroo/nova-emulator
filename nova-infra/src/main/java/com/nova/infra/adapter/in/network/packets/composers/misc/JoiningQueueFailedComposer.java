package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.JoiningQueueFailedMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes JoiningQueueFailed packet for client.
 */
@ComposesPacket(Outgoing.JOININGQUEUEFAILED)
public class JoiningQueueFailedComposer extends PacketComposer<JoiningQueueFailedMessage> {
@Override
    protected void write(PacketBuffer packet, JoiningQueueFailedMessage message) {
        packet.appendInt(message.gameTypeId());
        packet.appendInt(message.reason());
    }
}
