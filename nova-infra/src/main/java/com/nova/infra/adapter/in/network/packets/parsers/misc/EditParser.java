package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.EditMessageEvent;

/**
 * Parses Edit packet from client.
 */
public class EditParser extends PacketParser<EditMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.EDIT_ROOM_EVENT;
    }

    @Override
    public EditMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new EditMessageEvent();
    }
}
