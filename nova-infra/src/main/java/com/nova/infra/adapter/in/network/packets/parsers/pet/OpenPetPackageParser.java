package com.nova.infra.adapter.in.network.packets.parsers.pet;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.pet.OpenPetPackageMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses OpenPetPackage packet from client.
 */
@ParsesPacket(Incoming.PET_OPEN_PACKAGE)
public class OpenPetPackageParser extends PacketParser<OpenPetPackageMessageEvent> {
@Override
    public OpenPetPackageMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new OpenPetPackageMessageEvent();
    }
}
