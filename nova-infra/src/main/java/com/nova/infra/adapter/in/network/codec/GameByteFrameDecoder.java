package com.nova.infra.adapter.in.network.codec;

import io.netty.handler.codec.LengthFieldBasedFrameDecoder;

/**
 * Frame decoder that extracts complete packets from the byte stream.
 * <p>
 * Habbo packet structure:
 * - 4 bytes: Length (big-endian integer, indicates the size of remaining data)
 * - 2 bytes: Header ID (packet type identifier)
 * - N bytes: Packet body (variable length based on packet type)
 * <p>
 * This decoder reads the 4-byte length field to determine packet boundaries,
 * then strips the length field before passing to the next handler.
 */
public class GameByteFrameDecoder extends LengthFieldBasedFrameDecoder {

    private static final int MAX_PACKET_LENGTH = 417792;
    private static final int LENGTH_FIELD_OFFSET = 0;
    private static final int LENGTH_FIELD_LENGTH = 4;
    private static final int LENGTH_FIELD_ADJUSTMENT = 0;
    private static final int INITIAL_BYTES_TO_STRIP = 4;

    public GameByteFrameDecoder() {
        super(MAX_PACKET_LENGTH, LENGTH_FIELD_OFFSET, LENGTH_FIELD_LENGTH,
              LENGTH_FIELD_ADJUSTMENT, INITIAL_BYTES_TO_STRIP);
    }
}
