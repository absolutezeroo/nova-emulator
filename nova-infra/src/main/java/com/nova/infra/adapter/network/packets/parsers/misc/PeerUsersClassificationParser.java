package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.PeerUsersClassificationMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

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
