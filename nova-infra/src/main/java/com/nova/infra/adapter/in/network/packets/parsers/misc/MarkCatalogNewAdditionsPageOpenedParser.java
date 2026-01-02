package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.MarkCatalogNewAdditionsPageOpenedMessageEvent;

/**
 * Parses MarkCatalogNewAdditionsPageOpened packet from client.
 */
public class MarkCatalogNewAdditionsPageOpenedParser extends PacketParser<MarkCatalogNewAdditionsPageOpenedMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.MARK_CATALOG_NEW_ADDITIONS_PAGE_OPENED;
    }

    @Override
    public MarkCatalogNewAdditionsPageOpenedMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new MarkCatalogNewAdditionsPageOpenedMessageEvent();
    }
}
