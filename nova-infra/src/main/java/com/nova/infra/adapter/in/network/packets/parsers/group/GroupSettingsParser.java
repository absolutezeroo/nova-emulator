package com.nova.infra.adapter.in.network.packets.parsers.group;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.group.GroupSettingsMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GroupSettings packet from client.
 */
@ParsesPacket(Incoming.GROUP_SETTINGS)
public class GroupSettingsParser extends PacketParser<GroupSettingsMessageEvent> {
@Override
    public GroupSettingsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GroupSettingsMessageEvent();
    }
}
