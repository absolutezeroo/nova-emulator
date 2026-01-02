package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.TogglePetRidingMessageEvent;

/**
 * Parses TogglePetRiding packet from client.
 */
public class TogglePetRidingParser extends PacketParser<TogglePetRidingMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.TOGGLE_PET_RIDING;
    }

    @Override
    public TogglePetRidingMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new TogglePetRidingMessageEvent();
    }
}
