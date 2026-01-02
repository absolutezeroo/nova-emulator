package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetGiftWrappingConfigurationMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GetGiftWrappingConfiguration packet from client.
 */
@ParsesPacket(Incoming.GET_GIFT_WRAPPING_CONFIG)
public class GetGiftWrappingConfigurationParser extends PacketParser<GetGiftWrappingConfigurationMessageEvent> {
@Override
    public GetGiftWrappingConfigurationMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetGiftWrappingConfigurationMessageEvent();
    }
}
