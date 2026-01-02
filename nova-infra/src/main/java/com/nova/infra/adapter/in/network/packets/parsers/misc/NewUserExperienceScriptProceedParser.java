package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.NewUserExperienceScriptProceedMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses NewUserExperienceScriptProceed packet from client.
 */
@ParsesPacket(Incoming.NEW_USER_EXPERIENCE_SCRIPT_PROCEED)
public class NewUserExperienceScriptProceedParser extends PacketParser<NewUserExperienceScriptProceedMessageEvent> {
@Override
    public NewUserExperienceScriptProceedMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new NewUserExperienceScriptProceedMessageEvent();
    }
}
