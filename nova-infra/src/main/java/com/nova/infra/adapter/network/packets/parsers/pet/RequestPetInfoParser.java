package com.nova.infra.adapter.network.packets.parsers.pet;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.pet.RequestPetInfoMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses RequestPetInfo packet from client.
 */
@ParsesPacket(Incoming.PET_INFO)
public class RequestPetInfoParser extends PacketParser<RequestPetInfoMessageEvent> {
@Override
    public RequestPetInfoMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RequestPetInfoMessageEvent();
    }
}
