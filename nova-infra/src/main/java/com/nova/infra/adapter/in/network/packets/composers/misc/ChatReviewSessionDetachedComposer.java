package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.ChatReviewSessionDetachedMessage;

/**
 * Composes ChatReviewSessionDetached packet for client.
 */
public class ChatReviewSessionDetachedComposer extends PacketComposer<ChatReviewSessionDetachedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.CHAT_REVIEW_SESSION_DETACHED;
    }

    @Override
    protected void write(PacketBuffer packet, ChatReviewSessionDetachedMessage message) {
        // No fields to write
    }
}
