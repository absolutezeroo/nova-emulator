package com.nova.infra.adapter.in.network.packets.parsers.room;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.room.ToggleStaffPickMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses ToggleStaffPick packet from client.
 */
@ParsesPacket(Incoming.ROOM_STAFF_PICK)
public class ToggleStaffPickParser extends PacketParser<ToggleStaffPickMessageEvent> {
@Override
    public ToggleStaffPickMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ToggleStaffPickMessageEvent();
    }
}
