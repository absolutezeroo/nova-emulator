package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.ChatReviewSessionStartedMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes ChatReviewSessionStarted packet for client.
 */
@ComposesPacket(Outgoing.CHAT_REVIEW_SESSION_STARTED)
public class ChatReviewSessionStartedComposer extends PacketComposer<ChatReviewSessionStartedMessage> {
@Override
    protected void write(PacketBuffer packet, ChatReviewSessionStartedMessage message) {
        // No fields to write
    }
}
