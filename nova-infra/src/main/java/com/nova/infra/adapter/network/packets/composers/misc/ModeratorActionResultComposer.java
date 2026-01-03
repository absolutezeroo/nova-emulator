package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.ModeratorActionResultMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes ModeratorActionResult packet for client.
 */
@ComposesPacket(Outgoing.MODERATOR_ACTION_RESULT)
public class ModeratorActionResultComposer extends PacketComposer<ModeratorActionResultMessage> {
@Override
    protected void write(PacketBuffer packet, ModeratorActionResultMessage message) {
        packet.appendInt(message.userId());
        packet.appendBoolean(message.success());
    }
}
