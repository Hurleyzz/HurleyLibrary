package com.hurley.library.utils.codec;

/**
 * Created by hurley, Date on 2019-04-25.
 */
/**
 * Defines common encoding methods for String encoders.
 *
 * @version $Id$
 */
public interface StringEncoder extends Encoder {

    /**
     * Encodes a String and returns a String.
     *
     * @param source
     *            the String to encode
     * @return the encoded String
     * @throws org.apache.commons.codec.EncoderException
     *             thrown if there is an error condition during the encoding process.
     */
    String encode(String source) throws EncoderException;
}

