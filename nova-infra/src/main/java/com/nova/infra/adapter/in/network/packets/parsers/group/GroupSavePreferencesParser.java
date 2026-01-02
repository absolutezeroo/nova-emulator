package com.nova.infra.adapter.in.network.packets.parsers.group;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.group.GroupSavePreferencesMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GroupSavePreferences packet from client.
 */
@ParsesPacket(Incoming.GROUP_SAVE_PREFERENCES)
public class GroupSavePreferencesParser extends PacketParser<GroupSavePreferencesMessageEvent> {
@Override
    public GroupSavePreferencesMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GroupSavePreferencesMessageEvent();
    }
}
