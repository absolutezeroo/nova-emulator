package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.HarvestPetMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses HarvestPet packet from client.
 */
@ParsesPacket(Incoming.HARVEST_PET)
public class HarvestPetParser extends PacketParser<HarvestPetMessageEvent> {
@Override
    public HarvestPetMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new HarvestPetMessageEvent();
    }
}
