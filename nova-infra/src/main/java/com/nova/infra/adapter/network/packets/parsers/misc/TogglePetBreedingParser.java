package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.TogglePetBreedingMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses TogglePetBreeding packet from client.
 */
@ParsesPacket(Incoming.TOGGLE_PET_BREEDING)
public class TogglePetBreedingParser extends PacketParser<TogglePetBreedingMessageEvent> {
@Override
    public TogglePetBreedingMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new TogglePetBreedingMessageEvent();
    }
}
