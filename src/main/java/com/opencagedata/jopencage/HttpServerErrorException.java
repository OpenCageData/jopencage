package com.opencagedata.jopencage;

/**
 * HttpServerErrorException
 *
 * @author Arnaud
 * @since 3.0
 */
public class HttpServerErrorException extends JOpenCageException {

    /**
     * Creates a new HttpServerErrorException with a <tt>null</tt> detail message.
     */
    public HttpServerErrorException() {
        super();
    }

    /**
     * Creates a new HttpServerErrorException with the specified detail message.
     *
     * @param message The error message
     */
    public HttpServerErrorException(String message) {
        super(message);
    }

}
