package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.ChatReviewSessionOfferedToGuideMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes ChatReviewSessionOfferedToGuide packet for client.
 */
@ComposesPacket(Outgoing.CHAT_REVIEW_SESSION_OFFERED_TO_GUIDE)
public class ChatReviewSessionOfferedToGuideComposer extends PacketComposer<ChatReviewSessionOfferedToGuideMessage> {
@Override
    protected void write(PacketBuffer packet, ChatReviewSessionOfferedToGuideMessage message) {
        // No fields to write
    }
}
