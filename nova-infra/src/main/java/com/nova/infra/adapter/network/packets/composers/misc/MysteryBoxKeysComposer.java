package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.MysteryBoxKeysMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes MysteryBoxKeys packet for client.
 */
@ComposesPacket(Outgoing.MYSTERY_BOX_KEYS)
public class MysteryBoxKeysComposer extends PacketComposer<MysteryBoxKeysMessage> {
@Override
    protected void write(PacketBuffer packet, MysteryBoxKeysMessage message) {
        packet.appendString(message.boxColor());
        packet.appendString(message.keyColor());
    }
}
