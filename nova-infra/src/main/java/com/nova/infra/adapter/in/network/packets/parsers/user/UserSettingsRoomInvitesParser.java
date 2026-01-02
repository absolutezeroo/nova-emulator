package com.nova.infra.adapter.in.network.packets.parsers.user;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.user.UserSettingsRoomInvitesMessageEvent;

/**
 * Parses UserSettingsRoomInvites packet from client.
 */
public class UserSettingsRoomInvitesParser extends PacketParser<UserSettingsRoomInvitesMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.USER_SETTINGS_INVITES;
    }

    @Override
    public UserSettingsRoomInvitesMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new UserSettingsRoomInvitesMessageEvent();
    }
}
