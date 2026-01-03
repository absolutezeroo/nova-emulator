package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.EditMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses Edit packet from client.
 */
@ParsesPacket(Incoming.EDIT_ROOM_EVENT)
public class EditParser extends PacketParser<EditMessageEvent> {
@Override
    public EditMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new EditMessageEvent();
    }
}
