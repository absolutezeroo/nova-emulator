package com.nova.infra.adapter.in.network.packets.parsers.pet;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.pet.PetSelectedMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses PetSelected packet from client.
 */
@ParsesPacket(Incoming.PET_SELECTED)
public class PetSelectedParser extends PacketParser<PetSelectedMessageEvent> {
@Override
    public PetSelectedMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new PetSelectedMessageEvent();
    }
}
