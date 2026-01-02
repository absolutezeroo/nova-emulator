package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.NewUserExperienceScriptProceedMessageEvent;

/**
 * Parses NewUserExperienceScriptProceed packet from client.
 */
public class NewUserExperienceScriptProceedParser extends PacketParser<NewUserExperienceScriptProceedMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.NEW_USER_EXPERIENCE_SCRIPT_PROCEED;
    }

    @Override
    public NewUserExperienceScriptProceedMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new NewUserExperienceScriptProceedMessageEvent();
    }
}
