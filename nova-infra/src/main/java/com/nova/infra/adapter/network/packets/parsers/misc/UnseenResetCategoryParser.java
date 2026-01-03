package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.UnseenResetCategoryMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

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
