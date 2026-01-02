package com.nova.infra.adapter.in.network.packets.parsers.pet;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.pet.OpenPetPackageMessageEvent;

/**
 * Parses OpenPetPackage packet from client.
 */
public class OpenPetPackageParser extends PacketParser<OpenPetPackageMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.PET_OPEN_PACKAGE;
    }

    @Override
    public OpenPetPackageMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new OpenPetPackageMessageEvent();
    }
}
