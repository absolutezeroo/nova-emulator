package com.nova.infra.adapter.network.packets.parsers.user;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.user.GetExtendedProfileByNameMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GetExtendedProfileByName packet from client.
 */
@ParsesPacket(Incoming.USER_PROFILE_BY_NAME)
public class GetExtendedProfileByNameParser extends PacketParser<GetExtendedProfileByNameMessageEvent> {
@Override
    public GetExtendedProfileByNameMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetExtendedProfileByNameMessageEvent();
    }
}
