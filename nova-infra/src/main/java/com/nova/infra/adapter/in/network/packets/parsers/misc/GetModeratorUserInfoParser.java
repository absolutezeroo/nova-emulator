package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetModeratorUserInfoMessageEvent;

/**
 * Parses GetModeratorUserInfo packet from client.
 */
public class GetModeratorUserInfoParser extends PacketParser<GetModeratorUserInfoMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.MOD_TOOL_USER_INFO;
    }

    @Override
    public GetModeratorUserInfoMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetModeratorUserInfoMessageEvent();
    }
}
