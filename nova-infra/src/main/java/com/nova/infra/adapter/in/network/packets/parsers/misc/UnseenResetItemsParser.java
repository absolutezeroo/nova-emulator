package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.UnseenResetItemsMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses UnseenResetItems packet from client.
 */
@ParsesPacket(Incoming.UNSEEN_RESET_ITEMS)
public class UnseenResetItemsParser extends PacketParser<UnseenResetItemsMessageEvent> {
@Override
    public UnseenResetItemsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new UnseenResetItemsMessageEvent();
    }
}
