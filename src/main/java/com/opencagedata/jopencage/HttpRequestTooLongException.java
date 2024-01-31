package com.opencagedata.jopencage;
/**
 * HttpRequestTooLongException
 *
 * @author Arnaud
 * @since 3.0
 */

public class HttpRequestTooLongException extends JOpenCageException {
    /**
     * Creates a new HttpRequestTooLongException with a <tt>null</tt> detail message.
     */
    public HttpRequestTooLongException() {
        super();
    }

    /**
     * Creates a new HttpRequestTooLongException with the specified detail message.
     *
     * @param message The error message
     */
    public HttpRequestTooLongException(String message) {
        super(message);
    }
}
