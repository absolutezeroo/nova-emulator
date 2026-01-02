package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.ChatReviewSessionStartedMessage;

/**
 * Composes ChatReviewSessionStarted packet for client.
 */
public class ChatReviewSessionStartedComposer extends PacketComposer<ChatReviewSessionStartedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.CHAT_REVIEW_SESSION_STARTED;
    }

    @Override
    protected void write(PacketBuffer packet, ChatReviewSessionStartedMessage message) {
        // No fields to write
    }
}
