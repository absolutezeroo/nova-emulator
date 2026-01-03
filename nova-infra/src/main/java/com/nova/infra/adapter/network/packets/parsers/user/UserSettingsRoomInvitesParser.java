package com.nova.infra.adapter.network.packets.parsers.user;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.user.UserSettingsRoomInvitesMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses UserSettingsRoomInvites packet from client.
 */
@ParsesPacket(Incoming.USER_SETTINGS_INVITES)
public class UserSettingsRoomInvitesParser extends PacketParser<UserSettingsRoomInvitesMessageEvent> {
@Override
    public UserSettingsRoomInvitesMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new UserSettingsRoomInvitesMessageEvent();
    }
}
