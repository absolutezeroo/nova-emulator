package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.SetPhoneNumberVerificationStatusMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

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
