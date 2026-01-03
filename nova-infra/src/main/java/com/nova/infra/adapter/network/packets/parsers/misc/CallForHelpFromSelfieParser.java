package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.CallForHelpFromSelfieMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

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
