package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.SetItemDataMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses SetItemData packet from client.
 */
@ParsesPacket(Incoming.SET_ITEM_DATA)
public class SetItemDataParser extends PacketParser<SetItemDataMessageEvent> {
@Override
    public SetItemDataMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new SetItemDataMessageEvent();
    }
}
