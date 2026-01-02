package com.nova.infra.adapter.in.network.packets.parsers.group;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.group.GroupSettingsMessageEvent;

/**
 * Parses GroupSettings packet from client.
 */
public class GroupSettingsParser extends PacketParser<GroupSettingsMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GROUP_SETTINGS;
    }

    @Override
    public GroupSettingsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GroupSettingsMessageEvent();
    }
}
