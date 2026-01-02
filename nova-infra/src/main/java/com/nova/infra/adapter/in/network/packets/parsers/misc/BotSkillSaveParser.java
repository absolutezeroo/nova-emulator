package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.BotSkillSaveMessageEvent;

/**
 * Parses BotSkillSave packet from client.
 */
public class BotSkillSaveParser extends PacketParser<BotSkillSaveMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.BOT_SKILL_SAVE;
    }

    @Override
    public BotSkillSaveMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new BotSkillSaveMessageEvent();
    }
}
