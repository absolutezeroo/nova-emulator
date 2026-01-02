package com.nova.infra.adapter.in.network.packets.parsers.user;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.user.RequestPetsMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses RequestPets packet from client.
 */
@ParsesPacket(Incoming.USER_PETS)
public class RequestPetsParser extends PacketParser<RequestPetsMessageEvent> {
@Override
    public RequestPetsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RequestPetsMessageEvent();
    }
}
