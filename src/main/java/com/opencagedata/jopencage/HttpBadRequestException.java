package com.opencagedata.jopencage;
/**
 * HttpBadRequestException
 *
 * @author Arnaud
 * @since 3.0
 */

public class HttpBadRequestException extends HttpException {
    /**
     * Creates a new HttpBadRequestException with a <tt>null</tt> detail message.
     */
    public HttpBadRequestException() {
        super();
    }

    /**
     * Creates a new HttpBadRequestException with the specified detail message.
     *
     * @param message The error message
     */
    public HttpBadRequestException(String message) {
        super(message);
    }
}
