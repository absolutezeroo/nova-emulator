package com.nova.infra.adapter.network.packets.parsers.group;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.group.UnblockGroupMemberMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses UnblockGroupMember packet from client.
 */
@ParsesPacket(Incoming.GROUP_UNBLOCK_MEMBER)
public class UnblockGroupMemberParser extends PacketParser<UnblockGroupMemberMessageEvent> {
@Override
    public UnblockGroupMemberMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new UnblockGroupMemberMessageEvent();
    }
}
