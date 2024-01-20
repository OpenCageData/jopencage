package com.opencagedata.jopencage;
/**
 * HttpUnauthenticatedException
 *
 * @author Arnaud
 * @since 3.0
 */

public class HttpUnauthenticatedException extends HttpException {
    /**
     * Creates a new HttpUnauthenticatedException with a <tt>null</tt> detail message.
     */
    public HttpUnauthenticatedException() {
        super();
    }

    /**
     * Creates a new HttpUnauthenticatedException with the specified detail message.
     *
     * @param message The error message
     */
    public HttpUnauthenticatedException(String message) {
        super(message);
    }
}
