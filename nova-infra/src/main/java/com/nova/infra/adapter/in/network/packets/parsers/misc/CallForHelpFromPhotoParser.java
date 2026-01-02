package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.CallForHelpFromPhotoMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses CallForHelpFromPhoto packet from client.
 */
@ParsesPacket(Incoming.CALL_FOR_HELP_FROM_PHOTO)
public class CallForHelpFromPhotoParser extends PacketParser<CallForHelpFromPhotoMessageEvent> {
@Override
    public CallForHelpFromPhotoMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new CallForHelpFromPhotoMessageEvent();
    }
}
