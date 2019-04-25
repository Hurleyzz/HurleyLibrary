package com.hurley.library.utils.codec;

/**
 * Created by hurley, Date on 2019-04-25.
 */
/**
 * Defines common decoding methods for String decoders.
 *
 * @version $Id$
 */
public interface StringDecoder extends Decoder {

    /**
     * Decodes a String and returns a String.
     *
     * @param source
     *            the String to decode
     * @return the encoded String
     * @throws org.apache.commons.codec.DecoderException
     *             thrown if there is an error condition during the Encoding process.
     */
    String decode(String source) throws DecoderException;
}