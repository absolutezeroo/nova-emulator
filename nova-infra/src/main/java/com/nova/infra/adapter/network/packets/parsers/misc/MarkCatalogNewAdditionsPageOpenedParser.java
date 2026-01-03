package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.MarkCatalogNewAdditionsPageOpenedMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses MarkCatalogNewAdditionsPageOpened packet from client.
 */
@ParsesPacket(Incoming.MARK_CATALOG_NEW_ADDITIONS_PAGE_OPENED)
public class MarkCatalogNewAdditionsPageOpenedParser extends PacketParser<MarkCatalogNewAdditionsPageOpenedMessageEvent> {
@Override
    public MarkCatalogNewAdditionsPageOpenedMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new MarkCatalogNewAdditionsPageOpenedMessageEvent();
    }
}
