package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.ChatReviewSessionVotingStatusMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes ChatReviewSessionVotingStatus packet for client.
 */
@ComposesPacket(Outgoing.CHAT_REVIEW_SESSION_VOTING_STATUS)
public class ChatReviewSessionVotingStatusComposer extends PacketComposer<ChatReviewSessionVotingStatusMessage> {
@Override
    protected void write(PacketBuffer packet, ChatReviewSessionVotingStatusMessage message) {
        // No fields to write
    }
}
