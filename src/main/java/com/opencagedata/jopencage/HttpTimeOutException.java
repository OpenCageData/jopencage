package com.opencagedata.jopencage;
/**
 * HttpTimeOutException
 *
 * @author Arnaud
 * @since 3.0
 */

public class HttpTimeOutException extends HttpException {
    /**
     * Creates a new HttpTimeOutException with a <tt>null</tt> detail message.
     */
    public HttpTimeOutException() {
        super();
    }

    /**
     * Creates a new HttpTimeOutException with the specified detail message.
     *
     * @param message The error message
     */
    public HttpTimeOutException(String message) {
        super(message);
    }
}
