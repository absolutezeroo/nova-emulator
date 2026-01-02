package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.BotSkillListUpdateMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes BotSkillListUpdate packet for client.
 */
@ComposesPacket(Outgoing.BOT_SKILL_LIST_UPDATE)
public class BotSkillListUpdateComposer extends PacketComposer<BotSkillListUpdateMessage> {
@Override
    protected void write(PacketBuffer packet, BotSkillListUpdateMessage message) {
        packet.appendInt(message.botId());
    }
}
