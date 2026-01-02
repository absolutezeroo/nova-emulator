package com.nova.infra.adapter.in.network.packets.parsers.pet;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.pet.RequestPetInfoMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

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
