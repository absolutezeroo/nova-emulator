package com.nova.infra.adapter.in.network.packets.parsers.user;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.user.UserSettingsCameraFollowMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses UserSettingsCameraFollow packet from client.
 */
@ParsesPacket(Incoming.USER_SETTINGS_CAMERA)
public class UserSettingsCameraFollowParser extends PacketParser<UserSettingsCameraFollowMessageEvent> {
@Override
    public UserSettingsCameraFollowMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new UserSettingsCameraFollowMessageEvent();
    }
}
