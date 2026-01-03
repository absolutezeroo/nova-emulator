package com.nova.infra.adapter.network.packets.composers.unit;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.unit.RoomUnitChatWhisperMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

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
