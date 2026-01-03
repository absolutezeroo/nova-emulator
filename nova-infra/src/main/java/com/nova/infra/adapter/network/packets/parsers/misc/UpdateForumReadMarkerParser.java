package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.UpdateForumReadMarkerMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses UpdateForumReadMarker packet from client.
 */
@ParsesPacket(Incoming.UPDATE_FORUM_READ_MARKER)
public class UpdateForumReadMarkerParser extends PacketParser<UpdateForumReadMarkerMessageEvent> {
@Override
    public UpdateForumReadMarkerMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new UpdateForumReadMarkerMessageEvent();
    }
}
