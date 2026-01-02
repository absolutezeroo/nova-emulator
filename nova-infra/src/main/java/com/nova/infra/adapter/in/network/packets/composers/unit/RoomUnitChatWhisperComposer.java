package com.nova.infra.adapter.in.network.packets.composers.unit;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.unit.RoomUnitChatWhisperMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes RoomUnitChatWhisper packet for client.
 */
@ComposesPacket(Outgoing.UNIT_CHAT_WHISPER)
public class RoomUnitChatWhisperComposer extends PacketComposer<RoomUnitChatWhisperMessage> {
@Override
    protected void write(PacketBuffer packet, RoomUnitChatWhisperMessage message) {
        // No fields to write
    }
}
