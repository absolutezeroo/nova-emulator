package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.NewUserExperienceGetGiftsMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses NewUserExperienceGetGifts packet from client.
 */
@ParsesPacket(Incoming.NEW_USER_EXPERIENCE_GET_GIFTS)
public class NewUserExperienceGetGiftsParser extends PacketParser<NewUserExperienceGetGiftsMessageEvent> {
@Override
    public NewUserExperienceGetGiftsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new NewUserExperienceGetGiftsMessageEvent();
    }
}
