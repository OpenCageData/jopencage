package com.opencagedata.jopencage;
/**
 * HttpTooManyRequestException
 *
 * @author Arnaud
 * @since 3.0
 */

public class HttpTooManyRequestsException extends HttpException {
    /**
     * Creates a new HttpTooManyRequestException with a <tt>null</tt> detail message.
     */
    public HttpTooManyRequestsException() {
        super();
    }

    /**
     * Creates a new HttpTooManyRequestException with the specified detail message.
     *
     * @param message The error message
     */
    public HttpTooManyRequestsException(String message) {
        super(message);
    }
}
