package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.SetPhoneNumberVerificationStatusMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses SetPhoneNumberVerificationStatus packet from client.
 */
@ParsesPacket(Incoming.SET_PHONE_NUMBER_VERIFICATION_STATUS)
public class SetPhoneNumberVerificationStatusParser extends PacketParser<SetPhoneNumberVerificationStatusMessageEvent> {
@Override
    public SetPhoneNumberVerificationStatusMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new SetPhoneNumberVerificationStatusMessageEvent();
    }
}
