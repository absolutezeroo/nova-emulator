package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.ChatReviewSessionDetachedMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes ChatReviewSessionDetached packet for client.
 */
@ComposesPacket(Outgoing.CHAT_REVIEW_SESSION_DETACHED)
public class ChatReviewSessionDetachedComposer extends PacketComposer<ChatReviewSessionDetachedMessage> {
@Override
    protected void write(PacketBuffer packet, ChatReviewSessionDetachedMessage message) {
        // No fields to write
    }
}
