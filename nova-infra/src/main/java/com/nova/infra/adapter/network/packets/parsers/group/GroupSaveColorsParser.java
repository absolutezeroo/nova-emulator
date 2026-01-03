package com.nova.infra.adapter.network.packets.parsers.group;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.group.GroupSaveColorsMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GroupSaveColors packet from client.
 */
@ParsesPacket(Incoming.GROUP_SAVE_COLORS)
public class GroupSaveColorsParser extends PacketParser<GroupSaveColorsMessageEvent> {
@Override
    public GroupSaveColorsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GroupSaveColorsMessageEvent();
    }
}
