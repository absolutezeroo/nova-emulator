package com.nova.infra.adapter.in.network.packets.parsers.user;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.user.RequestPetsMessageEvent;

/**
 * Parses RequestPets packet from client.
 */
public class RequestPetsParser extends PacketParser<RequestPetsMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.USER_PETS;
    }

    @Override
    public RequestPetsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RequestPetsMessageEvent();
    }
}
