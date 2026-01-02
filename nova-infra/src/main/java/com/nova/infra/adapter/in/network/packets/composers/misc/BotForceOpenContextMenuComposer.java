package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.BotForceOpenContextMenuMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes BotForceOpenContextMenu packet for client.
 */
@ComposesPacket(Outgoing.BOT_FORCE_OPEN_CONTEXT_MENU)
public class BotForceOpenContextMenuComposer extends PacketComposer<BotForceOpenContextMenuMessage> {
@Override
    protected void write(PacketBuffer packet, BotForceOpenContextMenuMessage message) {
        packet.appendInt(message.botId());
    }
}
