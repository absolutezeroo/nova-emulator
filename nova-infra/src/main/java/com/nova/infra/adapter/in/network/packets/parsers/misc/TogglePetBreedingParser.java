package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.TogglePetBreedingMessageEvent;

/**
 * Parses TogglePetBreeding packet from client.
 */
public class TogglePetBreedingParser extends PacketParser<TogglePetBreedingMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.TOGGLE_PET_BREEDING;
    }

    @Override
    public TogglePetBreedingMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new TogglePetBreedingMessageEvent();
    }
}
