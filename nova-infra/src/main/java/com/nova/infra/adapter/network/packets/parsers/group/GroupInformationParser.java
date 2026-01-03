package com.nova.infra.adapter.network.packets.parsers.group;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.group.GroupInformationMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GroupInformation packet from client.
 */
@ParsesPacket(Incoming.GROUP_INFO)
public class GroupInformationParser extends PacketParser<GroupInformationMessageEvent> {
@Override
    public GroupInformationMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GroupInformationMessageEvent();
    }
}
