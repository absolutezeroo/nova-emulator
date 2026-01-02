package com.nova.infra.adapter.in.network.packets.parsers.group;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.group.GroupSavePreferencesMessageEvent;

/**
 * Parses GroupSavePreferences packet from client.
 */
public class GroupSavePreferencesParser extends PacketParser<GroupSavePreferencesMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GROUP_SAVE_PREFERENCES;
    }

    @Override
    public GroupSavePreferencesMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GroupSavePreferencesMessageEvent();
    }
}
