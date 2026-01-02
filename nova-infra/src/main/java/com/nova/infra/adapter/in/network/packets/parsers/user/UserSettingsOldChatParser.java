package com.nova.infra.adapter.in.network.packets.parsers.user;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.user.UserSettingsOldChatMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses UserSettingsOldChat packet from client.
 */
@ParsesPacket(Incoming.USER_SETTINGS_OLD_CHAT)
public class UserSettingsOldChatParser extends PacketParser<UserSettingsOldChatMessageEvent> {
@Override
    public UserSettingsOldChatMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new UserSettingsOldChatMessageEvent();
    }
}
