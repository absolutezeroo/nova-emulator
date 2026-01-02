package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.SetItemDataMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

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
