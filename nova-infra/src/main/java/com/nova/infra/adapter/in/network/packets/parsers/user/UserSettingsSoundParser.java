package com.nova.infra.adapter.in.network.packets.parsers.user;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.user.UserSettingsSoundMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses UserSettingsSound packet from client.
 */
@ParsesPacket(Incoming.USER_SETTINGS_VOLUME)
public class UserSettingsSoundParser extends PacketParser<UserSettingsSoundMessageEvent> {
@Override
    public UserSettingsSoundMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new UserSettingsSoundMessageEvent();
    }
}
