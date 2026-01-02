package com.nova.infra.adapter.in.network.packets.parsers.user;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.user.UserSettingsCameraFollowMessageEvent;

/**
 * Parses UserSettingsCameraFollow packet from client.
 */
public class UserSettingsCameraFollowParser extends PacketParser<UserSettingsCameraFollowMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.USER_SETTINGS_CAMERA;
    }

    @Override
    public UserSettingsCameraFollowMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new UserSettingsCameraFollowMessageEvent();
    }
}
