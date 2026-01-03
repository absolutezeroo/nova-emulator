package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.TryPhoneNumberMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses TryPhoneNumber packet from client.
 */
@ParsesPacket(Incoming.TRY_PHONE_NUMBER)
public class TryPhoneNumberParser extends PacketParser<TryPhoneNumberMessageEvent> {
@Override
    public TryPhoneNumberMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new TryPhoneNumberMessageEvent();
    }
}
