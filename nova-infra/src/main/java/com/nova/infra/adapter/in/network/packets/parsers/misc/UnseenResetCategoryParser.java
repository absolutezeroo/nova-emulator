package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.UnseenResetCategoryMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses UnseenResetCategory packet from client.
 */
@ParsesPacket(Incoming.UNSEEN_RESET_CATEGORY)
public class UnseenResetCategoryParser extends PacketParser<UnseenResetCategoryMessageEvent> {
@Override
    public UnseenResetCategoryMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new UnseenResetCategoryMessageEvent();
    }
}
