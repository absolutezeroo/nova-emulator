package com.nova.infra.adapter.in.network.packets.parsers.group;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.group.GroupSaveColorsMessageEvent;

/**
 * Parses GroupSaveColors packet from client.
 */
public class GroupSaveColorsParser extends PacketParser<GroupSaveColorsMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GROUP_SAVE_COLORS;
    }

    @Override
    public GroupSaveColorsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GroupSaveColorsMessageEvent();
    }
}
