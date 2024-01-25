package com.opencagedata.jopencage;
/**
 * HttpClientErrorException
 *
 * @author Arnaud
 * @since 3.0
 */

public class HttpClientErrorException extends JOpenCageException {
    /**
     * Creates a new HttpClientErrorException with a <tt>null</tt> detail message.
     */
    public HttpClientErrorException() {
        super();
    }

    /**
     * Creates a new HttpClientErrorException with the specified detail message.
     *
     * @param message The error message
     */
    public HttpClientErrorException(String message) {
        super(message);
    }

    /**
     * Creates a new HttpClientErrorException with the specified detail message and its Throwable cause.
     *
     * @param message The error message
     * @param cause The cause
     */
    public HttpClientErrorException(String message, Throwable cause) {
        super(message, cause);
    }
}
