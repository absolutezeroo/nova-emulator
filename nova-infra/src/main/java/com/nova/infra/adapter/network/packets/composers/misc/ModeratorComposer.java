package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.ModeratorMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes Moderator packet for client.
 */
@ComposesPacket(Outgoing.MODERATOR_MESSAGE)
public class ModeratorComposer extends PacketComposer<ModeratorMessage> {
@Override
    protected void write(PacketBuffer packet, ModeratorMessage message) {
        packet.appendInt(message.userId());
        packet.appendBoolean(message.success());
    }
}
