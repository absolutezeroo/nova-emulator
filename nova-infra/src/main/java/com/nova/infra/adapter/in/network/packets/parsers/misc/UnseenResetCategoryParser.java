package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.UnseenResetCategoryMessageEvent;

/**
 * Parses UnseenResetCategory packet from client.
 */
public class UnseenResetCategoryParser extends PacketParser<UnseenResetCategoryMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.UNSEEN_RESET_CATEGORY;
    }

    @Override
    public UnseenResetCategoryMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new UnseenResetCategoryMessageEvent();
    }
}
