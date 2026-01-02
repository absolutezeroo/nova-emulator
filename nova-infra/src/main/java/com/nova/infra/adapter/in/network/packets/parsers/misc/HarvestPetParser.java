package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.HarvestPetMessageEvent;

/**
 * Parses HarvestPet packet from client.
 */
public class HarvestPetParser extends PacketParser<HarvestPetMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.HARVEST_PET;
    }

    @Override
    public HarvestPetMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new HarvestPetMessageEvent();
    }
}
