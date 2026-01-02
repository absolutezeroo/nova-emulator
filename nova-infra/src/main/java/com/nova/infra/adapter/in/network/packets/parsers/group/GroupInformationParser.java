package com.nova.infra.adapter.in.network.packets.parsers.group;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.group.GroupInformationMessageEvent;

/**
 * Parses GroupInformation packet from client.
 */
public class GroupInformationParser extends PacketParser<GroupInformationMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GROUP_INFO;
    }

    @Override
    public GroupInformationMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GroupInformationMessageEvent();
    }
}
