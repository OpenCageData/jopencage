package com.opencagedata.jopencage;
/**
 * HttpForbiddenException
 *
 * @author Arnaud
 * @since 3.0
 */

public class HttpForbiddenException extends HttpException {
    /**
     * Creates a new HttpForbiddenException with a <tt>null</tt> detail message.
     */
    public HttpForbiddenException() {
        super();
    }

    /**
     * Creates a new HttpForbiddenException with the specified detail message.
     *
     * @param message The error message
     */
    public HttpForbiddenException(String message) {
        super(message);
    }
}
