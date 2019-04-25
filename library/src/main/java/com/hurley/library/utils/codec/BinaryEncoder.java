package com.hurley.library.utils.codec;

/**
 * Created by hurley, Date on 2019-04-25.
 */
/**
 * Defines common encoding methods for byte array encoders.
 *
 * @version $Id$
 */
public interface BinaryEncoder extends Encoder {

    /**
     * Encodes a byte array and return the encoded data as a byte array.
     *
     * @param source
     *            Data to be encoded
     * @return A byte array containing the encoded data
     * @throws EncoderException
     *             thrown if the Encoder encounters a failure condition during the encoding process.
     */
    byte[] encode(byte[] source) throws EncoderException;
}
