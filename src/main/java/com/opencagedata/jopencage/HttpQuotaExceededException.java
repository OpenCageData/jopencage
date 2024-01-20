package com.opencagedata.jopencage;
/**
 * HttpQuotaExceededException
 *
 * @author Arnaud
 * @since 3.0
 */

public class HttpQuotaExceededException extends HttpException {
    /**
     * Creates a new HttpQuotaExceededException with a <tt>null</tt> detail message.
     */
    public HttpQuotaExceededException() {
        super();
    }

    /**
     * Creates a new HttpQuotaExceededException with the specified detail message.
     *
     * @param message The error message
     */
    public HttpQuotaExceededException(String message) {
        super(message);
    }
}
