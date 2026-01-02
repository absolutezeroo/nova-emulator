package com.nova.infra.adapter.in.network.packets.parsers.group;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.group.UnblockGroupMemberMessageEvent;

/**
 * Parses UnblockGroupMember packet from client.
 */
public class UnblockGroupMemberParser extends PacketParser<UnblockGroupMemberMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GROUP_UNBLOCK_MEMBER;
    }

    @Override
    public UnblockGroupMemberMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new UnblockGroupMemberMessageEvent();
    }
}
