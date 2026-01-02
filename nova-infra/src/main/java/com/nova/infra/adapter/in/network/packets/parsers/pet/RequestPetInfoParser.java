package com.nova.infra.adapter.in.network.packets.parsers.pet;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.pet.RequestPetInfoMessageEvent;

/**
 * Parses RequestPetInfo packet from client.
 */
public class RequestPetInfoParser extends PacketParser<RequestPetInfoMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.PET_INFO;
    }

    @Override
    public RequestPetInfoMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RequestPetInfoMessageEvent();
    }
}
