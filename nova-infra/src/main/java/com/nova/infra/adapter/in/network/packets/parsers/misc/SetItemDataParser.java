package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.SetItemDataMessageEvent;

/**
 * Parses SetItemData packet from client.
 */
public class SetItemDataParser extends PacketParser<SetItemDataMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.SET_ITEM_DATA;
    }

    @Override
    public SetItemDataMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new SetItemDataMessageEvent();
    }
}
