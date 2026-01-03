package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.BotSkillSaveMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses BotSkillSave packet from client.
 */
@ParsesPacket(Incoming.BOT_SKILL_SAVE)
public class BotSkillSaveParser extends PacketParser<BotSkillSaveMessageEvent> {
@Override
    public BotSkillSaveMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new BotSkillSaveMessageEvent();
    }
}
