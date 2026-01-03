package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.ChatReviewSessionResultsMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes ChatReviewSessionResults packet for client.
 */
@ComposesPacket(Outgoing.CHAT_REVIEW_SESSION_RESULTS)
public class ChatReviewSessionResultsComposer extends PacketComposer<ChatReviewSessionResultsMessage> {
@Override
    protected void write(PacketBuffer packet, ChatReviewSessionResultsMessage message) {
        // No fields to write
    }
}
