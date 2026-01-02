package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.CallForHelpFromSelfieMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses CallForHelpFromSelfie packet from client.
 */
@ParsesPacket(Incoming.CALL_FOR_HELP_FROM_SELFIE)
public class CallForHelpFromSelfieParser extends PacketParser<CallForHelpFromSelfieMessageEvent> {
@Override
    public CallForHelpFromSelfieMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new CallForHelpFromSelfieMessageEvent();
    }
}
