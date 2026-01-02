package com.nova.infra.adapter.in.network.codec;

/**
 * Passthrough implementation of MessageEncoder.
 * <p>
 * This encoder handles ServerMessage objects directly (no conversion needed).
 * For domain DTOs, this should be extended to map them to proper ServerMessages.
 */
public class PassthroughMessageEncoder implements MessageEncoder {

    @Override
    public ServerMessage encode(Object response) {
        if (response instanceof ServerMessage serverMessage) {
            return serverMessage;
        }

        throw new IllegalArgumentException(
                "Unsupported response type: " + response.getClass().getName() +
                ". Expected ServerMessage or register a custom encoder for this type.");
    }
}
