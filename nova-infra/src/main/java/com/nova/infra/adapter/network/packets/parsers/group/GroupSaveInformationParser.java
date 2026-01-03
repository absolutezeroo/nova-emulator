package com.nova.infra.adapter.network.packets.parsers.group;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.group.GroupSaveInformationMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GroupSaveInformation packet from client.
 */
@ParsesPacket(Incoming.GROUP_SAVE_INFORMATION)
public class GroupSaveInformationParser extends PacketParser<GroupSaveInformationMessageEvent> {
@Override
    public GroupSaveInformationMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GroupSaveInformationMessageEvent();
    }
}
