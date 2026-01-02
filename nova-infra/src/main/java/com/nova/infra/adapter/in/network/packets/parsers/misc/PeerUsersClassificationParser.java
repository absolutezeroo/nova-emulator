package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.PeerUsersClassificationMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses PeerUsersClassification packet from client.
 */
@ParsesPacket(Incoming.PEER_USERS_CLASSIFICATION)
public class PeerUsersClassificationParser extends PacketParser<PeerUsersClassificationMessageEvent> {
@Override
    public PeerUsersClassificationMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new PeerUsersClassificationMessageEvent();
    }
}
