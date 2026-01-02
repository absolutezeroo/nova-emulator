package com.nova.infra.adapter.in.network.packets.parsers.room;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.room.ToggleStaffPickMessageEvent;

/**
 * Parses ToggleStaffPick packet from client.
 */
public class ToggleStaffPickParser extends PacketParser<ToggleStaffPickMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.ROOM_STAFF_PICK;
    }

    @Override
    public ToggleStaffPickMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ToggleStaffPickMessageEvent();
    }
}
